package org.bridgelabz.algorithm;

import org.bridgelabz.utility.Utility;
/**
 * Purpose: To sort an array by using merge sort.
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   27.12.2018
 */

public class MergeSort {
	public static void main(String[] args) {
		int arr[] = Utility.inputArray();
		int size = arr.length;
		Utility.mergeSort(arr,0,size-1);
		Utility.printArray(arr);
	}
}
