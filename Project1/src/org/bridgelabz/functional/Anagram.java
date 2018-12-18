package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

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
