package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

public class StringPermutation {
	public static void main(String[] args) {
		System.out.println("Enter String");
        String str = Utility.next();
        int n = str.length(); 
        Utility.permute(str, 0, n-1); 
	}
}
