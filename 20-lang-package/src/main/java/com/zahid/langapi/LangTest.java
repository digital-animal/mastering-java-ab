package com.zahid.langapi;

public class LangTest {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
//		System.out.println(obj1);
//		System.out.println(obj1.toString());
//		System.out.println(obj1.hashCode());
		
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		System.out.println();
		
		MyObject m1 = new MyObject();
		System.out.println(m1);
		System.out.println(m1.hashCode());
		
		MyObject2 m2 = new MyObject2();
		System.out.println(m2);
		System.out.println(m2.hashCode());
		
		System.out.println(m1 == m2); // comparing just reference
		System.out.println(m1.equals(m2)); // comparing objects

	}

}
