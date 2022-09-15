package com.zahid.threadmethod;

public class ThreadTest {

	public static void main(String[] args) {
		/*
//		Thread t = new Thread("My Thread");
//		Thread t = new Thread();
//		Thread t = new Thread(new MyRunnable(), "My Runnable");
//		MyThread t = new MyThread();
		MyThread t = new MyThread("My Thread 1");
		MyThread t1 = new MyThread();
		
		System.out.println("ID = "+t.getId());
		System.out.println("Name = "+t.getName());
		System.out.println("Priority = "+t.getPriority());
		System.out.println("State = "+t.getState());
		System.out.println("Is Alive = "+t.isAlive());
		System.out.println();
		
//		t1.start();
		System.out.println("ID = "+t1.getId());
		System.out.println("Name = "+t1.getName());
		System.out.println("Priority = "+t1.getPriority());
		t1.start();
		System.out.println("State = "+t1.getState());
		System.out.println("Is Alive = "+t1.isAlive());
		*/
		
		// # #  interrupt, setDaemon, join
		/*
//		MyThread t2 = new MyThread("My Thread 3");
//		t2.start();
//		t2.interrupt();
		
		MyThread t3 = new MyThread("My Thread 4");
		t3.setDaemon(true);
		t3.start();
		
//		try {
//			Thread.sleep(100);
//			
//		} catch(Exception e) {
//			System.out.println(e);
//		}
		
		Thread mainThread = Thread.currentThread();
		try {
			mainThread.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/
		
		// # # yield
		MyThread t5 = new MyThread();
		t5.start();
		int count = 1;
		while(true) {
			System.out.println(count++ +" Main Thread");
			Thread.yield();
		}
		
	}

}
