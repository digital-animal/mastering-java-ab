package com.zahid.annotation2;

public class OldClass {
	
	public void display() {
		System.out.println("Hello");
	}
	
	@Deprecated
	public void show() {
		System.out.println("Hi");
	}
}
