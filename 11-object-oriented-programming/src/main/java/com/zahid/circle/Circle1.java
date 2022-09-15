package com.zahid.circle;

import java.lang.Math;

public class Circle1 {
    public double radius;

    public Circle1() {
    }

    public Circle1(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI*Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    public double getCircumference() {
        return this.getPerimeter();
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
    
}
