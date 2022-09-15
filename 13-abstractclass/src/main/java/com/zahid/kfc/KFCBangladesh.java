package com.zahid.kfc;

public class KFCBangladesh extends KFC {

	public KFCBangladesh() {
		super();
	}

	@Override
	public void billing() {
		System.out.println("Billing System Installed");
		
	}

	@Override
	public void offer() {
		System.out.println("Offer Available");
	}
	
	public void festiveOffer() {
		System.out.println("Festival Offer Available");
	}
	
}
