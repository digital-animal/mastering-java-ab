package com.zahid.annotation2;

public class My<T> {
	@SuppressWarnings("unused")
	@SafeVarargs
	private void show(T ...args) {
		for(T x:args) {
			System.out.println(x);
		}
	}
}
