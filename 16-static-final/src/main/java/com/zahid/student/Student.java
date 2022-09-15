package com.zahid.student;

import java.util.*;

public class Student {
	public String name;
	public String subject;
	public String rollNumber;
	
	private static int count = 1;
	
	public Student(String name, String subject) {
		this.name = name;
		this.subject = subject;
		this.rollNumber = generateRollNumber(); 
	}

	private String generateRollNumber() {
		
		Date d = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(d);
		int year = calendar.get(Calendar.YEAR);
		
		String rn = String.format("S%d05%03d", year, count);
		count++;
		
		return rn;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", subject=" + subject + ", rollNumber=" + rollNumber + "]";
	}
	
}
