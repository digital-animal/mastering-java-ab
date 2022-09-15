package com.zahid.throwexample;

public class NegativeDimensionException extends Exception {

	@Override
	public String toString() {
		return "Dimension cannot be negative.\n"
				+ "Enter Non-negative dimensions.";
	}
	
}
