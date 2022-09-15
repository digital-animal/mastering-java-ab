package com.zahid.interthreadcomm;

public class SharedData {
	public int value = 0;
	public static boolean isConsumed = false;
	
	synchronized void setValue(int v) {
		while(isConsumed!=true)
		{
			try {
				wait();
			} catch (InterruptedException e) {
	
				System.out.println(e);
			}			
		}
		value = v;
		isConsumed = false;
		notify();
	}
	
	synchronized int getValue() { // consumer
		int x = 0;
		while(isConsumed!=false) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				System.out.println(e);
			}
		}
		x = value;
		isConsumed = true;
		notify();
		
		return x;
	}
}
