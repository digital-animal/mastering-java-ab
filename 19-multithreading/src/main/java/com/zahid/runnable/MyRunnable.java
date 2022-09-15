package com.zahid.runnable;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		int i = 1;
		
		while(true) {
			System.out.println(i+" Welcome");
			i++;
			if(i==100) break;
		}
		
	}

}
