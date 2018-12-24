package org.bridgelabz.algorithm;

import org.bridgelabz.utility.Utility;

public class VendingMachine {
	public static void main(String[] args) {
		int sum = 0;
		System.out.println("Enter amount:");
		int amount = Utility.getInt();
		System.out.println("\nTotal number of note:"+Utility.fewest(amount, sum));
	}
}
