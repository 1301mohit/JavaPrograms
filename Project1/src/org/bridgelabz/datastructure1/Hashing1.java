package org.bridgelabz.datastructure1;

import java.io.IOException;

import org.bridgelabz.utility.Utility;

/**
 * Purpose: Search data in a file if data is present in the file then remove otherwise add data in the file.
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   08.01.2019
 */
public class Hashing1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter number to search");
		int search = Utility.getInt();
		boolean b = Utility.hashingSearch(search);
		if(!b) {
			System.out.println("Number was not in the list");
			System.out.println("Number is added to the list");
		}
		else
			System.out.println("Number is deleted from the list");
	}

}
