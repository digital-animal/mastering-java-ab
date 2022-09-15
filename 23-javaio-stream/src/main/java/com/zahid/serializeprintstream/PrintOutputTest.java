package com.zahid.serializeprintstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintOutputTest {

	// # # four writing data to file
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("src/main/resources/pstream.txt");
		PrintStream ps = new PrintStream(fos);
		
		Student s1 = new Student(101, "Zahid", "CSE");
		Student s2 = new Student(102, "Robi", "EEE");
		Student s3 = new Student(103, "Hasan", "ME");
		Student s4 = new Student(104, "Tonmoy", "CE");
		Student s5 = new Student(105, "Jewel", "CSE");
		
		Student[] studentArray = {s1, s2, s3, s4, s5};
		
		ps.println(studentArray.length);
		for(Student student: studentArray) {
			System.out.println(student);
			ps.println(student.roll);
			ps.println(student.name);
			ps.println(student.dept);
		}
		
		fos.close();
		ps.close();
	}

}
