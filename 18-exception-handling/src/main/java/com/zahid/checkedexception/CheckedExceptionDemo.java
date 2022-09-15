package com.zahid.checkedexception;

public class CheckedExceptionDemo {
	
	public static void lowBalanceExceptionCall() {
		
		try {
			throw new LowBalanceException();			
		} catch(LowBalanceException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		lowBalanceExceptionCall();
	}

}
