package org.bridgelabz.algorithm;

import org.bridgelabz.utility.Utility;

public class BinarySearchForInteger {
	public static void main(String[] args) {
		System.out.println("Enter Distinct Sorted Integer for searched");
		int arr[] = Utility.inputArray();
		System.out.println("Entered Searched element");
		int searchedElement = Utility.getInt();
		long start = System.nanoTime();
		int index = Utility.binarySearchForInt(arr, searchedElement);
		System.out.println(index);
		long stop = System.nanoTime();
		System.out.println("Time of Binary Search for String:"+(stop-start));
	}
}
