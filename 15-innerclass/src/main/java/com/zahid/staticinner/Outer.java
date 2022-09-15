package com.zahid.staticinner;

public class Outer {
	public static int x = 10;
	public int y = 20;
	
	public static class Inner {
		public void display() {
			System.out.println("x = "+x);
//			System.out.println("y = "+y); // invalid as x is non-static
		}
	}
}
