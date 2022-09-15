package com.zahid.accessmodifier.mypack1;

public class Demo3 extends Demo1 {

    public void print() {
        System.out.println("[ Inside com.zahid.accessmodifier.mypack1.Demo3 ]");
        // System.out.println(defaultNum + privateNum + protectedNum + publicNum); // invalid for privateNum

        System.out.println("# defaultNum = " + defaultNum);
        System.out.println("# protectedNum = " + protectedNum);
        System.out.println("# publicNum = " + publicNum);
        System.out.print("# Sum = ");
        System.out.println(defaultNum  + protectedNum + publicNum);
        System.out.println();
    }
}
