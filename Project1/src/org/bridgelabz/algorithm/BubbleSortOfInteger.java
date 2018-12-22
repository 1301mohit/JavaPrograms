package org.bridgelabz.algorithm;

import org.bridgelabz.utility.Utility;

public class BubbleSortOfInteger {
	public static void main(String[] args) {
		int a[] = Utility.inputArray();
		long start = System.nanoTime(); 
		int b[] = Utility.bubbleSort(a);
		long stop = System.nanoTime();
		System.out.println("Sorted Array");
		Utility.printArray(b);
		System.out.println("Time of Bubble Sort for Integer:"+(stop-start));
	}
}
