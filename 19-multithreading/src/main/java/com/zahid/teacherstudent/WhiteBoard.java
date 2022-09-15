package com.zahid.teacherstudent;

public class WhiteBoard {
	private static WhiteBoard instance = null;
	public String text;
	public int count = 0;
	public int numberOfStudents = 0;

	public WhiteBoard() {

	}
	
	public static WhiteBoard getInstance() {
		if(instance == null) {
			instance = new WhiteBoard();
		}
		return instance;
	}
	
	synchronized public void write(String message) { // teacher writes to
		System.out.println("# TEACHER is writing => "+message);
		while(count!=0) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				System.out.println(e);;
			}
		}
		this.text = message;
		count = numberOfStudents;
		notifyAll();
		
	}
	
	synchronized public String read() { // student reads from
		
		while(count == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				System.out.println(e);;
			}
		}
		count--;
		if(count==0)
			notify();
		
		return this.text;
	}
	
	public void getAttendance() {
		numberOfStudents++;
	}
	
}
