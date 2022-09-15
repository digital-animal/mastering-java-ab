package com.zahid.staticblock;

public class StaticBlockTest {
	
	static {
		System.out.println("Block 1");
	}

	public static void main(String[] args) {
		System.out.println("Main Block");
		
		StaticBlock sb = new StaticBlock();

	}
	
	static {
		System.out.println("Block 2");
	}

}
 