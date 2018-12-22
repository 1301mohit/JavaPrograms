package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

/**
 * Class of flipcoin print percentage of head and tail
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   19-12-2018
 */

public class FlipCoin {
	public static void main(String[] args) {
		double number;
		do {
		System.out.println("The number of times to flip coin");
		number = Utility.getDouble();
		if(number <= 0) {
			System.out.println("Please enter positive number");
		}
		}while(number <= 0);
		double percentage[] = Utility.flipCoin(number);
		System.out.println("Percentage of tail:"+percentage[0]);
		System.out.println("Percentage of head:"+percentage[1]);
	}
}
	


