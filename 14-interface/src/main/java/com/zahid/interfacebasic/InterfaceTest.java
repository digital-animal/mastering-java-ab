package com.zahid.interfacebasic;

public class InterfaceTest {

	public static void main(String[] args) {
//		Test t = new Test(); // invalid
		Test t = new TestConcrete(); // valid
		t.methodA();
		t.methodB();
		// t.method2(); // invalid
		System.out.println();
		
		TestConcrete t2 = new TestConcrete(); // valid
		t2.methodA();
		t2.methodB();
		t2.methodC();
		System.out.println();
	}

}
