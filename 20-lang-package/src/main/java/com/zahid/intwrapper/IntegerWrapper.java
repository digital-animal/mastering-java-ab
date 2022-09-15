package com.zahid.intwrapper;

public class IntegerWrapper {

	public static void main(String[] args) {
//		int m1=15;
//	
//		Integer m2 = m1;
//		Integer m3 = 15;
//		System.out.println(m2.compareTo(m1));
//		System.out.println(m2.equals(m1));
//		System.out.println(m2.equals(m3));
//		
//		System.out.println(m2.hashCode());
//		System.out.println(m3.hashCode());
		
//		Integer m4 = Integer.valueOf("123");
//		Integer m5 = Integer.valueOf("1010101", 2);
//		Integer m6 = Integer.valueOf("ABC", 16);
//		Integer m7 = Integer.MAX_VALUE;
//		Integer m8 = Integer.MIN_VALUE;
//		
//		System.out.println(m4);
//		System.out.println(m5);
//		System.out.println(m6);
//		System.out.println(m7);
//		System.out.println(m8);
		
		Integer m9 = Integer.decode("0xA7");
		System.out.println(m9);
		
		Integer m10 = Integer.parseInt("492357816");
		System.out.println(m10);
		
		Integer m11 = Integer.reverse(m10);
		System.out.println(m11);
		
		System.out.println(Integer.reverse(100));
		System.out.println(Integer.reverseBytes(100));
		
		System.out.println(Integer.toBinaryString(492));
		System.out.println(Integer.toHexString(492));

	}

}
