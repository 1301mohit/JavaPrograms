package org.bridgelabz.algorithm;

import java.util.ArrayList;

import org.bridgelabz.utility.Utility;

public class Prime {
	public static void main(String[] args) {
		int number;
	do {
		System.out.println("Enter number");
		number = Utility.getInt();
		if(number < 1)
			System.out.println("Please enter positive number");
	}while(number < 1);
	ArrayList<Integer> prime = Utility.prime(number);
	System.out.println("/nList of prime number");
	System.out.println(prime);
	}
}
