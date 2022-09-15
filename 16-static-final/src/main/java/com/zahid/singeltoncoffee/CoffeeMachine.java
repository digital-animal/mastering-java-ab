package com.zahid.singletoncoffee;

public class CoffeeMachine {
	private float coffeeQuantity;
	private float milkQuantity;
	private float waterQuantity;
	private float suagrQuantity;
	
	private static CoffeeMachine coffeeInstance = null;
	
	private CoffeeMachine() {
		this.coffeeQuantity = 1;
		this.milkQuantity = 1;
		this.waterQuantity = 1;
		this.suagrQuantity = 1;
	}
	
	public void fillWater(float quantity) {
		this.waterQuantity = quantity;
	}
	
	public void fillSugar(float quantity) {
		this.suagrQuantity = quantity;
	}
	
	public float getCoffee() {
		return 0.15f;
	}
	
	public static CoffeeMachine getInstance() {
		if(coffeeInstance == null)
			coffeeInstance = new CoffeeMachine();
		return coffeeInstance;
	}
}
