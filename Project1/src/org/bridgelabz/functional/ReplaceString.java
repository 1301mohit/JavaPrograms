package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

/**
 * Class of ReplaceString from given String
 * 
 * @author Mohit Kumar
 * @version 1.0
 * @since   19-12-2018
 */

public class ReplaceString {
	public static void main(String[] args) {
		String username;
		String givenString = "Hello <<username>>, How are you?";
		System.out.println("Username has minimum three character");
		
		/*
		 * check the length of the username
		 */
		
		do {
			System.out.println("Enter Username");
			username = Utility.nextLine();
			if(username.length() < 3) {
				System.out.println("Minimum length of the name of the user is 3");
				System.out.println("Please enter length of the username is 3");
				System.out.println("-------------------------------------------------");
			}
		}while(username.length() < 3);
		
		//call replace replaceString method and returned value of replaceString method store in str
		String replaceString = Utility.replaceString(username, givenString);
		System.out.println(replaceString);
	}
}
	
