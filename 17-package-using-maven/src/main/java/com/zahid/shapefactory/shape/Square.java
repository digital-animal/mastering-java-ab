package com.zahid.shapefactory.shape;

public class Square implements Shape  {
    public int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double area() {
        return Math.pow(side, 2);
    }

    public final double perimeter() {
        return 4*side;
    }

    
}
