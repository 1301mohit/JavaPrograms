package org.bridgelabz.datastructure1;

import java.util.ArrayList;
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
		QueueUsingLinkedList<String> queueLinkedList = new QueueUsingLinkedList<String>();
		String string1 = "";
		String string2 = "";
		int count = 0;
		System.out.println("Enter the range of the prime number");
		int number = Utility.getInt();
		ArrayList<Integer> prime = Utility.prime(number);
		System.out.println("\nPrime numbers that are Anagram\n");
		for(int i=0; i<prime.size(); i++) {
			for(int j=i+1; j<prime.size(); j++) {
				string1 = Integer.toString(prime.get(i));
				string2 = Integer.toString(prime.get(j));
				if(Utility.isAnagram(string1, string2))
				{
						queueLinkedList.enqueue(string1+" "+string2);
						count++;
				}
			
			}
		}
		for(int i=0; i<count; i++)
			System.out.println(queueLinkedList.dequeue());
	}
}
