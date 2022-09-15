package com.zahid.serializecustomer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeCustomerTest {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("src/main/resources/customer_info.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Customer c1 = new Customer("Zahid", "123456");
		Customer c2 = new Customer("Jewel", "112489");
		Customer c3 = new Customer("Robi", "492357");
		Customer c4 = new Customer("Tonmoy", "816049");
		Customer c5 = new Customer("Hasan", "235710");

		Customer[] customers = {c1, c2, c3, c4, c5};
		int n = customers.length;
		
		oos.writeInt(n);
		for(Customer c: customers) {
			oos.writeObject(c);
		}
		
		oos.close();
		fos.close();
	}

}
