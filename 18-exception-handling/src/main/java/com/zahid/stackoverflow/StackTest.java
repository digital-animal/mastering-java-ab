package com.zahid.stackoverflow;

public class StackTest {
	public static void main(String[] args) {
		Stack s = new Stack(5);
		s.pop();
		s.push(4);
		s.push(9);
		s.push(2);
		s.push(3);
		s.push(5);
		s.printStack();
		s.pop();
		s.printStack();
		s.push(7);
		s.printStack();
		s.push(8);
		s.printStack();
		System.out.println(s.top());
		System.out.println(s.getSize());
		s.pop();
		s.printStack();
		System.out.println(s.top());
		System.out.println(s.getSize());
	}
}
