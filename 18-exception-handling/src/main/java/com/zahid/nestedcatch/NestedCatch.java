package com.zahid.nestedcatch;

import java.util.Arrays;

public class NestedCatch {

	public static void main(String[] args) {
		int[] A = {4, 9, 2, 3, 0};
		
		try {
			// int c=A[0]/A[4]; // ArithmeticException 		
			int c=A[0]/A[2]; // ArithmeticException 		
			System.out.println("Division = " + c);

			try {
				System.out.println(A[5]); // ArrayIndexOutOfBoundsException
			
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println(e2.getMessage());
			}

		} catch(ArithmeticException e1) {
			// System.out.println("Cannot divide by 0\n"+e1);
			System.out.println(e1.getMessage());

		} finally {
			System.out.print(Arrays.toString(A));
			System.out.println();
		}
	}
}