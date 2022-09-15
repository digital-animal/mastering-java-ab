package com.zahid.bytearray;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayOutputTest {

	public static void main(String[] args) throws IOException {
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
		bos.write('a');
		bos.write('b');
		bos.write('c');
		bos.write('d');
		bos.write('e');
		
		byte[] b = bos.toByteArray();
		System.out.println(Arrays.toString(b));
		
		for(int x: b) {
			System.out.print((char)x);
		}
		
		bos.writeTo(new FileOutputStream("newfile.txt"));
		
		bos.close();

	}

}
