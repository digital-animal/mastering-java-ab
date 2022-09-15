package com.zahid.callbackmethod;

public class Customer implements Member {
	public String name;
	
	public Customer(String name) {
		this.name = name;
	}

	@Override
	public void callback() {
		System.out.printf("OKay, I'll visit. [%s] \n", this.name);		
	}
	
}
