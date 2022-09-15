package com.zahid.televisionoverriding;

public class SmartTelevision extends Television {
	@Override
	public void switchOn() {
		System.out.println("Smart Television Switched ON");
	}
	
	@Override
	public void changeChannel() {
		System.out.println("Smart Television Channel Changed");
	}
	
	public void browseNet() {
		System.out.println("Smart Television Browsing Net");
	}
}
