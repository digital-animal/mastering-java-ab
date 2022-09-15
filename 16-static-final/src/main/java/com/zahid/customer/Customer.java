package com.zahid.customer;


import java.util.*;

public class Customer {
	public String name;
	public String customerID;
	private static int count = 1;
	
	public Customer(String name) {
		this.name = name;
		this.customerID = generateCustomerID();
	}
	
	private String generateCustomerID() {
		
		Date today = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(today);
		int year = cal.get(Calendar.YEAR);
		
		String ID = String.format("C%d%03d", year, count++);
		
		return ID;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", customerID=" + customerID + "]";
	}
	
}