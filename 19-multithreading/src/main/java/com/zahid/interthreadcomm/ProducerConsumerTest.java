package com.zahid.interthreadcomm;

public class ProducerConsumerTest {

	public static void main(String[] args) {
		SharedData sd = new SharedData();
		
		ProducerThread pThread = new ProducerThread(sd);
		ConsumerThread cThread = new ConsumerThread(sd);
		
		pThread.start();
		cThread.start();

	}

}
