package org.bridgelabz.functional;
import org.bridgelabz.utility.Utility;
public class IsLeapYear {
	public static void main(String[] args) {
		System.out.println("Enter 4 digit year");
		int year = Utility.getInt();
		String s = Utility.isLeapYear(year);
		System.out.println(s);
	}
}
