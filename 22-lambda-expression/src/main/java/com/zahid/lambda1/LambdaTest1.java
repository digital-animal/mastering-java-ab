package com.zahid.lambda1;

public class LambdaTest1 {
	int x = 10;
	public void methodA() {
		final int count = 0; 
		IDisplay m = ()->{
			System.out.println("Hello there..");
			System.out.println(count);
			System.out.println(++x);  
		};
		m.display();

	}
	public static void main(String[] args) {
		LambdaTest1 d = new LambdaTest1();
		d.methodA();
	}
} 
