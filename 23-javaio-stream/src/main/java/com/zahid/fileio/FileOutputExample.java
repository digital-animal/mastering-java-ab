package com.zahid.fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample {

	public static String filePath = "src/main/resources/output.txt";

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			String str = "Learn Java Programming";
			// fos.write(str.getBytes());
			
			byte[] b = str.getBytes();
			fos.write(b); 
			
			// for(byte x:b)
			// 	fos.write(x);
			
			// fos.write(b, 6, 4);
			// fos.write(b, 6, str.length()-6);
			
			fos.close();
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
