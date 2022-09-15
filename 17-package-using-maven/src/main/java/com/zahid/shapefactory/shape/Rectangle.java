package com.zahid.shapefactory.shape;

public class Rectangle implements Shape {
    public int length;
    public int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return length*breadth;        
    }

    public final double perimeter() {
        return 2*(length+breadth);        
    }
}
