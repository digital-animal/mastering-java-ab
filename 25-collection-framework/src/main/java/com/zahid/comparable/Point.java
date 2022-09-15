package com.zahid.comparable;

public class Point implements Comparable<Object> {
	public int x;
	public int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Object obj) {
		
		Point p = (Point) obj;
		if(this.x < p.x) return -1;
		else if(this.x > p.x) return 1;
		else {
			if(this.y < p.y) return -1;
			else if(this.y > p.y) return 1;
			else return 0;
		}
	}

	@Override
	public String toString() {
		
		return String.format("(%d, %d)", x, y);
	}
	
	
}
