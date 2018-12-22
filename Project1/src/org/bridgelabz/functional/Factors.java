package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

/**
 * By using this class print prime factors of number N.
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   19-12-2018
 */

public class Factors {
	public static void main(String[] args) {
		System.out.println("Enter number for prime factors");
		int number = Utility.getInt();
		String str = Utility.primeFactor(number);
		System.out.println(str);
	}
}
