package com.zahid.overloadingoverriding;

public class PolymorphismTest {
    public static void main(String[] args) {
        // compile time polymorphism, method overloading test
        System.out.println("# compile-time polymorphism: method overloading");
        Base b1 = new Base();
        System.out.println(b1.max(4, 9));
        System.out.println(b1.max(4, 9, 2));
        System.out.println(b1.max(4, 9, 2, 3, 11));
        System.out.println();
        
        // run time polymorphism, method overriding test
        System.out.println("# runtime polymorphism: method overriding");
        Base b2 = new Base();
        b2.display();

        Base b3 = new Derived();
        b3.display();
        // b3.show(); // invalid

        Derived d1 = new Derived();
        d1.display();
        d1.show(); // valid
        
    }
}
