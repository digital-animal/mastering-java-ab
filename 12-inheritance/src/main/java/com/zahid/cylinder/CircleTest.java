package com.zahid.cylinder;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        System.out.println(c1);
        System.out.printf("Area = %.2f\n", c1.area());
        System.out.printf("Circumference = %.2f\n", c1.circumference());
        System.out.printf("Perimeter = %.2f\n", c1.perimeter());
        System.out.println();

        Cylinder c2 = new Cylinder(5, 12);
        System.out.println(c2);
        System.out.printf("Area = %.2f\n", c2.area());
        System.out.printf("Volume = %.2f\n", c2.volume());
    }
}
