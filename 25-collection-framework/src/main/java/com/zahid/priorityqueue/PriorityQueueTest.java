package com.zahid.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		
//		PriorityQueue<Integer> pq = new PriorityQueue<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>(new MyComparator());
		pq.add(4);
		pq.add(9);
		pq.add(2);
		pq.add(3);
		pq.add(5);
		pq.add(7);
		pq.add(8);
		pq.offer(1);
		
		System.out.println(pq);
		System.out.println(pq.peek());
		
		pq.forEach(x -> System.out.print(x+" "));
		System.out.println();
		
		pq.poll();
		
		pq.forEach(x -> System.out.print(x+" "));
		System.out.println();
	}

}
