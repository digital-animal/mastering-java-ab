package com.zahid.randomaccess;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		RandomAccessFile rf = new RandomAccessFile("src/main/resources/Data.txt", "rw");
		
		System.out.print((char)rf.read());
		System.out.print((char)rf.read());
		System.out.print((char)rf.read());
		
		rf.write('K');
		System.out.print((char)rf.read());
		System.out.print((char)rf.read());
		
		rf.skipBytes(3);
		System.out.print((char)rf.read());
		rf.seek(2);
		System.out.print((char)rf.read());
		System.out.print(rf.getFilePointer());
		System.out.print((char)rf.read());
		System.out.print(rf.getFilePointer()+2);
		System.out.print((char)rf.read());
		System.out.print(rf.getFilePointer()-4);
		System.out.print((char)rf.read());

		rf.close();
	}

}
