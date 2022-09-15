package com.zahid.langapi;

public class MyObject {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("MyObject {%d}", super.hashCode());
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 492357816;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.hashCode() == obj.hashCode();
 	}

}
