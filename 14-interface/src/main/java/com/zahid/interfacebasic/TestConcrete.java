package com.zahid.interfacebasic;

public class TestConcrete implements Test {

	@Override
	public void methodA() {
		System.out.println("Method A Implemented");
	}

	@Override
	public void methodB() {
		System.out.println("Method B Implemented");
	}
	
	public void methodC() {
		System.out.println("Mehotd C of TestConcrete Class");
	}
	
}
