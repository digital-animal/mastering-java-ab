package com.zahid.anonymousinner;

public class Outer {
	public void methodA() {

		Test t = new Test(){
			@Override
			public void display() {
				System.out.println("Anonymous inner class inside Outer class");
			}
		};
		t.display();
	}
}
