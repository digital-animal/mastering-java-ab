package com.zahid.teacherstudent;

public class StudentThread extends Thread {
	public int studentNo;
	public WhiteBoard wb;
	public static int count = 1;
	
	public StudentThread(WhiteBoard wb) {
		
		this.studentNo = count++;
		this.wb = wb;
	}
	
	public void copyText() {
		String text;
		wb.getAttendance();
		do {
			text = wb.read();
			System.out.printf("# STUDENT %d copied => '%s'\n",studentNo, text);
			System.out.flush();
		} while(!text.equals("end"));
	}

	@Override
	public void run() {
		copyText();
		wb.getAttendance();
		
	}
	
}
