package com.zahid.television;

public class Television {
    private String brandName;
    private int channelNo = 0;
    private int volumeLevel = 0;
    private boolean isOn = false;

    public Television() {
        this.isOn = true;
    }

    public Television(String brandName) {
        this.brandName = brandName;
        this.isOn = true;
    }

    public void changeVolume(int count) {
        if(isOn == false)
            return;
        if(this.volumeLevel + count >= 0) {
            this.volumeLevel += count;

            if(count > 0) {
                System.out.println("Volume increased to "+volumeLevel);
            }
            else if(count < 0) {
                System.out.println("Volume decreased to "+volumeLevel);
            }
        }
        return;
    }

    public void changeChannel(int channelNo) {
        if(isOn == false)
            return;
        this.channelNo = channelNo;
        System.out.println("Channel changed to channel no. "+this.channelNo);
    }
    
    public void switchOn() {
        if(isOn == false)
            System.out.println("Television switched on");
        isOn = true;

        return;
    }
    
    public void switchOff() {
        if(isOn == true)
            System.out.println("Television switched off");
        isOn = false;

        return;
    } 

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(int channelNo) {
        this.channelNo = channelNo;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    @Override
    public String toString() {
        return "Television [brandName=" + brandName + "]";
    }

}