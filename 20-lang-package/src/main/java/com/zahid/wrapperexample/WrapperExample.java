package com.zahid.wrapperexample;

public class WrapperExample {

	public static void main(String[] args) {
		
//		int i = 10;  // primitive
		
//		Integer num = new Integer(10);
//		System.out.println(num);
		
//		Integer num1 = Integer.valueOf(10);
//		Integer num1 = Integer.valueOf("10");
//		Integer num1 = 10;
//		System.out.println(num1);
		
//		Byte c = 15;
//		Byte d = Byte.valueOf("15");
//		System.out.println(d);
		
//		byte b = 15;
//		Byte e = Byte.valueOf(15); // invalid
//		Byte e = Byte.valueOf(b);
//		System.out.println(e);
		
		Short f = Short.valueOf("123");
		Float g = 12.3f;
		Float h = Float.valueOf("1234.5");
		
		Double j =  Double.valueOf("3.14159");
		Character k = Character.valueOf('A');
		Boolean l = Boolean.valueOf("true");
		
		System.out.println(h);
		float m = h.floatValue();
		System.out.println(m);
		int n = h.intValue();
		System.out.println(n);
		float p = h;
		System.out.println(p);
	}

}
