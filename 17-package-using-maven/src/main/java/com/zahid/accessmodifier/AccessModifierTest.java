package com.zahid.accessmodifier;

import com.zahid.accessmodifier.mypack1.Demo1;
import com.zahid.accessmodifier.mypack1.Demo2;
import com.zahid.accessmodifier.mypack2.Demo4;
import com.zahid.accessmodifier.mypack2.Demo5;
import com.zahid.accessmodifier.mypack1.Demo3;

public class AccessModifierTest {
    public static void main(String[] args) {
        
        new Demo1().display();
        new Demo2().show();
        new Demo3().print();
        new Demo4().print();
        new Demo5().log();

        System.out.println("[ Inside com.zahid.accessmodifier.AccessModifierTest ]");
        // System.out.println(new Demo1().defaultNum + new Demo1().privateNum + new Demo1().protectedNum + new Demo1().publicNum); // defaultNum, privateNum, protectedNum not accessible
        System.out.println("# publicNum = " + new Demo1().publicNum); // defaultNum, privateNum, protectedNum not accessible
        System.out.print("# Sum = ");
        System.out.println(new Demo1().publicNum);
        System.out.println();
    }
}
