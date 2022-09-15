package com.zahid.bytearray;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputTest {

	public static void main(String[] args) throws IOException {
		byte[] b = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
		ByteArrayInputStream bis = new ByteArrayInputStream(b);
		
//		int x;
//		while((x=bis.read())!=-1) {
//			System.out.print((char)x);
//		}
		
		String str = new String(bis.readAllBytes());
		System.out.println(str);
		System.out.println(bis.markSupported());
		bis.close();

	}

}
