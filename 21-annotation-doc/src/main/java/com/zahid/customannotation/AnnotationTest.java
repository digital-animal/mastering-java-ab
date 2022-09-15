package com.zahid.customannotation;

//@MyAnnotation
@MyAnnotation(name="Zahid")
public class AnnotationTest {
	// @MyAnnotation
	@MyAnnotation(name="Zahid")
	int instance;
	
	// @MyAnnotation
	@MyAnnotation(name="Zahid")
	public static void main(/*@MyAnnotation*/ @MyAnnotation(name="Zahid") String[] args) {
		// @MyAnnotation
		@MyAnnotation(name="Zahid")
		int x = 10;
		System.out.println(x); 
	}

} 
