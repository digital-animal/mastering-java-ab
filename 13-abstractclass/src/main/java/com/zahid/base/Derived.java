package com.zahid.base;

public class Derived extends Base {
	
	public Derived() {
		System.out.println("Derived Class Constructor");
	}
	
	@Override
	public void methodB() {
		System.out.println("Implemented Abstract Method B [Inside Derived Class]");
	}
	
	public void methodC() {
		System.out.println("Concrete Method C [Inside Derived Class]");
	}
	
}
