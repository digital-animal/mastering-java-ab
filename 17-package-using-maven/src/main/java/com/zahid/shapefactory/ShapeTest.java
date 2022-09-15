package com.zahid.shapefactory;

import com.zahid.shapefactory.shape.Cuboid;

public class ShapeTest {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid(4, 9, 2);
        System.out.println(cuboid.area());
        System.out.println(cuboid.volume());
    }
}
