package org.bridgelabz.algorithm;

import java.util.ArrayList;

import org.bridgelabz.utility.Utility;

/**
 * Purpose: List of the prime numbers that are Anagram and Palindrome.
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   24.12.2018
 */

public class AnagramPallindromePrimeNumber {
	public static void main(String[] args) {
		String string1 = null;
		String string2 = null;
		System.out.println("Enter the range of the prime number");
		int number = Utility.getInt();
		ArrayList<Integer> prime = Utility.prime(number);
		System.out.println("\nPrime numbers that are Anagram and Palindrome\n");
		for(int i=0; i<prime.size(); i++) {
			for(int j=i+1; j<prime.size(); j++) {
				string1 = Integer.toString(prime.get(i));
				string2 = Integer.toString(prime.get(j));
				if(Utility.isAnagram(string1, string2))
				{
					if(Utility.isPallindrom(Integer.parseInt(string1 + string2))) 
						System.out.println(string1+" "+string2);
				}
			}
		}
	}
}
