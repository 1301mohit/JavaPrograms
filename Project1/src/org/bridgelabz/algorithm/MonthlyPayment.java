package org.bridgelabz.algorithm;

import org.bridgelabz.utility.Utility;

/**
 * Purpose: By using this to calculate monthlyPayment.
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   24.12.2018
 */

public class MonthlyPayment {

	public static void main(String[] args) {
		double P = Double.parseDouble(args[0]);
		double Y = Double.parseDouble(args[1]);
		double R = Double.parseDouble(args[2]);
		double Payment = Utility.monthlyPayment(P, Y, R);
		System.out.println("\nMonthly Payment:"+Payment);
	}

}
