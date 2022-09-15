package com.zahid.accessmodifier.mypack2;

import com.zahid.accessmodifier.mypack1.Demo1;

public class Demo4 extends Demo1 {
    public void print() {
        System.out.println("[ Inside com.zahid.accessmodifier.mypack2.Demo4 ]");
        // System.out.println(defaultNum + privateNum + protectedNum + publicNum); // invalid for privateNum, defaultNum

        System.out.println("# protectedNum = " + protectedNum);
        System.out.println("# publicNum = " + publicNum);
        System.out.print("# Sum = ");
        System.out.println(protectedNum + publicNum); // invalid for privateNum, defaultNum
        System.out.println();
    }
}
