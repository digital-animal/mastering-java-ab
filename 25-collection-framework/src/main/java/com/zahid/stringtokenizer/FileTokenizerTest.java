package com.zahid.stringtokenizer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileTokenizerTest {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("src/main/resources/user.txt");
		byte[] b = fis.readAllBytes();
		String data = new String(b);
		
//		StringTokenizer stk = new StringTokenizer(data, "=\n");
//		StringTokenizer stk = new StringTokenizer(data, "\n");
		StringTokenizer stk = new StringTokenizer(data, "");
		System.out.println(stk.countTokens());
		
		String str;
		
		while(stk.hasMoreTokens()) {
			str = stk.nextToken();
			System.out.println(str);
		}
		fis.close();

	}

}
