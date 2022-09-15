package com.zahid.comparable;

import java.util.TreeSet;

public class ComparableTest {

	public static void main(String[] args) {
		TreeSet<Point> ts = new TreeSet<>();
		
		ts.add(new Point(5, 7));
		ts.add(new Point(4, 9));
		ts.add(new Point(2, 3));
		ts.add(new Point(2, 5));
		ts.add(new Point(4, 7));
		ts.add(new Point(8, 1));
		ts.add(new Point(3, 9));
		ts.add(new Point(2, 8));
		ts.add(new Point(1, 0));
		ts.add(new Point(1, 1));
		ts.add(new Point(0, 0));
		
		System.out.println(ts);
	}

}
