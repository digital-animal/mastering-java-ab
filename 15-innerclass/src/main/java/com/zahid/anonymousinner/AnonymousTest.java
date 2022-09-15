package com.zahid.anonymousinner;

public class AnonymousTest {

	public static void main(String[] args) {
		Outer out = new Outer();
		out.methodA();
		System.out.println();

		/* Test t = new Test(){
			@Override
			public void display() {
				System.out.println("Anonymous inner class inside AnonymousTest class");
			}
		};
		t.display(); */

		new Test(){
			@Override
			public void display() {
				System.out.println("Anonymous inner class inside AnonymousTest class");
			}
		}.display(); // anonymous object
	}

}
