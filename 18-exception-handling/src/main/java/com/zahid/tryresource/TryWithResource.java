package com.zahid.tryresource;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource { 
	
	public static void readingFile() throws IOException {
		String fileName = "newfile.txt";
		String separator = File.separator;

		String filePath = "src" + separator + "main" + separator + "resources" + separator + fileName; 
		try(FileReader f = new FileReader(filePath)) {
			// pass
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
