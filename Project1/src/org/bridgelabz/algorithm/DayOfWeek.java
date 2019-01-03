package org.bridgelabz.algorithm;

import org.bridgelabz.utility.Utility;

/**
 * Purpose: By using this class to find the day of the week that date.
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   24.12.2018
 *
 */

public class DayOfWeek {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);
		String days[] = {"Sunday","Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday"};
		int d = Utility.dayOfWeek(month, day, year);
		System.out.println(d);
		String weekday = days[d];
		System.out.println("Date:"+day+"."+month+"."+year);
		System.out.println("\nDay:"+weekday);
	}
}
