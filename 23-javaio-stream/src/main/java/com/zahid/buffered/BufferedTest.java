package com.zahid.buffered;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedTest {

	public static String filePath = "src/main/resources/test.txt";

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// ## FileInputStream & BufferedInputStream
		
		FileInputStream fis = new FileInputStream(filePath);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		byte[] b = bis.readAllBytes();
		String str1 = new String(b);
		System.out.println(str1);
		
		System.out.println("fis> " + fis.markSupported());
		System.out.println("bis> " + bis.markSupported());
		
		bis.close();
		fis.close();
		
		// ## FileReader & BufferedReader
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		String str2 = br.readLine();
		System.out.println(str2);
				
		br.close();
		fr.close();

	}

}
