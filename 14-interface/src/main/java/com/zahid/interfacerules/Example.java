package com.zahid.interfacerules;

public class Example implements ITest2 {

	@Override
	public void methodA() {
		System.out.println("# Inside Example. methodA() implemented");
	}

	@Override
	public void methodB() {
		System.out.println("# Inside Example. methodB() implemented");
	}

	@Override
	public void methodD() {
		System.out.println("# Inside Example. methodD() implemented");
	}
	
}
