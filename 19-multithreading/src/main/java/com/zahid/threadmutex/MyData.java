package com.zahid.threadmutex;

public class MyData {
	/*
	void display(String str) {

		synchronized(this) {
			
			for(int i=0; i<str.length(); i++) {
				System.out.print(str.charAt(i));
			}
		}
	}*/
	
	synchronized void display(String str) {

		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
	} 
 
}
