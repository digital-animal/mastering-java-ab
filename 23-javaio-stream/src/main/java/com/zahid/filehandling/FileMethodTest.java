package com.zahid.filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileMethodTest {

	public static String dir = "src/main/resources";
	public static void main(String[] args) throws IOException {
		File f = new File(dir);
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		
		System.out.println(Arrays.toString(f.list()));
		String[] list = f.list();
		for(String x: list) {
			System.out.println(x);
		}
		
		System.out.println(Arrays.toString(f.listFiles()));
		
		File[] fileList = f.listFiles();
		for(File t:fileList) {
			System.out.println(t.getName());
//			System.out.println(t);
//			System.out.println(t.getPath());
//			System.out.println(t.getAbsolutePath());
//			System.out.println(t.getParent());
//			System.out.println(t.getParentFile());
		}
		
	}

}
