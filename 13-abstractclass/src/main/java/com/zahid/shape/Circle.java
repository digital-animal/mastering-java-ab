package com.zahid.shape;

public class Circle extends Shape {
	public int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void area() {
		double area = Math.PI*Math.pow(radius, 2);
		System.out.printf("Area = %.2f\n", area);
	}

	@Override
	public void perimeter() {
		double perimeter = 2*Math.PI*radius;
		System.out.printf("Perimeter = %.2f\n", perimeter);
	}
	
}
