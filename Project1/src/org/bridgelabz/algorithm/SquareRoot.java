package org.bridgelabz.algorithm;

import org.bridgelabz.utility.Utility;

/**
 * Purpose: This class is used for to find out the square root of the non negative number.
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   26.12.2018
 */

public class SquareRoot {
	public static void main(String[] args) {
		double number;
		do {
			System.out.println("Enter non-negative number");
			number = Utility.getDouble();
			if(number <= 0.0)
				System.out.println("Please enter non-negative number");
		}while(number <= 0.0);
		System.out.println("------");
		double squareRootValue = Utility.squareRoot(number);
		System.out.println("Square root of "+number+" is "+ squareRootValue);
	}
}
