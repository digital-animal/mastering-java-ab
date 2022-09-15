package com.zahid.overloadingoverriding;

public class Base {
    public int max(int x, int y) {
        return x>y? x: y;
    }

    public int max(int x, int y, int z) {
        return (x>y && x > z)? x: (y>z? y: z);
    }

    public int max(int ...A) {
        int max = Integer.MIN_VALUE;
        for (int x : A) {
            if(x > max) max = x;
        }
        return max;
    }

    public void display() {
        System.out.println("Inside Base Class display()");
    }
}
