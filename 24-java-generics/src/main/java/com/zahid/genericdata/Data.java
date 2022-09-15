package com.zahid.genericdata;

public class Data<T> {
	private T obj;

	public T getData() {
		return obj;
	}

	public void setData(T obj) {
		this.obj = obj;
	}
	
}
