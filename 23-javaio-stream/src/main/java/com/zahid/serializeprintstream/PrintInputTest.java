package com.zahid.serializeprintstream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;

public class PrintInputTest {
	
	// # # four reading file
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("src/main/resources/pstream.txt");
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(fis));
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		
		Student[] studentArray = {s1, s2, s3, s4, s5};
		
		int n = Integer.parseInt(br.readLine());
		System.out.println(n);

		for(Student student: studentArray) {
			student.roll = Integer.parseInt(br.readLine());
			student.name = br.readLine();
			student.dept = br.readLine();
		}
		
		// printing objects retrieved
		for(Student student: studentArray) {
			System.out.println(student);
		}
		
		fis.close();
		br.close();
	}

}
