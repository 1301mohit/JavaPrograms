package org.bridgelabz.algorithm;

import org.bridgelabz.utility.Utility;

public class BinarySearchForString {
	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		int size = Utility.getInt();
		String strarr[] = new String[size]; 
		System.out.println("Enter distinct sorted String");
		for(int i = 0; i < size; i++) 
			strarr[i] = Utility.next();
		System.out.println("Entered Searched String");
		String searchedStr = Utility.next();
		long start = System.nanoTime();
		int index = Utility.binarySearchForString(strarr, searchedStr);
		long stop = System.nanoTime();
		System.out.print("Index of searched element:"+index);
		System.out.println("Time of Binary Search for String:"+(stop-start));
	}
}
