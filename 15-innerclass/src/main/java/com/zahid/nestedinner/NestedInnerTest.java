package com.zahid.nestedinner;

public class NestedInnerTest {

	public static void main(String[] args) {
		Outer out = new Outer();
		out.outerDisplay();
		System.out.println();
		
		Outer.Inner outin = new Outer().new Inner();
		outin.innerDisplay();
	}

}
