package com.zahid.caroverriding;

public class LuxuryCar extends Car {
	@Override
	public void changeGear() {
		System.out.println("Luxury Car Changed Gear [Automatic]");
	}
	
	public void autoPilot() {
		System.out.println("Luxury Car Turned On Autopilot Mode");
	}
}
