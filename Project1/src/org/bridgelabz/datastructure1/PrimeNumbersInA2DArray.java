package org.bridgelabz.datastructure1;

import org.bridgelabz.utility.Utility;

/**
 * Purpose: To represent the prime numbers in the range of 0 - 1000 in 2D array.
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   03.01.2019
 */
public class PrimeNumbersInA2DArray {

	public static void main(String[] args) {
		System.out.println("Enter range");
		int range = Utility.getInt();
		String prime[][] = Utility.primeNumbersInA2DArray(range);
		for(int i=0; i<prime.length; i++) {
			for(int j=0; j<prime[0].length; j++) {
				if(prime[i][j] != null)
					System.out.print(prime[i][j]+"  ");
			}
			System.out.println();
			System.out.println();
		}
	}

}
