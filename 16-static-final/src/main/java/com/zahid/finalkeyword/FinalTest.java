package com.zahid.finalkeyword;

// final class cannot be extended
public final class FinalTest {

	// final variables cannot be modified
	public final double EXP = 2.718281828459045;

	// final methods cannot be overrided
	public final void display() {
		System.out.println("# Inside Final Method: display()");
		System.out.println("# Final Variable EXP = " + EXP);
	}

	public static void main(String[] args) {
		FinalTest ft = new FinalTest();
		ft.display();
	}
}
