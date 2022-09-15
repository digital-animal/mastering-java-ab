package com.zahid.atmmachine;

public class TestATM {

	public static void main(String[] args) {
		ATM atm = ATM.getInstance();
		
		CustomerThread c1 = new CustomerThread("Zahid", 2000, atm);
		CustomerThread c2 = new CustomerThread("Robi", 1500, atm);
		CustomerThread c3 = new CustomerThread("Jewel", 1200, atm);
		CustomerThread c4 = new CustomerThread("Tonmoy", 1000, atm);
		CustomerThread c5 = new CustomerThread("Hasan", 2500, atm);

		c1.start();
		c2.start();
		c3.start();
		c4.start(); 
		c5.start();

	}

}
