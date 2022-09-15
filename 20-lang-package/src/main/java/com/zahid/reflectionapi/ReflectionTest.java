package com.zahid.reflectionapi;

import java.lang.reflect.*;
import java.util.Arrays;

public class ReflectionTest {

	public static void main(String[] args) {
		
//		Class c = My.class;
		Class<My> c = My.class;
		
//		My m = new My();
//		Class c1 = m.getClass();
		
		System.out.println(c.getName());
		Field fiedls[] = c.getDeclaredFields();
//		System.out.println(Arrays.toString(fields));
		
		for(Field f: fiedls) {
			System.out.println(f);
		}
		System.out.println();
		
		Constructor cons[] = c.getConstructors();
		
		for(Constructor con: cons) {
			System.out.println(con);
		}
		System.out.println();
		
		Method methods[] = c.getMethods();
		for(Method m: methods) {
			System.out.println(m);
		}
		System.out.println();
		
		Parameter params[] = methods[1].getParameters();

		for(Parameter p: params) {
			System.out.println(p);
		}
		System.out.println();
	}

}
