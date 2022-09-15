package com.zahid.student;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;

public class Student implements Serializable {
	public String ID;
	public String name;
	public String department;
	public static int count;
	
	public Student() {
		// pass
	}
	public Student(String name, String department) throws IOException {
		this.ID = generateID();
		this.name = name;
		this.department = department;
	}
	
	public static String generateID() throws IOException {

		String  newID;
		File f = new File("src/main/resources/counter.txt");
		
		if(!f.exists()) {
			count = 1;
		}
		else {
			FileInputStream fis = new FileInputStream("src/main/resources/counter.txt");
			DataInputStream dis = new DataInputStream(fis);
			
			count = dis.readInt();
			
			dis.close();
			fis.close();			
			
		}
		newID = String.format("S%03d", count++);

		FileOutputStream fos = new FileOutputStream("src/main/resources/counter.txt");
		DataOutputStream dos = new DataOutputStream(fos);	
		dos.writeInt(count);
	
		dos.close();
		fos.close();
	
		return newID;
	}
	
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", name=" + name + ", department=" + department + "]";
	}
	
}
