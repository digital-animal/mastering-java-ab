package com.zahid.localinner;

public class Outer {
	public void display() {
		class Inner {
			public void innerDisplay() {
				System.out.println("Inside Inner");
			}
		}
		// Inner in = new Inner();
		// in.innerDisplay();

		new Inner().innerDisplay(); // anonymous/nameless object
	}
}
