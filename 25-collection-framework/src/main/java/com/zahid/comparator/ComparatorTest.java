package com.zahid.comparator;

import java.util.Arrays;

public class ComparatorTest {

	public static void main(String[] args) {
		
		/*int[] A = {4, 9, 2, 3, 5, 7, 8, 1};
		int[] B = {2, 3, 13, 17, 19, 5, 7, 11};
		
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));
		
//		System.out.println(Arrays.compare(A, B));
		
//		Arrays.sort(A);
//		System.out.println(Arrays.toString(A));
		
//		int[] C = Arrays.copyOf(A, A.length);
		int[] C = Arrays.copyOf(A, 4);
		System.out.println(Arrays.toString(C));
		
//		Arrays.fill(C, 10);
		Arrays.fill(C, -1);
		System.out.println(Arrays.toString(C));
		
		Arrays.sort(A);
		System.out.println(Arrays.toString(A));
		
		Arrays.parallelSort(B);
		System.out.println(Arrays.toString(B));
		
		System.out.println(Arrays.binarySearch(A, 2));
		System.out.println(Arrays.binarySearch(A, 8));*/
		
		Integer[] A = {4, 9, 2, 3, 5, 7, 8, 1, 6, 0};
		
//		Arrays.sort(A);
		Arrays.sort(A, new MyComparator());
		System.out.println(Arrays.toString(A));

	}

}
