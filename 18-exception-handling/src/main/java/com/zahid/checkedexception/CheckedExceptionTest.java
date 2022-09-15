package com.zahid.checkedexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionTest {

	public static void main(String[] args) {

		FileInputStream fis = null;		
		try {
			fis = new FileInputStream("myfile.txt");

		} catch (FileNotFoundException e1) {
			System.out.println(e1.getMessage());
		} finally {
			try {
				fis.close();
			} catch (IOException e2) {
				System.out.println(e2);
			}
		}
	}

}
