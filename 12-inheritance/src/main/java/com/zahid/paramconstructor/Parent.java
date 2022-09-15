package com.zahid.paramconstructor;

public class Parent {
    public Parent() {
        System.out.println("Non-Parameterized Parent Constructor");
    }
    
    public Parent(int x) {
        System.out.println("Parameterized Parent Constructor "+ x);
    }
}
