package org.bridgelabz.datastructure1;

import org.bridgelabz.utility.Utility;

/**
 * Purpose: To check String is palindrome or not by using Dequeue.
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   4.01.2019
 */
public class PalindromeChecker {
	public static void main(String[] args) {
		System.out.println("Enter Word to check the word is pallindrome or not");
		String word = Utility.next();
		boolean isPalindrome = Utility.palindromeChecker(word);
		System.out.println();
		if(isPalindrome)
			System.out.println(word+" is Pallindrome");
		else
			System.out.println(word+" is not Pallindrome");
	}
	
}
