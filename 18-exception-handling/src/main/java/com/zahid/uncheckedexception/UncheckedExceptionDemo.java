package com.zahid.uncheckedexception;

public class UncheckedExceptionDemo {
	
	public static void methodC() {
		System.out.println("Inside Method C");
		try {
			System.out.println(10/0);			
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());	
		}
	}
	
	public static void methodB() {
		System.out.println("Inside Method B");
		methodC();
	}
	
	public static void methodA() {
		System.out.println("Inside Method A");
		methodB();
	}
	
	public static void main(String[] args) {
		methodA();
	}  
}
