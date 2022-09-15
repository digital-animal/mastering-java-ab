package com.zahid.annotation1;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
//@Retention(RetentionPolicy.SOURCE)
//@Retention(RetentionPolicy.RUNTIME)

@Documented

//@Target(value=ElementType.LOCAL_VARIABLE)
//@Target(value=ElementType.METHOD)
//@Target(value={ElementType.LOCAL_VARIABLE,ElementType.METHOD})
@Target(value={}) // available in everywhere

@Inherited // current class and as well as in subclass

//@Repeatable(MyAnnotation.class) // can be used multiple times


public @interface MyAnnotation {
	String name();
	String version() default "14.0";
}
