package org.bridgelabz.algorithm;

import org.bridgelabz.utility.Utility;
public class InsertionSortForInteger {
	public static void main(String[] args) {
		int arr[] = Utility.inputArray();
		long start = System.nanoTime();
		int sort[] = Utility.insertionSortForInt(arr);
		long stop = System.nanoTime();
		System.out.println("SORTED ARRAY");
		Utility.printArray(sort);
		System.out.println("Time of Insertion Sort for Integer:"+(stop - start));
	}
}
