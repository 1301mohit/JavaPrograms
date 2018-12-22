package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

/**
 * In this class we check year is leap year or not
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   19-12-2018
 */

public class IsLeapYear {
	public static void main(String[] args) {
		int year;
		do {
			System.out.println("Enter 4 digit year");
			year = Utility.getInt();
			if(year > 9999 || year < 1000)
				System.out.println("Please enter 4 digit number");
			System.out.println("-----------------------------------------");
		}while(year > 9999 || year < 1000);
		String str = Utility.isLeapYear(year);
		System.out.println(str);
	}
}
