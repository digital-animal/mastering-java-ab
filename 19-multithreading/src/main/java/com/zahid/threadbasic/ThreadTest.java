package com.zahid.threadbasic;

public class ThreadTest extends Thread {
	
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
		ThreadTest t = new ThreadTest();
		t.start();
		
		int i = 1;
		
		while(true) {
			System.out.println(i+" Good Bye");
			i++;
			if(i==100) break;
		}
	}
}
