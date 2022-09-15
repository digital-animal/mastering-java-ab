package com.zahid.interfacerules;

public interface ITest1 {
	public final static int X=492; // const, by default static and final
	public abstract void methodA();
	public abstract void methodB();
	
	public static void methodC() {
		System.out.println("# Inside ITest1. methodC() static final");
	}
	
	public default void methodE() {
		System.out.println("# Inside ITest1. methodE() default");
		methodF();
	}
	
	private void methodF() {
		System.out.println("# Inside ITest1. methodF() private");
	}
}
