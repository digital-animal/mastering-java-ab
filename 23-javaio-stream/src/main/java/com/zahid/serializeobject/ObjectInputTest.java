package com.zahid.serializeobject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputTest {

	// # # retrieving object from file
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("src/main/resources/student_info.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		int n = ois.readInt();
		Student[] students = new Student[n];
		
		// System.out.println(n);
		
		students = (Student[]) ois.readObject(); // deserialize as a single array of object
		
		for(Student student: students) {
			System.out.println(student);
		}  
		
		// printing retrieved objects
		// for(Student x: student) {
		// 	System.out.println(x);			
		// }
		
		fis.close();
		ois.close();
	}

}
