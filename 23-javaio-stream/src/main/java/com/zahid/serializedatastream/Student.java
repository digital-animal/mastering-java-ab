package com.zahid.serializedatastream;

public class Student {
	public int roll;
	public String name;
	public String dept;
	
	public Student() {
		// pass
	}

	public Student(int roll, String name, String dept) {
		
		this.roll = roll;
		this.name = name;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", dept=" + dept + "]";
	}
	
	
}
