package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

/**
 * Class of the table of the power of 2
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   19-12-2018
 */

public class PowerOf2 {
	public static void main(String[] args) {
		int exponent =  Integer.parseInt(args[0]);
		while(exponent > 31 || exponent < 0){
			System.out.println("Enter exponent");
			exponent = Utility.getInt();
			System.out.println("Please enter exponent between 0 and 30");
			System.out.println("--------------------------------------");
		}
		int powerOfTwo[] = Utility.table(exponent);
		Utility.printArray(powerOfTwo);
	}
}
