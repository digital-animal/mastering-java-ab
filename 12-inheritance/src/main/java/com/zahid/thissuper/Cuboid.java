package com.zahid.thissuper;

public class Cuboid extends Rectangle {
    public int height;
    public int x=20;

    public Cuboid(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }
    
    public void display() {
        System.out.println("Length: "+ this.length);
        System.out.println("Breadth: "+ this.breadth);
        System.out.println("Height: "+ this.height);
        System.out.println("Rectangle x: "+ super.x);
        System.out.println("Cuboid x: "+ this.x);
    }
    
}
