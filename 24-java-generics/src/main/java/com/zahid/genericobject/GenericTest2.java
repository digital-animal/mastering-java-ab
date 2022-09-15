package com.zahid.genericobject;

public class GenericTest2<T> {
	
	@SuppressWarnings("unchecked")
	public Object data[] =(T[]) new Object[3];

	public static void main(String[] args) {
		
		GenericTest2<String> g = new GenericTest2<>();
		g.data[0] = "Hello";
		g.data[1] = "Hi";
		g.data[1] = "Bye";
		
		String text = (String)g.data[0];
		System.out.println(text);
		
		for(Object obj: g.data) {
			String str = (String) obj;
			System.out.println(str);
		}

	}

}
