package com.zahid.singletoncoffee;

public class CoffeeTest {

	public static void main(String[] args) {
		CoffeeMachine m1 = CoffeeMachine.getInstance();
		CoffeeMachine m2 = CoffeeMachine.getInstance();
		CoffeeMachine m3 = CoffeeMachine.getInstance();
		System.out.println(m1+" | "+m2+" | "+m3);
		System.out.println(m1.hashCode()+" | "+m2.hashCode()+" | "+m3.hashCode());
		if(m1 == m2 && m1 == m3) {
			System.out.println("Same Instance"); 
		}
	}
}
