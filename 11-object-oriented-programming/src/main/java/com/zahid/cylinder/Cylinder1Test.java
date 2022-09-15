package com.zahid.cylinder;

public class Cylinder1Test {
    public static void main(String[] args) {
        Cylinder1 c1 = new Cylinder1(4, 9);
        System.out.println(c1);
        System.out.printf("Area = %.2f\n", c1.getArea());
        System.out.printf("Volume = %.2f\n", c1.getVolume());
        System.out.println();

        Cylinder1 c2 = new Cylinder1(1, 1);
        System.out.println(c2);
        System.out.printf("Area = %.2f\n", c2.getArea());
        System.out.printf("Volume = %.2f\n", c2.getVolume());
        System.out.println();
    }
}
