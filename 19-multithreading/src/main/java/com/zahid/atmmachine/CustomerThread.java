package com.zahid.atmmachine;

public class CustomerThread extends Thread {
	public ATM atm;
	String name;
	double amount;
	
	public CustomerThread(String name, double amount, ATM atm) {
		this.atm = atm; 
		this.name = name;
		this.amount = amount;
	}

	public void useATM() {
//		System.out.println(atm.hashCode());
//		System.out.println(this.atm.hashCode());
//		System.out.println(this);
		
		atm.checkBalance(this.name);
		atm.withdrawBalance(this.name, this.amount);
//		System.out.println();
	}

	@Override
	public void run() {
		useATM();
	}
	
	

}
