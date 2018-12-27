package org.bridgelabz.algorithm;

import org.bridgelabz.utility.Utility;

/**
 * Purpose: To write the program of guess number between 0 to userinput number - 1.
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   27.12.2018
 */

public class ToFindYourNumber {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		System.out.println("Think of a number between 0 and "+(N-1));
		int f = 0, l = N-1;
		int guessNumber = Utility.toFindYourNumber(f,l);
		if(guessNumber == -1)
			System.out.println("Please enter right choice");
		System.out.println("Guess Number:"+guessNumber);
	}
}
