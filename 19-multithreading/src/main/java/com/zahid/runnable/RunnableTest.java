package com.zahid.runnable;

public class RunnableTest implements Runnable {
	
	@Override
	public void run() {
		int i = 1;
		
		while(true) {
			System.out.println(i+" Welcome");
			i++;
			if(i==100) break;
		}
		
	}
	
	public static void main(String[] args) {
		
		RunnableTest m = new RunnableTest();
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
