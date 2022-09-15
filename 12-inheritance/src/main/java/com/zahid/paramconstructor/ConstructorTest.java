package com.zahid.paramconstructor;

public class ConstructorTest {

    public static void main(String[] args) {
    	
        System.out.println("# Parent");
        Parent p1 = new Parent();
        System.out.println();
        Parent p2 = new Parent(4);
        System.out.println();


        System.out.println("# Child");
        Child c1 = new Child();
        System.out.println();
        Child c2 = new Child(9);
        System.out.println();
        Child c3 = new Child(2,3);
        System.out.println();
    }

}
