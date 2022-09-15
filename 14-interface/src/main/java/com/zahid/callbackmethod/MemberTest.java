package com.zahid.callbackmethod;

public class MemberTest {

	public static void main(String[] args) {
		
		Store s = new Store();
		
		Customer c1 = new Customer("Zahid");
		Customer c2 = new Customer("Jewel");
		Customer c3 = new Customer("Robi");
		
		s.register(c1);
		s.register(c2);
		s.register(c3);
		
		s.notifyCustomer();

	}

}
