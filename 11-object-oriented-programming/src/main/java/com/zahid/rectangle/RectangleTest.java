package com.zahid.rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 9);
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.isSquare());
        System.out.println();
        
        Rectangle r2 = new Rectangle(16, 12);
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());
        System.out.println(r2.isSquare());
        System.out.println();

        Rectangle r3 = new Rectangle(12, 12);
        System.out.println(r3);
        System.out.println(r3.getArea());
        System.out.println(r3.getPerimeter());
        System.out.println(r3.isSquare());
    }
}
