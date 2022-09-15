package com.zahid.account;

import java.util.*;

public class Account {
	public String accountNumber;
	public String name;
	private static int count = 1;
	
	public Account(String name) {
		this.name = name;
		this.accountNumber = generateAccountNumber();
	}
	
	private String generateAccountNumber() {
		Date today = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(today);
		
		int year = cal.get(Calendar.YEAR);
		String accNo = String.format("C%d%03d", year, count++);
		
		return accNo;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", accountNumber="+accountNumber +"]";
	}
	
}
