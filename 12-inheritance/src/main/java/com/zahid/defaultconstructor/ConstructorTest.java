package com.zahid.defaultconstructor;

public class ConstructorTest {
    public static void main(String[] args) {
        System.out.println("# Parent");
        Parent p = new Parent();
        System.out.println(p);
        System.out.println();

        System.out.println("# Child");
        Child c = new Child();
        System.out.println(c);
        System.out.println();

        System.out.println("# Grand Child");
        GrandChild gc = new GrandChild();
        System.out.println(gc);
        System.out.println();
    }
}
