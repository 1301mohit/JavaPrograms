package org.bridgelabz.algorithm;

import org.bridgelabz.utility.Utility;

public class BinarySearchForInteger {
	public static void main(String[] args) {
		System.out.println("Enter Distinct Sorted Integer for searched");
		int arr[] = Utility.inputArray();
		Utility.bubbleSort(arr);
		System.out.println("\nSorted array");
		Utility.printArray(arr);
		System.out.println("\nEntered Searched element");
		int searchedElement = Utility.getInt();
		long start = System.nanoTime();
		int index = Utility.binarySearchForInt(arr, searchedElement);
		long stop = System.nanoTime();
		System.out.println("\nPosition of the element:"+(index + 1));
		System.out.println("Time of Binary Search for String:"+(stop-start));
	}
}
