package org.bridgelabz.algorithm;

import org.bridgelabz.utility.Utility;

public class BubbleSortOfString {
	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		int size = Utility.getInt();
		String str[] = new String[size];
		System.out.println("Enter String");
		for(int i=0; i<str.length; i++) {
			str[i] = Utility.next();
		}
		long start = System.nanoTime();
		String sortedString[] = Utility.bubbleSortOfString(str);
		long stop = System.nanoTime();
		for(int i = 0; i < sortedString.length; i++)
			System.out.println(sortedString[i]+" ");
		System.out.println("Time of Bubble Sort for String:"+(stop - start));
	}
}
