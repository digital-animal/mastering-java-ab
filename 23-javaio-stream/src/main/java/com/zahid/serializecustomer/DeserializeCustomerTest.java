package com.zahid.serializecustomer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class DeserializeCustomerTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("src/main/resources/customer_info.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		int n = ois.readInt();
		// System.out.println(n);
		
		Customer[] customerArray = new Customer[n];

		for(int i=0; i<n; i++) {
			customerArray[i] = (Customer)ois.readObject();
		}
		
		// printing retrieved customer objects
		for(Customer customer: customerArray) {
			System.out.println(customer);
		}
		
		// searching for a particular customer
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("# Enter a customer name> ");
		String name = sc.next();
		for(Customer customer: customerArray) {
			if(name.equalsIgnoreCase(customer.name)) {
				System.out.println(customer);
			}
		}
		
		sc.close();
		ois.close();
		fis.close();
	}

}
