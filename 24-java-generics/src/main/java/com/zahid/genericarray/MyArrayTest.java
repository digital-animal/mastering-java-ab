package com.zahid.genericarray;

@SuppressWarnings("unchecked")
public class MyArrayTest {
	
	public static <E> void show(E[] list) {
		for(E x: list) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
	
	public static <E> void printArray(E... list) {
		for(E x: list) {
			System.out.print(x+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		// (T extends Number) makes this obsolete
		
		MyArray<String> strArray = new MyArray<>();
		// MyArray strArray = new MyArray<>();
		strArray.append("Hello");
		strArray.append("Hi");
		strArray.append("Bye");
		strArray.printArray();
		System.out.println();
		
		MyArray<Integer> intArray = new MyArray<Integer>();
		// MyArray intArray = new MyArray<>();
		intArray.append(4);
		intArray.append(9);
		intArray.append(2);
		intArray.append(3);
		intArray.append(5);
		intArray.printArray();
		System.out.println();
		
		
		MyArray<Float> floatArray = new MyArray<Float>();
		floatArray.append(4.9f);
		floatArray.append(2.3f);
		floatArray.append(5.7f);
		floatArray.append(8.1f);
		floatArray.printArray();
		System.out.println();
		
		Integer[] numbers = {4, 9, 2, 3, 5, 7, 8, 1, 6, 0};
		show(numbers);
		
		Double[] doubles = {4.1, 9.2, 2.3, 3.4, 5.5, 7.6, 8.7, 1.8, 6.9, 1.0};
		show(doubles);
		
		show(new String[] {"A", "B", "C", "D", "E"});
		printArray(4.9f, 2.3f, 8.1f);
	}

}
