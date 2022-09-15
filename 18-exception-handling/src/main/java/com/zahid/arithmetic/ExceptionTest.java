package com.zahid.arithmetic;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Entet two numbers> ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		int c;
		try {
			c = a / b;			
			System.out.println(c);
			
		} catch(ArithmeticException e) {
			// System.out.println(e);
			// e.printStackTrace();
			System.out.println("Denominator cannot be 0, try again");
		} finally {
			sc.close();
		}
		
		System.out.println("Bye");
	}
}
