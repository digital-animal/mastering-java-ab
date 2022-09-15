package com.zahid.multiplecatch;

import java.util.Arrays;

public class MultipleCatch {

	public static void main(String[] args) {
		int[] A = {4, 9, 2, 3, 0};
		
		try {
			System.out.println(A[5]); // ArrayIndexOutOfBoundsException
			int c=A[0]/A[4]; // ArithmeticException 		
			System.out.println("Division = " + c);

		} catch(ArithmeticException e1) {
			// System.out.println("Cannot divide by 0\n"+e1);
			System.out.println(e1.getMessage());

		} catch(ArrayIndexOutOfBoundsException e2) {
			// System.out.println("Index out of range \n"+e2);;
			System.out.println(e2.getMessage());

		} finally {
			System.out.print(Arrays.toString(A));
			System.out.println();
		}
	}
}

// more specifice exception to more generic exception