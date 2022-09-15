package com.zahid.cylinder;

import java.lang.Math;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        this.height = 0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return super.area()*2 + 2*Math.PI*super.getRadius()*height;
    }

    public double volume() {
        return super.area()*height;
    }

    @Override
    public String toString() {
        return "Cylinder [height=" + height + ", radius= " + super.getRadius() + "]";
    }

}
