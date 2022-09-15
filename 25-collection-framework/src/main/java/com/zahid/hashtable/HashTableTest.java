package com.zahid.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableTest {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<>();
		
		ht.put(1, "A");
		ht.put(2, "B");
		ht.put(3, "C");
		ht.put(4, "D");
		ht.put(5, "E");
		ht.put(6, "F");
		
		System.out.println(ht.get(3));
		System.out.println(ht);
		System.out.println(ht.get(4));
		System.out.println();
		
		Enumeration<Integer> e = ht.keys();
//		Enumeration<String> e = ht.elements();
		
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement()+" ");
		}
		System.out.println();
		
		ht.compute(2, (k,v)->v+"X");
		ht.computeIfAbsent(7, (k)-> "Z"+k);
		System.out.println(ht);
	}

}
