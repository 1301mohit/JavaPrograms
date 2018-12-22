package org.bridgelabz.algorithm;

import org.bridgelabz.utility.Utility;

/**
 * Purpose: In this method to check one string is an anagram of another String or not
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   22.12.2018
 */

public class Anagram {
	
	public static void main(String[] args) {
		
		System.out.println("Enter one String");
		String s1 = Utility.nextLine();
		
		System.out.println("Enter second String");
		String s2 = Utility.nextLine();
		
		boolean b = Utility.isAnagram(s1,s2);
		
		if(b)
			System.out.println(s1+" and "+s2+" are anagram");
		
		else
			System.out.println(s1+" and "+s2+" are not anagram");
	}
	
}
