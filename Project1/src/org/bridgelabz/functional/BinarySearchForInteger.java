package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

public class BinarySearchForInteger {
	public static void main(String[] args) {
		int arr[] = Utility.inputArray();
		System.out.println("Enter Distinct Sorted Integer for searched");
		int searchedElement = Utility.getInt();
		int index = Utility.binarySearchForInt(arr, searchedElement);
		System.out.println(index);
	}
}
