package com.zahid.property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties p = new Properties();
		
		/*p.setProperty("Brand", "Dell");
		p.setProperty("Processor", "i7");
		p.setProperty("OS", "Windows10");
		p.setProperty("Model", "Lattitude");
		
		System.out.println(p);
		
		p.storeToXML(new FileOutputStream("src/main/resources/property.xml"), "Properties Test");
		p.storeToXML(new FileOutputStream("src/main/resources/property.txt"), "Properties Test");*/
		
		p.loadFromXML(new FileInputStream("src/main/resources/person.xml"));
		
		System.out.println(p);
		System.out.println(p.getProperty("Name"));
		System.out.println(p.getProperty("Dept"));
		
		
		p.load(new FileInputStream("src/main/resources/user.txt"));
		
		System.out.println(p);
		System.out.println(p.getProperty("Name"));
		System.out.println(p.getProperty("Department"));
		System.out.println(p.getProperty("University"));
		
	}

}
