package org.bridgelabz.datastructure;

public class Stack<T> {
	int capacity;
	int top = -1;
	Object stack[];
	public Stack(int capacity){
		this.capacity = capacity;
		stack = new Object[capacity];
	}
	public boolean push(T data) {
		if(top == (capacity -1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			stack[++top] = data;
			return true;
		}
	}
	public T pop(T data) {
		Object temp;
		if(top == -1) {
			System.out.println("Stack underflow");
			return null;
		}
		else {
			temp = stack[top];
			stack[top--] = null;
			return (T)temp;
		}
	}
	public String toString() {
		String st = "";
		for(int i=0; i<=top; i++) {
			st = st + stack[i];
			if(i<top)
				st = st + ",";
		}
		return st;
	}
	public T peek() {
		Object temp;
		if(top == -1) {
			System.out.println("Stack Underflow");
			return null;
		}
		else {
			temp = stack[top];
			return (T)temp;
		}
	}
	public boolean isEmpty() {
		if(top == -1)
			return true;
		else
			return false;
	}
	public int size() {
		return top + 1;
	}
}
