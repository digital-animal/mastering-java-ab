package com.zahid.serializedatastream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputTest {
	
	// # # writing file using DataOutputStream
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("src/main/resources/student.txt");
		DataOutputStream dos = new DataOutputStream(fos); 
		
		Student s1 = new Student(101, "Zahid", "CSE");
		Student s2 = new Student(102, "Robi", "EEE");
		Student s3 = new Student(103, "Hasan", "ME");
		Student s4 = new Student(104, "Tonmoy", "CE");
		Student s5 = new Student(105, "Jewel", "CSE");
		
		Student[] studentArray = {s1, s2, s3, s4, s5};
		
		int n = studentArray.length;
		
		dos.writeInt(n);
		for(Student student: studentArray ) {
			dos.writeInt(student.roll);
			dos.writeUTF(student.name);
			dos.writeUTF(student.dept);
		}
		
		fos.close();
		dos.close();
	}
	
}
