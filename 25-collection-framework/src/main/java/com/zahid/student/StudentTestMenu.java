package com.zahid.student;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentTestMenu {
	
	public static Map<String, Student> studentMap = new HashMap<>();

	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		
		File f = new File("src/main/resources/student_database.txt");
		
//		if(f.exists() && !(f.length() == 0))
//			preloadHashMap();

		preloadHashMap();

		Scanner scan = new Scanner(System.in);
		int choice;

		while(true) {
			System.out.println("============= M E N U =============");
			System.out.println("1. CREATE ACCOUNT");
			System.out.println("2. DELETE ACCOUNT");
			System.out.println("3. VIEW AN ACCOUNT");
			System.out.println("4. VIEW ALL ACCOUNTS");
			System.out.println("5. SAVE ACCOUNTS");
			System.out.println("6. QUIT");
			System.out.println("============= M E N U =============");
			System.out.print("# Enter your choice> ");
			choice = scan.nextInt();
			
			switch (choice) {
			case 1:
				createAccount();
				break;
				
			case 2:
				deleteAccount();
				break;
				
			case 3:
				displayAnAccount();
				
				break;
			case 4:
				displayAllAccount();
				break;
				
			case 5:
				saveAllAccount();
				break;
				
			case 6:
//				scan.close();
				System.exit(0);
				break;

			default:
//				scan.close();
				choice = 6;
				break;
			} // end of switch case

		} // end of while

	} // end of main
	
	public static void createAccount() throws IOException {
		
		FileOutputStream fos = new FileOutputStream("src/main/resources/student_database.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		String name;
		String dept;

		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("# Enter name> ");
		name = sc.nextLine();
		System.out.print("# Enter department> ");
		dept = sc.nextLine();
		
		Student student = new Student(name, dept);
	
		studentMap.put(student.ID, student);
		n = studentMap.size();
		oos.writeInt(n);
		
		for(String key: studentMap.keySet()) {
			oos.writeObject(key);
			oos.writeObject(studentMap.get(key));
			
		}
		System.out.println("# Account Created Successfully");
		System.out.println("# Your ID: "+student.ID);
		
//		sc.close();
		oos.close();
		fos.close();
		
	}
	
	public static void deleteAccount() throws IOException {
		
		FileOutputStream fos = new FileOutputStream("src/main/resources/student_database.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Scanner sc = new Scanner(System.in);
		
		String studentID;
		System.out.print("# Enter student ID> ");
		studentID = sc.nextLine();
		
		int n = studentMap.size();
		if(studentMap.keySet().contains(studentID))	
		{
			n--;
			oos.writeInt(n);
		}
		else {
			System.out.println("Invalid ID");
			return;
		}
		
		for(String key: studentMap.keySet()) {
			
			if(!key.equals(studentID)) {
				oos.writeObject(key);
				oos.writeObject(studentMap.get(key));				
			}
			
		}
		System.out.println("# Account Deleted Successfully");
		
	}
	
	public static void displayAnAccount() throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("src/main/resources/student_database.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Scanner sc = new Scanner(System.in);
		
		String studentID;
		System.out.print("# Enter student ID> ");
		studentID = sc.nextLine();
		
		int n = ois.readInt();
		
		String key;
		Student student;
		
		for(int i=0; i<n; i++) {
			
			key = (String) ois.readObject();
			student = (Student) ois.readObject();
	
			if(studentID.equals(key)) {
				System.out.println(key+" => "+student);
			}
		}
		
//		sc.close();
		ois.close();
		fis.close();
	}
	
	public static void displayAllAccount() throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("src/main/resources/student_database.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Scanner sc = new Scanner(System.in);

		int n = ois.readInt();
		
		String key;
		Student student;
		
		for(int i=0; i<n; i++) {
			
			key = (String) ois.readObject();
			student = (Student) ois.readObject();

			System.out.println(key+" => "+student);
		}
		
//		sc.close();
		ois.close();
		fis.close();
	}
	
	public static void saveAllAccount() {
		// pass
	}
	
	public static void preloadHashMap() throws IOException, ClassNotFoundException, InterruptedException {
		
		System.out.println("# Loading Map..");
		Thread.sleep(2000);
		
		FileInputStream fis = new FileInputStream("src/main/resources/student_database.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		int n = ois.readInt();
		System.out.println(n);
		
		String key;
		Student student;
		
		for(int i=0; i<n; i++) {
			
			key = (String) ois.readObject();
			student = (Student) ois.readObject();
			studentMap.put(key, student);
		}
		
		System.out.println("# Map Loaded Successfully.");
		System.out.println("# System Ready to Run.");
		ois.close();
		fis.close();
	}
	
	

}
