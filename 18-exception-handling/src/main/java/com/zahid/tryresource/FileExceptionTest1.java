package com.zahid.tryresource;
import java.io.*;
import java.util.*;


public class FileExceptionTest1 {
	
	static FileInputStream fis;
	static Scanner sc;
	
	public static void divide() throws Exception {
		String fileName = "test.txt";
		String separator = File.separator;
		
		String filePath = "src" + separator + "main" + separator + "resources" + separator + fileName; 
		System.out.println(filePath);
		
		fis = new FileInputStream(filePath);
		
		try {			
			sc = new Scanner(fis);
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			System.out.println(a/b);
			System.out.println(a/c);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			fis.close();
			sc.close();			
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
