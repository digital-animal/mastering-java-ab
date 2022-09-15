package com.zahid.caroverriding;

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.start();
		c1.accelerate();
		c1.changeGear();
		System.out.println();
		
		Car c2 = new LuxuryCar();
		c2.start();
		c2.accelerate();
		c2.changeGear(); // dynamic method dispatch
		// c2.autoPilot(); // invalid
		System.out.println();
		
		LuxuryCar c3 = new LuxuryCar();
		c3.start();
		c3.accelerate();
		c3.changeGear();
		c3.autoPilot(); // valid
		System.out.println();

	}

}
