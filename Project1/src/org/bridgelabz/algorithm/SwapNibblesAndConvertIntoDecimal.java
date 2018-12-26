package org.bridgelabz.algorithm;

import org.bridgelabz.utility.Utility;

/**
 * Purpose: In this class first we convert decimal number to binary number and Swap nibbles and find the new number.
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   26.12.2018
 */

public class SwapNibblesAndConvertIntoDecimal {
	public static void main(String[] args) {
		System.out.println("Enter Number");
		int number = Utility.getInt();
		String str = Utility.toBinary(number);
		int decimal = Utility.swapNibble(str);
		System.out.println("Decimal value of swap nibble is "+decimal);
	}
}
