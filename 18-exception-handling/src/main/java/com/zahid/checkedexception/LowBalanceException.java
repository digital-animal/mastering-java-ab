package com.zahid.checkedexception;

public class LowBalanceException extends Exception {

	@Override
	public String toString() {
		return "Minimum Balance should be 5000."
				+ "\nTry again with smaller amount.";
	}
	
}
