package com.zahid.tryresource;
import java.io.*;
import java.util.*;


public class FileExceptionTest2 {
	
	public static void divide() throws Exception {
		String fileName = "test.txt";
		String separator = File.separator;

		String filePath = "src" + separator + "main" + separator + "resources" + separator + fileName; 
		
		// try with finally
		try(FileInputStream fis = new FileInputStream(filePath); 
			Scanner sc = new Scanner(fis)) {	
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			System.out.println(a/b);
			System.out.println(a/c);
		}
	}

	public static void main(String[] args) throws Exception {
		
		try {
			divide();			
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
