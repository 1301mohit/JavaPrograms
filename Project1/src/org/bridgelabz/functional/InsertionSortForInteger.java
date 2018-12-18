package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;
public class InsertionSortForInteger {
	public static void main(String[] args) {
		int arr[] = Utility.inputArray();
		int sort[] = Utility.insertionSortForInt(arr);
		System.out.println("SORTED ARRAY");
		Utility.printArray(sort);
	}
}
