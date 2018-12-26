package org.bridgelabz.algorithm;

import org.bridgelabz.utility.Utility;

/**
 * Purpose: This class is used for the conversion from decimal number to Binary Number.
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   26.12.2018
 */

public class DecimalToBinaryConversion {

	public static void main(String[] args) {
		System.out.println("Enter number");
		int number = Utility.getInt();
		String binaryNo = Utility.toBinary(number);
		System.out.println("Binary number of "+number+" is "+binaryNo);
	}
}
