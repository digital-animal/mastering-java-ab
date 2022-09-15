package com.zahid.methodref;

public class LambdaTest {
	
	public LambdaTest() {
		
	}
	public LambdaTest(String str) {
		System.out.println(str.toUpperCase());
	}
	
	public void reverse(String str) {
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.err.println(sb);
	}
//	
//	public static void reverse(String str) {
//		StringBuffer sb = new StringBuffer(str);
//		sb.reverse();
//		System.out.println(sb);
//	}
	
	public static void main(String[] args) {
		IDisplay x = System.out::println;
		x.display("Hello World");
		
		LambdaTest obj = new LambdaTest();
		IDisplay y = obj::reverse;
		y.display("Hello");
		
//		IDisplay y = LambdaTest::reverse;
//		y.display("Hello");
//		
		IDisplay z = LambdaTest::new;
		z.display("Hello there");
	}
}
