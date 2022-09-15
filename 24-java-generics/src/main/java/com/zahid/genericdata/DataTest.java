package com.zahid.genericdata;

public class DataTest {
	public static void main(String[] args) {
		Data<Integer> d = new Data<>();
		d.setData(10); // autoboxing [new Integer(10)]
		System.out.println(d.getData());
		
		Data<String> s = new Data<>();
		s.setData("Hello");
		System.out.println(s.getData());
	}
}
