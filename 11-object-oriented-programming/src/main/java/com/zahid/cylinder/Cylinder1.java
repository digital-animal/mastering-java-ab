package com.zahid.cylinder;

import java.lang.Math;

public class Cylinder1 {
    private double radius;
    private double height;

    public Cylinder1() {
    }
    
    public Cylinder1(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 2*Math.PI*radius*(radius + height);
    }

    public double getVolume() {
        return Math.PI*Math.pow(radius, 2)*height;
    }

    @Override
    public String toString() {
        return "Cylinder [height=" + height + ", radius=" + radius + "]";
    }

}
