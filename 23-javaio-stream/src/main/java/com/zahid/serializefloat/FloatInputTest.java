package com.zahid.serializefloat;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FloatInputTest {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("src/main/resources/float_numbers.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		int n = dis.readInt();
		float[] numbers = new float[n];
		
		for(int i=0; i<n; i++) {
			numbers[i] = dis.readFloat();
		}
		
		System.out.println(Arrays.toString(numbers));
		dis.close();
		fis.close();

	}

}
