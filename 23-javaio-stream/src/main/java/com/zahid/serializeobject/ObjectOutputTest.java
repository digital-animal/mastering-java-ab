package com.zahid.serializeobject;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputTest {
	
	// # # writing object to file
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("src/main/resources/student_info.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Student s1 = new Student(101, "Zahid", "CSE");
		Student s2 = new Student(102, "Robi", "EEE");
		Student s3 = new Student(103, "Hasan", "ME");
		Student s4 = new Student(104, "Tonmoy", "CE");
		Student s5 = new Student(105, "Jewel", "CSE");
		
		Student[] studentArray = {s1, s2, s3, s4, s5};
		
		int n = studentArray.length;
		
		oos.writeInt(n);
		oos.writeObject(studentArray);
		
		// for(Student student: studentArray ) {
		// 	oos.writeObject(student);
		// }
		
		fos.close();
		oos.close();
	}

}
