package com.zahid.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputExample {

	public static String filePath = "src/main/resources/source.txt";

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream(filePath);
			
			// byte[] b = fis.readAllBytes();
			// for(byte x: b) {
			// 	System.out.print((char)x);
			// }
			
			byte[] b = new byte[fis.available()];
			fis.read(b);
			
			String str = new String(b);
			System.out.println(str);
			
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
			
		} catch (IOException e) {
			System.out.println(e);

		}
 
	}

}
