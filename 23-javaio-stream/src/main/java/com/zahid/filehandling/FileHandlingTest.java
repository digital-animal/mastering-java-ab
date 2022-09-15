package com.zahid.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingTest {

	public static String filePath = "src/main/resources/Data.txt";
	public static void main(String[] args) throws IOException {

		
		File f = new File(filePath);
		// f.setReadOnly();
		f.setWritable(true);
		
		FileOutputStream fos = new FileOutputStream(filePath);
		System.out.println(f.length());
		
		System.out.println(f.isHidden());
		System.out.println(f.exists());
		System.out.println(f.getName());
		System.out.println(f.getTotalSpace());
		System.out.println(f.getFreeSpace());
		System.out.println();

		fos.close();
	}

}
