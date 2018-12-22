package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

/**
 * This class is used to calculate the value of harmonic number.
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   20-12-2018
 */
public class HarmonicNumber {
	public static void main(String[] args) {
		int number;
		do {
		System.out.println("Enter positive integer");
		number = Utility.getInt();
		if(number <= 0)
			System.out.println("Please enter positive value");
		}while(number <= 0);
		double d = Utility.harmonicNumber(number);
		System.out.print("Nth Harmonic value is:"+d);
	}
}
