package com.zahid.base;

public class AbstractTest {

	public static void main(String[] args) {
//		Base b = new Base(); // invalid
//		System.out.println();
		
		Derived d = new Derived(); // valid
		d.methodA();
		d.methodB();
		d.methodC();
		System.out.println();
		
		Base b1 = new Derived();  // valid
		b1.methodA();
		b1.methodB();
//		b1.methodC(); // invalid
		System.out.println();
	}

}
