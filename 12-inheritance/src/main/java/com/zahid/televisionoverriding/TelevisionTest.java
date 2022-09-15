package com.zahid.televisionoverriding;

public class TelevisionTest {

	public static void main(String[] args) {
		Television tv = new Television();
		tv.switchOn();
		tv.changeChannel();
		System.out.println();
		
		Television tv2 = new SmartTelevision();
		tv2.switchOn(); // dynamic method dispatch
		tv2.changeChannel(); // dynamic method dispatch
		// tv2.browseNet(); // will render error definitely
		System.out.println();
		
		SmartTelevision tv3 = new SmartTelevision();
		tv3.switchOn();
		tv3.changeChannel();
		tv3.browseNet();
		System.out.println();
	}

}
