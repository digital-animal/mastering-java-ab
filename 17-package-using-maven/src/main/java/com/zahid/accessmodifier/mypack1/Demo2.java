package com.zahid.accessmodifier.mypack1;

public class Demo2 {
    Demo1 d = new Demo1();

    public void show() {
        System.out.println("[ Inside com.zahid.accessmodifier.mypack1.Demo2 ]");
        // System.out.println(d.defaultNum + d.privateNum + d.protectedNum + d.publicNum); // privateNum not accessible
        System.out.println("# defaultNum = " + d.defaultNum);
        System.out.println("# protectedNum = " + d.protectedNum);
        System.out.println("# publicNum = " + d.publicNum);
        System.out.print("# Sum = ");
        System.out.println(d.defaultNum + d.protectedNum + d.publicNum); 
        System.out.println();
    }
}