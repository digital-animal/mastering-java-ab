package com.zahid.interthreadcomm;

public class ProducerThread extends Thread {
	public SharedData data;

	public ProducerThread(SharedData data) {
		this.data = data;
	}

	@Override
	public void run() {
		int i = 1;
		
		while(true) {
			data.setValue(i);
			System.out.println("# Prouced: "+i);
			i++;
		}
	}
	
}
