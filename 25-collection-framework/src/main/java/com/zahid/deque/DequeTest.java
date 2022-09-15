package com.zahid.deque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class DequeTest {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		
		// # # using as stack
		dq.addLast(4);
		dq.addLast(9);
		dq.addLast(2);
		dq.offerLast(3);
		dq.offerLast(5);
		dq.offerLast(7);
		
		System.out.println(dq);
		
		dq.removeLast();
		dq.removeLast();
		
		System.out.println(dq);
		
		dq.forEach(x->System.out.print(x+" "));
		System.out.println();
		
		dq.forEach(System.out::print);
		System.out.println();
		
		// # # using as queue
		dq.offerFirst(8);
		dq.offerFirst(1);
		dq.offerFirst(6);
		
		System.out.println(dq);
		
		dq.removeFirst();
		dq.removeFirst();
		
		System.out.println(dq);
		
		// # # printing using iterator
		
		Iterator<Integer> iter = dq.iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		
	}

}
