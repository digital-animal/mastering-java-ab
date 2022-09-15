package com.zahid.customannotation;

//@interface MyAnnotation {
//	
//}

@interface MyAnnotation {
	String name();
	float version() default 14.0f;
}
