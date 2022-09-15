package com.zahid.throwexample;

public class ThrowsDemo {
	
	public static int division(int x, int y) throws ArithmeticException {
		int result;
		result = x / y;
		
		return result;
	}
	
	public static void callingMethod() {
		try {
			int output = division(10, 0);			
			System.out.println("Output = "+output);
			
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		callingMethod();

	}

}
