package com.zahid.atmmachine;

public class ATM {
	
	private static ATM atmInstance = null;
	
	private ATM() {
		// pass
	}
	
	// # # # without synchronization
	/*
	public void checkBalance(String name) {
		System.out.print(name + " checking.. ");
		try {
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			
			System.out.println(e);
		}
		System.out.println("balance");
	}
	
	 public void withdrawBalance(String name, double amount) {
		System.out.print(name + " is withdrawing.. ");
		
		try {
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			
			System.out.println(e);
		}
		
		System.out.println("balance "+ amount);
	}*/
	
	
	// # # # with method synchronization
	synchronized public void checkBalance(String name) {
		System.out.print(name + " checking.. ");
		try {
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			
			System.out.println(e);
		}
		System.out.println("balance");
	}
	
	synchronized public void withdrawBalance(String name, double amount) {
		System.out.print(name + " is withdrawing.. ");
		
		try {
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			
			System.out.println(e);
		}
		
		System.out.println("balance "+ amount);
	}
	

	public static ATM getInstance() {
		if(ATM.atmInstance == null) {
			atmInstance = new ATM();
		}
		return atmInstance;
	}
}
