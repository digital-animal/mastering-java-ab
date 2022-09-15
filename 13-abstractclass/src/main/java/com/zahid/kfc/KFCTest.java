package com.zahid.kfc;

public class KFCTest {
	public static void main(String[] args) {
		KFC f = new KFCBangladesh();
		
		f.makeItem();
		f.billing();
		f.offer();
//		f.festiveOffer(); // invalid
		System.out.println();
		
		KFCBangladesh f2 = new KFCBangladesh();
		
		f2.makeItem();
		f2.billing();
		f2.offer();
		f2.festiveOffer(); // valid
		System.out.println();
	}
}
