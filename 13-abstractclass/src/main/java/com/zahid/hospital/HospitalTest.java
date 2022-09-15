package com.zahid.hospital;

public class HospitalTest {

	public static void main(String[] args) {
		Hospital h1 = new PrivateHospital();
		h1.emergecy();
		h1.appointment();
		h1.admit();
		h1.billing();
//		h1.intensiveCareUnit(); // invalid
		System.out.println();
		
		PrivateHospital h2 = new PrivateHospital();
		h2.emergecy();
		h2.appointment();
		h2.admit();
		h2.billing();
		h2.intensiveCareUnit(); // valid

	}

}
