package org.bridgelabz.datastructure1;

import org.bridgelabz.datastructure.StackUsingLinkedList;
import org.bridgelabz.utility.Utility;

/**
 * Purpose: The Prime Numbers that are Anagram in a Stack using the Linked List.
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   02.01.2019
 */

public class AnagramPrimeNumbersUsingStackLinkedList {
	public static void main(String[] args) {
		System.out.println("Enter the range of the prime number");
		int number = Utility.getInt();
		StackUsingLinkedList<String> anagramPrimeNumber = Utility.anagramPrimeNumbersUsingStackLinkedList(number);
		int size = anagramPrimeNumber.size();
		for(int i=1; i<=size; i++) {
			System.out.println(anagramPrimeNumber.pop());
		}
	}
}
