package com.zahid.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		
		/*HashSet<Integer> hs = new HashSet<>(); // O(1)
//		HashSet<Integer> hs = new HashSet<>(20, 0.25f);
		
		hs.add(4);
		hs.add(9);
		hs.add(2);
		hs.add(3);
		hs.add(5);
		hs.add(9);
		
		System.out.println(hs);
		
		hs.remove(3);
		
		System.out.println(hs);*/
		
		// # # TreeSet example
		TreeSet<Integer> ts = new TreeSet<>(); // O(log(n))
//		Collection<Integer> ts = new TreeSet<>(); // O(log(n))
//		SortedSet<Integer> ts = new TreeSet<>(); // O(log(n))
		
		TreeSet<Integer> ts2 = new TreeSet<>(List.of(11, 13, 17, 19, 23, 29, 13)); // O(log(n))
		
		ts.add(4);
		ts.add(9);
		ts.add(2);
		ts.add(3);
		ts.add(5);
		ts.add(9);
		
		System.out.println(ts);
		
		ts.remove(3);
		
		System.out.println(ts);
		
		System.out.println(ts2);
		ts2.add(15);
		ts2.add(25);
		System.out.println(ts2);
		System.out.println(ts2.ceiling(20));
		System.out.println(ts2.floor(20));
		System.out.println(ts2.contains(20));
		System.out.println(ts2.contains(23));
		System.out.println(ts2.first());
		System.out.println(ts2.last());
	}

}
