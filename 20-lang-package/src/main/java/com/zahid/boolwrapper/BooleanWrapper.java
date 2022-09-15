package com.zahid.boolwrapper;

public class BooleanWrapper {

	public static void main(String[] args) {
		Boolean b = true;

		System.out.println(Boolean.logicalAnd(true, false));
		System.out.println(Boolean.logicalOr(true, false));
		System.out.println(Boolean.logicalXor(true, true));

	}

}
