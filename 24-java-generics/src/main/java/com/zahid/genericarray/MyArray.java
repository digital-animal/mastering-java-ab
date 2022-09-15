package com.zahid.genericarray;

@SuppressWarnings("unchecked")
public class MyArray<T> {
	public int capacity;
	public int length;
	public T[] arr;
	
	
	public MyArray() {
		this.capacity = 10;
		this.length = 0;
		arr = (T[]) new Object[this.capacity];
	}
	
	public MyArray(int capacity) {
		this.capacity = capacity;
		this.length = 0;
		arr = (T[]) new Object[this.capacity];
	}
	
	public void append(T x) {
		if(!(length < capacity) )
			return;
		arr[length++] = x;
	}
	
	public void printArray() {
		for(int i=0; i<length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
}
