package com.zahid.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		
//		TreeMap<Integer, String> tm = new TreeMap<>();
//		TreeMap<Integer, String> tm = new TreeMap<>(Map.of(1, "Zahid", 2, "Jewel", 3, "Robi"));
		HashMap<Integer, String> tm = new HashMap<>(Map.of(1, "Zahid", 2, "Jewel", 3, "Robi"));
		
		System.out.println(tm);
		System.out.println(tm.get(1));
		System.out.println(tm.get(2));
		System.out.println(tm.get(3));
		System.out.println(tm.keySet());
		System.out.println(tm.values());
		
		tm.put(4, "Hasan");
		tm.put(5, "Tonmoy");
		
		System.out.println(tm);
		
		
		// # # available only for TreeMap, not for HashMap
		/*System.out.println(tm.ceilingEntry(3));
		System.out.println(tm.ceilingEntry(3).getValue());
		
		System.out.println(tm.containsKey(5));
		System.out.println(tm.firstEntry());
		System.out.println(tm.lastEntry());
		System.out.println(tm.entrySet());
		
		Entry<Integer, String> e = tm.firstEntry();
		System.out.println(e);
		System.out.println(e.getKey());
		System.out.println(e.getValue ());*/
		
		System.out.println(tm.isEmpty());
		
		tm.forEach((key, value) -> System.out.printf("# %d: %s\n", key, value));
		
	}

}
