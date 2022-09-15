package com.zahid.interthreadcomm;

public class ConsumerThread extends Thread {
	public SharedData data;

	public ConsumerThread(SharedData data) {
		this.data = data;
	}

	@Override
	public void run() {
		while(true) {
			System.out.println("# Consumed: "+ data.getValue());
		}
	}
}
