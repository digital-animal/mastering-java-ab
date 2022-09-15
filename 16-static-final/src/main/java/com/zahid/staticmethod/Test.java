package com.zahid.staticmethod;

public class Test {
	public static int x = 10;
	int y = 20;
	
	// non-static method can access both static and non-static members
	public void show() {
		System.out.println("# Inside show() (non-static) method [" + this + "]");
		System.out.println("Static variable x = " + x);
		System.out.println("Non-static variable y = " + y);
		System.out.println();
	}
	
	// static method can only access static members
	public static void display() {
		System.out.println("# Inside display() (static) method [" + Class.class.hashCode() + "]");
		System.out.println("Static variable x = " + x);
		//		System.out.println(y); // invalid
		System.out.println();
	}
}
