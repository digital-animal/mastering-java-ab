package com.zahid.stackoverflow;

public class StackUnderflowException extends Exception {

	@Override
	public String toString() {
		return "Stack Underflow Happened. Cannot Pop";
	}
	
}
