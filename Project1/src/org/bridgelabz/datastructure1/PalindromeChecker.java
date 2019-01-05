package org.bridgelabz.datastructure1;

import org.bridgelabz.datastructure.Deque;
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
		System.out.println("Enter String");
		String string = Utility.next();
		int size = string.length();
		boolean flag = true;
		Deque<Character> d = new Deque<Character>(size);
		char ch[] = string.toCharArray();
		for(int i=0; i<ch.length; i++)
			d.addRear(ch[i]);
		for(int i=0; i<ch.length/2; i++) {
			if(d.removeFront() != d.removeRear() ) {
				flag = false;
				break;
			}	
		}
		if(flag)
			System.out.println(string+" is Pallindrome");
		else
			System.out.println(string+" is not Pallindrome");
	}
	
}
