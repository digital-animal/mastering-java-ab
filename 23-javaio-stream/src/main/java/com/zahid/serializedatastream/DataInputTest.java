package com.zahid.serializedatastream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputTest {
	
	// # # reading file using DataInputStream
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/main/resources/student.txt");
		DataInputStream dis = new DataInputStream(fis); 
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		
		Student[] studentArray = {s1, s2, s3, s4, s5};
		
		int n = dis.readInt();
		System.out.println(n);
		
		for(Student student: studentArray ) {
			student.roll = dis.readInt();
			student.name = dis.readUTF();
			student.dept = dis.readUTF();
		}
		
		// printing retrieved objects	
		for(Student student: studentArray ) {
			System.out.println(student);
		}
		
		fis.close();
		dis.close();
			
	}

}
