package org.bridgelabz.functional;

import java.util.ArrayList;
import org.bridgelabz.utility.Utility;

/**
 * purpose: Number of distinct triplets as well as print distinct triplets
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   20-12-2018
 */

public class SumOfThreeIntegersAddToZero {
	public static void main(String[] args) {
		System.out.println("Enter number of integers:");
		int number = Utility.getInt();
		int arrayInteger[] = new int[number];
		System.out.println("Enter integers");
		for(int i=0; i<arrayInteger.length; i++)
			arrayInteger[i] = Utility.getInt();
		int count = 0;
		ArrayList<String> arr = new ArrayList<String>();
		System.out.println("Distinct Triplets are");
		for(int i=0; i<arrayInteger.length; i++) {
			for(int j=i+1; j<arrayInteger.length; j++) {
				for(int k=j+1; k<arrayInteger.length; k++) {
					int sum = arrayInteger[i] + arrayInteger[j] + arrayInteger[k];
					if(sum == 0) {
						String st = " ";
						System.out.println(arrayInteger[i] + " " + arrayInteger[j] + " " + arrayInteger[k]);
						count++;
						st = st + arrayInteger[i] + arrayInteger[j] + arrayInteger[k];
						arr.add(st);
					}
				}
			}
		}
		System.out.println("Number of distinct triplets");
		System.out.println(count);
	}
}
