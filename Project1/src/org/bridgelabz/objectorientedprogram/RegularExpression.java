package org.bridgelabz.objectorientedprogram;

import java.io.IOException;

import org.bridgelabz.utility.Utility;

public class RegularExpression {

	public static void main(String[] args) {
		String message = null;
		try {
			message = Utility.readFromFile1("/home/admin1/Documents/regex.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Enter FirstName:");
		String firstName = Utility.nextLine();
		System.out.println();
		System.out.println("Enter LastName:");
		String lastName = Utility.nextLine();
		System.out.println();
		System.out.println("Enter MobileNumber:");
		String mobileNumber = Utility.nextLine();
		System.out.println("Enter Date:");
		String date = Utility.nextLine();
		message = Utility.convertString(message,"<<name>>",firstName);
		message = Utility.convertString(message,"<<full name>>", firstName+" "+lastName);
		message = Utility.convertString(message, "xxxxxxxxxx", mobileNumber);
		message = Utility.convertString(message, "01/01/2016", date);
		System.out.println(message);
	}

}
