package com.zahid.accessmodifier.mypack2;

import com.zahid.accessmodifier.mypack1.Demo1;

public class Demo5 {
    Demo1 d = new Demo1();

    public void log() {
        System.out.println("[ Inside com.zahid.accessmodifier.mypack2.Demo5 ]");
        // System.out.println(d.defaultNum + d.privateNum + d.protectedNum + d.publicNum); // privateNum, protectedNum, defaultNum not accessible

        System.out.println("# publicNum = " + d.publicNum);
        System.out.print("# Sum = ");
        System.out.println(d.publicNum); // privateNum, protectedNum, defaultNum not accessible
        System.out.println();
    }

}
