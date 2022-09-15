package com.zahid.floatwrapper;

public class FloatWrapper {

	public static void main(String[] args) {
//		float a = 4.92f;
//		Float b = 4.92f;
//		System.out.println(b.equals(a));
		
		Float c = 12.5f/0;
		System.out.println(c.isNaN());
		System.out.println(c.isInfinite());
		System.out.println(Float.POSITIVE_INFINITY);
		System.out.println(Float.NEGATIVE_INFINITY);
		System.out.println(Float.MAX_EXPONENT);
		System.out.println(Float.MIN_EXPONENT);
		System.out.println(Float.NaN);
		
		System.out.println(Math.sqrt(-1));
		Float d = (float)Math.sqrt(-5);
		System.out.println(d.isNaN());
		
	}

}
