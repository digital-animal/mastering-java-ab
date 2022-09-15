package com.zahid.interfacerules;

public class InterfaceTest {

	public static void main(String[] args) {
		System.out.println("# ITest1.X = " + ITest1.X + ", static final(const)");
		ITest1.methodC();
		
		Example e = new Example();
		e.methodA();
		e.methodB();
		e.methodD();
		e.methodE();
	}
}
