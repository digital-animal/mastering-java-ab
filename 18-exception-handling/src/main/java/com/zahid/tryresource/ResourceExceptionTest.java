package com.zahid.tryresource;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ResourceExceptionTest {
	
	
	public static void readingFile() throws IOException {
		String fileName = "newfile.txt";
		String separator = File.separator;
		String filePath = "src" + separator + "main" + separator + "resources" + separator + fileName; 

		FileReader f = null;
		
		try {
			f = new FileReader(filePath);	
			
		} finally {
			try {
				f.close();							
			} catch(NullPointerException e1) {
				System.out.println(e1.getMessage());
			}
		}
	}

	public static void main(String[] args) {

		try {
			readingFile();			
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
