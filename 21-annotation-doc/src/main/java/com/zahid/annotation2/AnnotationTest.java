package com.zahid.annotation2;

import java.util.*;

public class AnnotationTest {
	public static List l;
	
	@SuppressWarnings("deprecation")
	// @SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// l.add(10);
		
		OldClass oc = new OldClass();
		oc.show();
	}
}
