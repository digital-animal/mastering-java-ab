package com.zahid.smartphone;

public class SmartPhoneTest {
    public static void main(String[] args) {
        SmartPhone sp1 = new SmartPhone();
        sp1.calling();
        sp1.messaging();
        sp1.capturePhoto();
        sp1.recordVideo();
        sp1.playMusic();
        sp1.playGame();
        System.out.println();
        
        Phone p1 = new SmartPhone();
        p1.calling();
        p1.messaging();
        // p1.capturePhoto(); // invalid
        // p1.recordVideo(); // invalid
        // p1.playMusic(); // invalid
        // p1.playGame(); // invalid
        System.out.println();

        ICamera c1 = new SmartPhone();
        c1.capturePhoto();
        c1.recordVideo();
        System.out.println();

        IMusicPlayer mp1 = new SmartPhone();
        mp1.playMusic();
        System.out.println();

    }
}
 