package com.zahid.circle;

public class Circle1Test {
    public static void main(String[] args) {
        Circle1 c1 = new Circle1(10.0);
        
        System.out.println(c1);
        System.out.printf("Area = %.2f\n", c1.getArea());
        System.out.printf("Perimeter = %.2f\n", c1.getPerimeter());
        System.out.printf("Circumference = %.2f\n", c1.getCircumference());
        System.out.println();
        
        Circle1 c2 = new Circle1(24.0);
        System.out.println(c2);
        System.out.printf("Area = %.2f\n", c2.getArea());
        System.out.printf("Perimeter = %.2f\n", c2.getPerimeter());
        System.out.printf("Circumference = %.2f\n", c2.getCircumference());

    }
}
