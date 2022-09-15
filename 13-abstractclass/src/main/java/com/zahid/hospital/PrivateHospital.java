package com.zahid.hospital;

public class PrivateHospital extends Hospital {

	@Override
	public void emergecy() {
		System.out.println("Emergency Available");
	}

	@Override
	public void appointment() {
		System.out.println("Appointment System Available");
	}

	@Override
	public void admit() {
		System.out.println("Admission System Available");
	}

	@Override
	public void billing() {
		System.out.println("Billing System Available");
	}
	
	public void intensiveCareUnit() {
		System.out.println("ICU Available");
	}
}
