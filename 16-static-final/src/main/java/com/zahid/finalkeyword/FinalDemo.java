package com.zahid.finalkeyword;

public class FinalDemo {
	final float GAMMA;
	
	public FinalDemo() {
		GAMMA = 1.67f;
	}

	static final float E;
	final float M; // non-static i.e. instance variable
	
	// static block
	static {
		E = 2.718281828459045f;
	}
	
	// instance block
	{
		M = 1.23456789f;
	}
	
	public static void main(String[] args) {
		final float PI = 3.14159265358f;
		
		System.out.println("PI = "+PI);
		System.out.println("E = "+E);
		
		FinalDemo fd = new FinalDemo();
		
		System.out.println("M = "+fd.M);
		System.out.println("GAMMA = "+fd.GAMMA);

	}
	

}
