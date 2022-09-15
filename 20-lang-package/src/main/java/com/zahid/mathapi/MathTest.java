package com.zahid.mathapi;

public class MathTest {

	public static void main(String[] args) {
		System.out.println(Math.abs(-123));
		System.out.println(StrictMath.abs(-123));
		System.out.println(Math.sqrt(64));
		System.out.println(Math.cbrt(64));
		System.out.println(Math.decrementExact(7));
		System.out.println(Math.getExponent(492.357816f));
		System.out.println(Math.getExponent(492));
		System.out.println(Math.getExponent(49));
		System.out.println();
		
		System.out.println(Math.floor(4.9));
		System.out.println(Math.ceil(4.9));
		System.out.println(Math.floorDiv(50, 9));
		System.out.println(Math.exp(1));
		System.out.println(StrictMath.exp(1));
		System.out.println(Math.log10(100));
		System.out.println();
		
		System.out.println(Math.max(4, 9));
		System.out.println(Math.min(4, 9));
		System.out.println(Math.tan(Math.PI*0.25));
		System.out.println(Math.toRadians(90));
		System.out.println(Math.toRadians(180));
		System.out.println(Math.toDegrees(Math.asin(1)));
		System.out.println(Math.toDegrees(Math.acos(1)));
		System.out.println(Math.toDegrees(Math.atan(1)));
		System.out.println(Math.toDegrees(Math.tanh(1)));
		System.out.println(StrictMath.toDegrees(StrictMath.tanh(1)));
		
		System.out.println();
		System.out.println(Math.random());
		System.out.println(Math.random()*100);
		System.out.println(Math.pow(4, 9));
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.multiplyExact(100, 200));
		System.out.println(Math.nextAfter(12.5, 13));
		System.out.println(Math.nextAfter(12.5, 11));
		
		System.out.println(Math.PI);
		System.out.println(Math.E);
	}

}
