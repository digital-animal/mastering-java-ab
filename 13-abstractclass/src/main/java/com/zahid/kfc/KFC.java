package com.zahid.kfc;

public abstract class KFC {

	public KFC() {
		System.out.println("KFC Branch Opened");
	}
	
	public void makeItem() {
		System.out.println("Item made with KFC recipie");
	}
	public abstract void billing();
	public abstract void offer();
}
