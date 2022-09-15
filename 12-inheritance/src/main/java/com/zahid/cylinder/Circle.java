package com.zahid.cylinder;

import java.lang.Math;

public class Circle {
    private double radius;

    public Circle() {
        this.radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI*Math.pow(radius, 2);
    }

    public double circumference() {
        return 2*Math.PI*radius;
    }

    public double perimeter() {
        return this.circumference();
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }


}
