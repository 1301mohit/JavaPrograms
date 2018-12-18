package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

public class BubbleSortOfInteger {
	public static void main(String[] args) {
		int a[] = Utility.inputArray();
		int b[] = Utility.bubbleSort(a);
		System.out.println("Sorted Array");
		Utility.printArray(b);
	}
}
