package com.zahid.teacherstudent;

import java.util.ArrayList;
import java.util.List;

public class WhiteBoardTest {

	public static void main(String[] args) {
		List<String> messages = new ArrayList<>();
		
		String str1 = "Java is an OOP Language";
		String str2 = "Java Supports Multi Threading";
		String str3 = "Design Pattern is essential in Software Engineering";
		String str4 = "Mutex, Semaphore, Monitor & IPC";
		String str5 = "end";
		
		messages.add(str1);
		messages.add(str2);
		messages.add(str3);
		messages.add(str4);
		messages.add(str5);
		
		WhiteBoard wb = WhiteBoard.getInstance();
		
		TeacherThread t1= new TeacherThread(messages, wb);
		StudentThread s1 = new StudentThread(wb);
		StudentThread s2 = new StudentThread(wb);
		StudentThread s3 = new StudentThread(wb);
		StudentThread s4 = new StudentThread(wb);
		
		t1.start();
		s1.start();
		s2.start();
		s3.start();
		s4.start();
	}

}
