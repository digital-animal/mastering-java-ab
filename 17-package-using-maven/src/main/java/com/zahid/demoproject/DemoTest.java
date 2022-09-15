package com.zahid.demoproject;

import com.zahid.demoproject.mypack.Demo1;
import com.zahid.demoproject.mypack.Demo2;
import com.zahid.demoproject.mypack.inner.Demo3;

public class DemoTest {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        Demo2 d2 = new Demo2();
        Demo3 d3 = new Demo3();

        d1.display();
        d2.display();
        d3.display();
    }
}
