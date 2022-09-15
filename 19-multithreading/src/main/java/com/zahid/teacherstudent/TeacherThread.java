package com.zahid.teacherstudent;

import java.util.List;

public class TeacherThread extends Thread {
	List<String> stringList;
	WhiteBoard wb;
	
		
	public TeacherThread(List<String> stringList, WhiteBoard wb) {
		
		this.stringList = stringList;
		this.wb = wb;
	}

	public void writeInBoard() {
		
		for(int i=0; i<stringList.size(); i++) {
			
			String message = stringList.get(i);
			wb.write(message);
		}
	}

	@Override
	public void run() {
		writeInBoard();
	}
	
}
