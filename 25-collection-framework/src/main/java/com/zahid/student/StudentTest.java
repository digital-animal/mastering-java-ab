package com.zahid.student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		// # # writing info to file
		// FileOutputStream fos = new FileOutputStream("src/main/resources/student_info.txt");
		FileOutputStream fos = new FileOutputStream("src/main/resources/student_database.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Student s1 = new Student("Zahid", "CSE");
		Student s2 = new Student("Jewel", "EEE");
		Student s3 = new Student("Tonmoy", "ME");
		Student s4 = new Student("Hasan", "CE");
		Student s5 = new Student("Robi", "IPE");
		
//		List<Student> studentList = new ArrayList<>(List.of(s1, s2, s3, s4, s5));
//		int n = studentList.size();
//		System.out.println(n);
//		for(Student student: studentList) {
//			System.out.println(student);
//			oos.writeObject(student);
//		}
		System.out.println();

		Map<String, Student> studentMap = new HashMap<>(Map.of(s1.ID, s1, s2.ID, s2, s3.ID, s3, s4.ID, s4, s5.ID, s5));
		
		int n = studentMap.size();
		oos.writeInt(n);
		System.out.println(n);
		
		for(Map.Entry<String, Student> entry: studentMap.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
			oos.writeObject(entry.getKey());
			oos.writeObject(entry.getValue());
		}
		
		oos.close();
		fos.close();
		System.out.println();
		
		// # # reading info from file
		// FileInputStream fis = new FileInputStream("src/main/resources/student_info.txt");
		FileInputStream fis = new FileInputStream("src/main/resources/student_database.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
//		int m = ois.readInt();
//		System.out.println(m);
//		Student[] studentArray = new Student[m];
//		for(int i=0; i<m; i++) {
//			studentArray[i] = (Student)ois.readObject();
//			System.out.println(studentArray[i]);
//		}

		int m = ois.readInt();
		System.out.println(m);
		Map<String, Student> newMap = new HashMap<>();
		
		String key;
		Student value;
		
		for(int i=0; i<m; i++) {
			key = (String)ois.readObject();
			value = (Student)ois.readObject();
			
			newMap.put(key, value);
			
			System.out.println(key+": "+value);
		}
		
		ois.close();
		fis.close();
		
	}

}
