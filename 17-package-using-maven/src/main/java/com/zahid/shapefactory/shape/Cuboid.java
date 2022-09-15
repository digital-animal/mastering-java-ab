package com.zahid.shapefactory.shape;

public class Cuboid extends Rectangle {
    public int height;

    public Cuboid(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }

    @Override
    public double area() {
        return 2*(length*breadth + breadth*height + length*height);
    }

    public double volume() {
        return length*breadth*height;
    }  
}
