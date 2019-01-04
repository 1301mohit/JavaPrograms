package org.bridgelabz.datastructure1;

import java.util.ArrayList;

import org.bridgelabz.utility.Utility;

/**
 * Purpose: We can calculate Prime Number Program and store only the numbers  that are Anagrams.
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   2.01.2019
 */
public class AnagramPrimeNumbersIn2DArrays {

	public static void main(String[] args) {
		String string1 = "";
		String string2 = "";
		int k = 0;
		System.out.println("Enter the range of the prime number");
		int number = Utility.getInt();
		ArrayList<Integer> prime = Utility.prime(number);
		int row = prime.size();
		String anagram[][] = new String[row][2];
		System.out.println("\nPrime numbers that are Anagram\n");
		for(int i=0; i<prime.size(); i++) {
			for(int j=i+1; j<prime.size(); j++) {
				string1 = Integer.toString(prime.get(i));
				string2 = Integer.toString(prime.get(j));
				if(Utility.isAnagram(string1, string2))
				{
						anagram[k][0] = string1;
						anagram[k][1] = string2;
						k++;
				}
			}
		}
		for(int i=0; i<k; i++) {
			for(int j=0; j<anagram[0].length; j++) {
				System.out.printf(anagram[i][j]+" ");
			}
			System.out.println();
		}
	}

}
