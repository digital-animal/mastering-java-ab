package com.zahid.lambda1;

public class UseLambdaTest {

	public void methodB() {
		UseLambda ul = new UseLambda();
		
		ul.callLambda(()->{System.out.println("Hello Lambda");});
	}
	public static void main(String[] args) {
		UseLambdaTest ult = new UseLambdaTest();
		ult.methodB();
	}

}
