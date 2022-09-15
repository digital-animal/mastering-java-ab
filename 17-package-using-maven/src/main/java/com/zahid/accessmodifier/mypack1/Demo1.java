package com.zahid.accessmodifier.mypack1;

public class Demo1 {
    int defaultNum = 10; // default, only accessible inside mypack1 package
    private int privateNum = 20; // private, only acessible inside Demo1 class
    protected int protectedNum = 30; // protected, accessible outside the mypack1 package by extending only
    public int publicNum = 40; // public, accessible everywhere, every way

    public void display() {
        System.out.println("[ Inside com.zahid.accessmodifier.mypack1.Demo1 ]");
        System.out.println("# privateNum = " + privateNum);
        System.out.println("# defaultNum = " + defaultNum);
        System.out.println("# protectedNum = " + protectedNum);
        System.out.println("# publicNum = " + publicNum);
        System.out.print("# Sum = ");
        System.out.println(defaultNum + privateNum + protectedNum + publicNum);
        System.out.println();
    }
}