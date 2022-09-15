package com.zahid.genericobject;

public class GenericTest1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Object obj = new String("Hello World");
		System.out.println(obj);
		
		String str = (String) obj;
		System.out.println(str);
		
		obj = new Integer(4);
		System.out.println(obj);
		
		System.out.println();
		Object[] objArray = new Object[3];
		objArray[0] = "Hello";
		objArray[1] = "Hi";
		objArray[2] = 10;
		
		for(Object object: objArray) {
			System.out.println(object);
		}

	}

}
