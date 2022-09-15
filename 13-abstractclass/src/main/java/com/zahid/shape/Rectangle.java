package com.zahid.shape;

public class Rectangle extends Shape {
	public int length;
	public int breadth;
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void area() {
		double area = length * breadth;
		System.out.printf("Area = %.2f\n", area);
		
	}

	@Override
	public void perimeter() {
		double perimeter = 2*(length + breadth);
		System.out.printf("Perimeter = %.2f\n", perimeter);
	}
	
	
}
