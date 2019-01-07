package org.bridgelabz.datastructure;

/**
 * Purpose: Stack
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   03.01.2019
 * @param <T> Generic type
 */
public class Stack<T> {
	int capacity;
	int top = -1;
	Object stack[];
	public Stack(int capacity){
		this.capacity = capacity;
		stack = new Object[capacity];
	}
	
	/*
	 * Purpose: Add the new data in the stack.
	 * 
	 * @param   data new data
	 * @return  True or False check new data add or not
	 */
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
	
	/*
	 * Purpose: Remove the data from the stack.
	 * 
	 * @param   data 
	 * @return  generic removed data.
	 */
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
	
	/*
	 * Purpose: To display the data.
	 */
	public String toString() {
		String st = "";
		for(int i=0; i<=top; i++) {
			st = st + stack[i];
			if(i<top)
				st = st + ",";
		}
		return st;
	}
	
	/*
	 * Purpose: To peek the last data of the stack.
	 *  
	 * @return  generic last data of the stack.
	 */
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
	
	/*
	 * Purpose: To check stack is empty or not.
	 * 
	 * @return True or False.
	 */
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
