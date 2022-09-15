package com.zahid.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		
//		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5);
//		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5, 0.75f, true);
		
		/*LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5, 0.75f, true) {

			@Override
			protected boolean removeEldestEntry(Entry<Integer, String> eldest) {
				// TODO Auto-generated method stub
				return size() > 10;
			}
			
		};*/
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(10) {

			@Override
			protected boolean removeEldestEntry(Entry<Integer, String> eldest) {
				// TODO Auto-generated method stub
				return size() > 10;
			}
			
		};
		 
		
		lhm.put(65, "A");
		lhm.put(66, "B");
		lhm.put(67, "C");
		lhm.put(68, "D");
		lhm.put(69, "E");
		lhm.put(70, "F");
		
		System.out.println(lhm);
		lhm.forEach((key, value)-> System.out.printf("%d:%s\n", key, value));
		System.out.println();
		System.out.println(lhm.size());
		
		lhm.put(101, "e");
		lhm.put(100, "d");
		lhm.put(99, "c");
		lhm.put(98, "b");
		lhm.put(97, "a"); 
		
		System.out.println(lhm.size());
		System.out.println(lhm);
		System.out.println(lhm.get(100));
		System.out.println(lhm.get(70));
		System.out.println(lhm);
		System.out.println(lhm.get(65));
		System.out.println(lhm.get(66));
		System.out.println(lhm);
		lhm.put(102, "f");
		lhm.put(71, "G");
		System.out.println(lhm);
	}

}
