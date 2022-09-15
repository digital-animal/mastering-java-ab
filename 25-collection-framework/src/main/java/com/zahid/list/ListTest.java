/**
 * ArrayList Example
 * LinkedList Example
 */
package com.zahid.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {

	private static final String ArrayList = null;

	public static void main(String[] args) {
		// # ArrayList Demo
//		ArrayList<Integer> list1 = new ArrayList<>(20);
//		ArrayList<Integer> list2 = new ArrayList<>(List.of(50, 60, 70, 80, 90));
		
		// # LinkedList Demo
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>(List.of(50, 60, 70, 80, 90));
		
		list1.add(4);
		list1.add(9);
		list1.add(2);
		list1.add(0, 11);
		list1.addAll(1, list2);
		System.out.println(list1);
		System.out.println(list1.contains(4));
		System.out.println(list1.contains(25));
		System.out.println(list1.indexOf(4));
		System.out.println(list1.indexOf(25));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		list1.add(70);
		System.out.println(list1.indexOf(70));
		System.out.println(list1.lastIndexOf(70));
		list1.set(3, 101);
		System.out.println(list1);
		
//		for(int x: list1) {
//			System.out.print(x+" ");
//		}
//		System.out.println();
		
		for(var x: list1) {
			System.out.print(x+" ");
		}
		System.out.println();	
		
		
		for(int i=0; i<list1.size(); i++) {
			System.out.print(list1.get(i)+" ");
		}
		System.out.println();
//		
//		Iterator<Integer> it;
//		it = list1.iterator();
		
		ListIterator<Integer> it;
		it = list1.listIterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		list1.forEach((x)-> System.out.print(x+" "));
		System.out.println();
		list1.forEach(System.out::println);
		System.out.println();
		
		list1.forEach(num -> showGreater(num));
		System.out.println();
		
		list1.forEach(num -> isEven(num));
		System.out.println();
		
		System.out.println(list1.isEmpty());
		System.out.println();
		
		// # # only for LinkedList
		list1.addFirst(400);
		list1.addLast(900);
		System.out.println(list1);
		System.out.println(list1.getFirst());
		System.out.println(list1.getLast());
		
	}
	
	public static void showGreater(int n) {
		if(n>50) {
			System.out.print(n+" ");
		}
	}
	
	public static void isEven(int n) {
		if(n%2 == 0) {
			System.out.print(n+" ");
		}
	}

}
