package com.zahid.linkedhashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		HashSet<String> lhs = new HashSet<>(10);
//		LinkedHashSet<String> lhs = new LinkedHashSet<>(10);
		
		lhs.add("A");
		lhs.add("B");
		lhs.add("K");
		lhs.add("C");
		lhs.add("M");
		lhs.add("D");
		lhs.add("T");
		lhs.add("E");
		lhs.add("B");
		
		System.out.println(lhs);
		lhs.forEach(System.out::print);
		System.out.println();
		
		Iterator<String> iter = lhs.iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}

	}

}
