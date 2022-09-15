package com.zahid.nestedinner;

public class Outer {
	// public int x = 10;
	public static int x = 10;
	Inner in = new Inner();
	
	public class Inner {
		public int y = 20;
		
		public void innerDisplay() {
			System.out.println("x = "+x);
			System.out.println("y = "+y);
		}
	}
	
	public void outerDisplay() {
//		Inner in = new Inner();
		in.innerDisplay();
		System.out.println("in.y = " + in.y);
	}
}
