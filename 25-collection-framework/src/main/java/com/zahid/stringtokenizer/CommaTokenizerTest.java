package com.zahid.stringtokenizer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CommaTokenizerTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/main/resources/data.txt");
		byte[] b = fis.readAllBytes();
		String text = new String(b);
		System.out.println(text);
		
		StringTokenizer stk = new StringTokenizer(text, ",");
		
//		int n = 10;
		int num;
		String str;
		
//		int[] arr = new int[n];
//		int i=0;
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		while(stk.hasMoreTokens()) {
			str = stk.nextToken();
			num = Integer.parseInt(str);
			System.out.println(num);
//			arr[i++] = num;			
			arr.add(num);
		}
		
//		System.out.println(Arrays.toString(arr));
		System.out.println(arr);
		
		fis.close();

	}

}
