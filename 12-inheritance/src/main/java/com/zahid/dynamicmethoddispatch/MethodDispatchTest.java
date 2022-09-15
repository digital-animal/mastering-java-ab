package com.zahid.dynamicmethoddispatch;

/**
 * Dynamice Method Dispatch:
 * When a super class(base class/parent class) reference is holding
 * an object of sub class(derived class/child class) object and the
 * overrided method is called, then the method of the object's class
 * i.e. sub class or derived class or child class is called, not the 
 * method of the reference's class i.e. super class or base class or 
 * parent class.
 */

public class MethodDispatchTest {

	public static void main(String[] args) {
		Base ref1 = new Base();
		ref1.display();
		System.out.println();
		
		Base ref2 = new Derived();
		ref2.display();
		System.out.println();
		
		Derived ref3 = new Derived();
		ref3.display();

	}

}
