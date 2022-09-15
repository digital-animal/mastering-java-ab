package com.zahid.stackoverflow;

public class StackOverflowException extends Exception  {

	@Override
	public String toString() {
		return "Stack Overflow Happened. Cannot Push";
	}
	
}
