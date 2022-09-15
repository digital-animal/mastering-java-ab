package com.zahid.thissuper;

public class Rectangle {
    public int length;
    public int breadth;
    public int x = 10;
    
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public void display() {
        System.out.println("Length: "+this.length);
        System.out.println("Breadth: "+this.breadth);      
    }
}
