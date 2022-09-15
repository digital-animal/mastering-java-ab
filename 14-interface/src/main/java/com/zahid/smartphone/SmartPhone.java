package com.zahid.smartphone;

public class SmartPhone extends Phone implements ICamera, IMusicPlayer {
    public void playGame() {
        System.out.println("# SmartPhone: Playing Game");
    }

    @Override
    public void capturePhoto() {
        System.out.println("# SmartPhone(Camera): Capturing Photo");
    }

    @Override
    public void recordVideo() {
        System.out.println("# SmartPhone(Camera): Recording Video");
    }

    @Override
    public void playMusic() {
        System.out.println("# SmartPhone(MP3): Playing Music");
    }
}
