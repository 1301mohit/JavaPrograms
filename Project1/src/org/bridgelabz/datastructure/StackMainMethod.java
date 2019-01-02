package org.bridgelabz.datastructure;

import org.bridgelabz.utility.Utility;

public class StackMainMethod {
	public static void main(String[] args) {
		System.out.println("Enter Size");
		int capacity = Utility.getInt();
		Stack s = new Stack(capacity);
		System.out.println(s);
		s.push("10");
		s.push("20");
		System.out.println(s);
		System.out.println(s.pop("20"));
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.isEmpty());
		System.out.println(s.size());
	}
}
