package com.zahid.filecopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static String source = "src/main/resources/source.txt";
	public static String destination = "src/main/resources/target.txt";

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(destination);
			
			byte[] text = fis.readAllBytes();
			
			String str = new String(text);
			System.out.println(str);
			System.out.println();
			
			str = str.toLowerCase();
			System.out.println(str);
			
			byte[] convertedText = str.getBytes();
			fos.write(convertedText);
			
			fis.close();
			fos.close();
		} catch (FileNotFoundException e) {
			System.out.println(e); 
		} catch (IOException e) {
			System.out.println(e);
		}

	}
}
