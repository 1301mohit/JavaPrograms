package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

public class Factors {

	public static void main(String[] args) {
		System.out.println("Enter number for prime factors");
		int n = Utility.getInt();
		String st = Utility.primeFactor(n);
		System.out.println(st);
	}

}
