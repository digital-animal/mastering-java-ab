package com.zahid.runnable;

public class MyRunnableTest {

	public static void main(String[] args) {
		
		MyRunnable m = new MyRunnable();
		Thread t = new Thread(m);
		t.start();
		
		int i = 1;
		
		while(true) {
			System.out.println(i+" Java");
			i++;
			if(i==100) break;
		}
	}

}
