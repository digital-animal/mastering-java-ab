package com.zahid.shapefactory.shape;

public class Cube extends Square {

    public Cube(int side) {
        super(side);
    }

    @Override
    public double area() {
        return 6*super.area();
    }
    
    public double volume() {
        return Math.pow(side, 3);
    }
    
}
