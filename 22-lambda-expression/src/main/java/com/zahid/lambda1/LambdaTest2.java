package com.zahid.lambda1;

public class LambdaTest2 {

	public static void main(String[] args) {
//		IMyLambda ml = new MyLambda();
//		ml.display();
//		
//		MyLambda m = new MyLambda();
//		m.display();
		
		
		// anonymous inner class
	
//		IMyLambda l = new IMyLambda() {
//			public void display() {
//				System.out.println("Hello World.");
//			}
//		};
//		l.display(); 
		
		IDisplay l  = () -> { System.out.println("Hello World.");};		
		l.display();
		
		IEven x = (num) -> { return num%2==0; };
		System.out.println(x.isEven(4));
		System.out.println(x.isEven(9));
		
//		IAddition c = (a, b) -> {return a+b;};
		IAddition c = (a, b) -> a+b;
		System.out.println(c.add(4, 9));
		
	}

}
