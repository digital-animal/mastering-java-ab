package com.zahid.shape;

public class ShapeTest {

	public static void main(String[] args) {
		Shape c = new Circle(10);
		c.area();
		c.perimeter();
		
		System.out.println();
		
		Shape r = new Rectangle(4, 9);
		r.area();
		r.perimeter();
	}

}
