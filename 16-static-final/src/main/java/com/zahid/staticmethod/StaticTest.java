package com.zahid.staticmethod;

public class StaticTest {

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.show();
		// t1.display(); // invalid
		t1.x = 30;
		t1.y = 50;
		t1.show();
		
		Test.display();
		
		Test t2 = new Test();
		t2.show();
	}

}
