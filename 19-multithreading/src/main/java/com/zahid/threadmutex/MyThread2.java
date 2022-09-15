package com.zahid.threadmutex;

public class MyThread2 extends Thread {
	MyData d;

	public MyThread2(MyData d) {
		this.d = d;
	}

	@Override
	public void run() {
		d.display("Welcome to Java");
	}

}
