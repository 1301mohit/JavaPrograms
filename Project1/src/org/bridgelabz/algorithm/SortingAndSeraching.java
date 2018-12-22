package org.bridgelabz.algorithm;

import java.util.SortedMap;
import java.util.TreeMap;

import org.bridgelabz.utility.Utility;

/**
 * Purpose:  In this class using stopwatch the Elapsed Time for every method call of sorting and searching.
 * 
 * @author   Mohit Kumar
 * @version  1.0
 * @since    22.12.2018
 */

public class SortingAndSeraching {
	public static void main(String[] args) {
		System.out.println("1.BinarySearch for Integer");
		System.out.println("2.BinarySearch for String");
		System.out.println("3.BubbleSort for Integer");
		System.out.println("4.BubbleSort for String");
		System.out.println("5.InsertionSort for Integer");
		System.out.println("6.InsertionSort for String");
		
		System.out.println("\nBinarySearch method for integer\n");
	    int integerArray[] = Utility.inputArray();
		integerArray = Utility.bubbleSort(integerArray);
		System.out.println("\nElements in sorted form");
		Utility.printArray(integerArray);
		System.out.println("\nEnter integer for searched");
		int searchedElement = Utility.getInt();
		long start = System.nanoTime();
		int index = Utility.binarySearchForInt(integerArray, searchedElement);
		long stop = System.nanoTime();
		if(index != -1) {
			System.out.println("\nPosition of the element");
			System.out.println(index + 1);
		}
		else
			System.out.println("\nElement is not present");
		long time1 = stop - start;
		System.out.println("\nTime for Binary Search of Integer:"+time1);
		System.out.println("-------------------------------------------------");
		
		System.out.println("\nBinarySearch method for String");
		System.out.println("\nEnter the size of the array");
		int size = Utility.getInt();
		String stringArray[] = new String[size]; 
		System.out.println("\nEnter String");
		for(int i = 0; i < size; i++) 
			stringArray[i] = Utility.next();
		stringArray = Utility.bubbleSortOfString(stringArray);
		System.out.println("\nElements in sorted order");
		for(int i = 0; i < size; i++)
			System.out.print(stringArray[i]+" ");
		System.out.println();
		System.out.println("\nEntered Searched String");
		String searchedString = Utility.next();
		start = System.nanoTime();
		index = Utility.binarySearchForString(stringArray, searchedString);
		stop = System.nanoTime();
		long time2 = stop - start;
		if(index != -1) {
			System.out.println("\nPosition of searched element");
			System.out.println(index + 1);
		}
		else
			System.out.println("\nElement is not present");
		System.out.println("\nTime of Binary Search for String:"+time2);
		System.out.println("-------------------------------");
		
		System.out.println("\nBubbleSort method for integer\n");
		int a[] = Utility.inputArray();
		start = System.nanoTime(); 
		int b[] = Utility.bubbleSort(a);
		stop = System.nanoTime();
		long time3 = stop - start;
		System.out.println("\nSorted Array");
		Utility.printArray(b);
		System.out.println("\nTime of Bubble Sort for Integer:"+time3);
		System.out.println("-------------------------------");
		
		System.out.println("\nBubbleSort method for String");
		System.out.println("\nEnter the size of the array");
		int size1 = Utility.getInt();
		String str[] = new String[size1];
		System.out.println("\nEnter String");
		for(int i=0; i<str.length; i++) {
			str[i] = Utility.next();
		}
		start = System.nanoTime();
		String sortedString[] = Utility.bubbleSortOfString(str);
		stop = System.nanoTime();
		long time4= stop - start;
		System.out.println("\nSorted array");
		for(int i = 0; i < sortedString.length; i++)
			System.out.print(sortedString[i]+" ");
		System.out.println("\n\nTime of Bubble Sort for String:"+time4);
		System.out.println("-------------------------------");
		
		System.out.println("\nInsertionSort method for integer\n");
		int arr1[] = Utility.inputArray();
		start = System.nanoTime();
		int sort[] = Utility.insertionSortForInt(arr1);
		stop = System.nanoTime();
		long time5 = stop - start;
		System.out.println("\nSORTED ARRAY");
		Utility.printArray(sort);
		System.out.println("\nTime of Insertion Sort for Integer:"+time5);
		System.out.println("-------------------------------");
		
		System.out.println("\nInsertionSort method for String");
		System.out.println("\nEnter size of the array");
		int size2 = Utility.getInt();
		String string1[] = new String[size2];
		System.out.println("\nEnter String elements");
		for(int i = 0; i< size2; i++)
			string1[i] = Utility.next();
		start = System.nanoTime();
		String sort1[] = Utility.insertionSortForString(str);
		stop = System.nanoTime();
		long time6 = stop - start;
		System.out.println("\nSorted array");
		for(int i=0; i<size2; i++)
			System.out.print(sort1[i]+" ");
		System.out.println("\n\nTime of Insertion Sort for Integer:"+time6);
		System.out.println("------------------------------------");
		
		System.out.println("\nSorting and Searching list according to time");
		SortedMap<Long, String> sm = new TreeMap<Long, String>();
		sm.put(new Long(time1), "Binary Search of Integer");
		sm.put(new Long(time2), "Binary Search for String");
		sm.put(new Long(time3), "Bubble Sort for Integer");
		sm.put(new Long(time4), "Bubble Sort for String");
		sm.put(new Long(time5), "Insertion Sort for Integer");
		sm.put(new Long(time6), "Insertion Sort for String");
		System.out.println(sm);
	}
}
