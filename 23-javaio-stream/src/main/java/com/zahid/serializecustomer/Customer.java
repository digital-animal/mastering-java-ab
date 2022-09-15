package com.zahid.serializecustomer;

import java.io.Serializable;

public class Customer implements Serializable {
	public String customerID;
	public String name;
	public String phoneNumber;
	
	public static int serial = 1;
	
	public Customer() {
		// pass
	}

	public Customer(String name, String phoneNumber) {
		
		this.customerID = Customer.generateID();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public static String generateID() {
		String newID = String.format("C%02d", serial);
		serial++;
		return newID;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}
	
}
