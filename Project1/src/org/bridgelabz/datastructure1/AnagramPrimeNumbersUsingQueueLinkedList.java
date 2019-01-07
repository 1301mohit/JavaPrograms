package org.bridgelabz.datastructure1;

import org.bridgelabz.datastructure.QueueUsingLinkedList;
import org.bridgelabz.utility.Utility;

/**
 * Purpose: The Prime Numbers that are Anagram in a Queue using the Linked List.
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   02.01.2019
 */

public class AnagramPrimeNumbersUsingQueueLinkedList {
	public static void main(String[] args) {
		System.out.println("Enter the range of the prime number");
		int number = Utility.getInt();
		QueueUsingLinkedList<String> anagramPrimeNumber = Utility.anagramPrimeNumbersUsingQueueLinkedList(number);
		
		int size = anagramPrimeNumber.size();
		for(int i=0; i<size; i++)
			System.out.println(anagramPrimeNumber.dequeue());
	}
}
