package com.zahid.throwexample;

public class ThrowExample {
	public static int getArea(int l, int b) throws NegativeDimensionException {
		int area;
		
		if(l<0 || b<0) {			
			// throw new Exception("Dimension cannot be less than 0\n");
			throw new NegativeDimensionException();
		}
		area = l*b;
		return area;
	}
	
	public static void callingMethod() {
		int area;
		try {
			// area = getArea(4, 9);	
			area = getArea(4, -9);
			System.out.println("Area = "+area);
			
		} catch(NegativeDimensionException e) {
			// System.out.println(e.getMessage());
			System.out.println(e);
		} finally {
			System.out.println("Finally Block Executed");
		}
	}

	public static void main(String[] args) {
		callingMethod();

	}

}
