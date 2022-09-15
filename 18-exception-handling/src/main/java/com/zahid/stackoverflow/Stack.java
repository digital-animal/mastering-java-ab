package com.zahid.stackoverflow;

public class Stack {
	public int[] stackList;
	public int size;
	public int top;
	
	public Stack() {
		this.size = 8;
		this.top = -1;
		stackList = new int[size];
	}

	public Stack(int size) {
		this.size = size;
		this.top = -1;
		stackList = new int[size];
	}
	
	
	public int getSize() {
		return top+1;
	}

	public void push(int x) {
		try {
			if(top == size - 1)
				throw new StackOverflowException();
			stackList[++top] = x;
			
		} catch(StackOverflowException e) {
			System.out.println(e);
		}
	}
	
	public void pop() {
		try {
			if(top == -1)
				throw new StackUnderflowException();
			top--;	
			
		} catch(StackUnderflowException e) {
			System.out.println(e);
		}
	}
	
	public int top() {
		int num = -1;
		try {
			if(top == - 1)
				throw new StackUnderflowException();
			num = stackList[top];
			
		} catch(StackUnderflowException e) {
			System.out.println(e);
		}
		return num;
	}
	
	public void printStack() {
		for(int i=0; i<= top; i++) {
			System.out.print(stackList[i]+" ");
		}
		System.out.println();
	}
	
}
