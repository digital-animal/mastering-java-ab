package com.zahid.base;

public abstract class Base {
	public Base() {
		System.out.println("Base Class Constructor");
	}
	
	public void methodA() {
		System.out.println("Concrete Method A [Inside Base Class]");
	}
	
	public abstract void methodB();
}
