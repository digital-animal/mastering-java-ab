package com.zahid.television;

public class TelevisionTest {
    public static void main(String[] args) {
        Television t1 = new Television("Samsung LED TV");
        System.out.println(t1);
        t1.changeVolume(10);
        t1.changeChannel(24);
        t1.changeVolume(12);
        t1.changeVolume(-8);
        t1.changeChannel(52);
        System.out.println(t1.isOn());
        System.out.println();

        Television t2 = new Television("Sony Bravia LED TV");
        System.out.println(t2);
        t2.changeVolume(30);
        t2.changeChannel(16);
        t2.changeVolume(-6);
        System.out.println(t2.isOn());
        System.out.println();
    }  
}
