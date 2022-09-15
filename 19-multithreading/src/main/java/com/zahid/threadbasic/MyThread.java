package com.zahid.threadbasic;

public class MyThread extends Thread {

	@Override
	public void run() {
		int i = 1;
		
		while(true) {
			System.out.println(i+" Hello");
			i++;
			if(i==100) break;
		}
	}
	
}
