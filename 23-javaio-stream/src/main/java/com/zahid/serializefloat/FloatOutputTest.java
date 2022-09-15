package com.zahid.serializefloat;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FloatOutputTest {

	public static void main(String[] args) throws IOException {
		
		float[] list = {4.9f, 2.3f, 5.7f, 8.1f, 6.0f};
		System.out.println(Arrays.toString(list));
		
		FileOutputStream fos = new FileOutputStream("src/main/resources/float_numbers.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		
		int n = list.length;
		
		dos.writeInt(n);
		for(float num: list) {
			dos.writeFloat(num);
		}
		
		dos.close();
		fos.close();

	}

}
