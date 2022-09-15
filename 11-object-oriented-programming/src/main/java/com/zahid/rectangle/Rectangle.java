package com.zahid.rectangle;

public class Rectangle {
    private int length;
    private int breadth;
    
    public Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }
    
    public void setLength(int length) {
        this.length = length;
    }
    
    public int getBreadth() {
        return breadth;
    }
    
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    
    public int getArea() {
        return length*breadth;
    }
    
    public int getPerimeter() {
        return 2*(length + breadth);
    }
    
    public boolean isSquare() {
        return length == breadth;
    }

    @Override
    public String toString() {
        return "Rectangle [breadth=" + breadth + ", length=" + length + "]";
    }
}
