package com.zahid.enumexample;

enum Department {
	CSE, EEE, IPE, ME, CE;
	
	private Department() {
		System.out.println(this.name());
	}
	
	public void display() {
		System.out.println(this.name() + " " + this.ordinal());
	}
}

public class EnumSwitchCase {

	public static void main(String[] args) {
		Department d = Department.CSE;
		d.display();
		
		switch (d) {
		case CSE:
			System.out.println("Head: John \nBlock A");
			break;
		case EEE:
			System.out.println("Head: Smith \nBlock B");
			break;
		case IPE:
			System.out.println("Head: Alex \nBlock C");
			break;
		case ME:
			System.out.println("Head: Lee \nBlock D");
			break;
		case CE:
			System.out.println("Head: Cooper \nBlock E");
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + d);
		}

	}

}
