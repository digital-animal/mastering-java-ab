package com.zahid.paramconstructor;

public class Child extends Parent {
    public Child() {
        System.out.println("Non-Parameterized Child Constructor");
    }
    
    public Child(int x) {
        // super(x); // if used parameterized constructor of parent called.. nor non-param constructor of parent is called
        System.out.println("Parameterized Child Constructor "+x);
    }
    
    public Child(int x, int y) {
    	super(x);
        System.out.println("Two Parameter Child Constructor "+y);
    }
}