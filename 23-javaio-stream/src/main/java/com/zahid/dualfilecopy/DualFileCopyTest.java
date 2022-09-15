package com.zahid.dualfilecopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class DualFileCopyTest {

	public static String source1 = "src/main/resources/source1.txt";
	public static String source2 = "src/main/resources/source2.txt";
	public static String destination = "src/main/resources/destination.txt";

	public static void main(String[] args) {
		
		try {
			FileInputStream fis1 = new FileInputStream(source1);
			FileInputStream fis2 = new FileInputStream(source2);
			SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
			FileOutputStream fos = new FileOutputStream(destination);
			
			byte[] text = sis.readAllBytes();
			
			String str = new String(text);
			System.out.println(str);
			
			fos.write(text);
			
			fis1.close(); 
			fis2.close(); 
			sis.close(); 
			fos.close(); 
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
