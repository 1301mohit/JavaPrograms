package org.bridgelabz.algorithm;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import org.bridgelabz.utility.Utility;

/**
 * Purpose: In this class read a list of words from File. Use Arrays to sort the word list and then do the binary search.
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   28.12.2018
 */

public class WordList {

	public static void main(String[] args) throws FileNotFoundException { 
		FileReader file = new FileReader("/home/admin1/Documents/abc.txt");
		Scanner in = new Scanner(file);
		String str[];// = new String[7];
		String word = in.next();
		System.out.println("File array");
		System.out.println(word);
		str = word.split(",");
		Utility.bubbleSortOfString(str);
		System.out.println("\nSorted array");
		for(int i=0; i<str.length; i++) {
			System.out.print(str[i]+" ");
		}
		System.out.println("\n\nEnter searched word");
		String search = Utility.next();
		int index = Utility.binarySearchForString(str, search);
		if(index == -1) {
			System.out.println("Word is not found");
		}
		System.out.println("\nPosition of the word:"+(index+1));
		in.close();
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

