package org.bridgelabz.datastructure1;

import org.bridgelabz.utility.Utility;

/**
 * Purpose: This programs takes the month and year as command­line arguments and prints the Calendar of the month.
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   05.01.2019
 */

public class Calender {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
		int dayOfWeek = Utility.dayOfWeek(month, 1, year);
		String months[] = {"","January","Feburary","March","April","May","June","July","August","September","October","November","December"};
		int days[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		String weekDays[] = {"","Sun","Mon","Tue","Wed","Thr","Fri","Sat"};
		if((month == 2) && (Utility.isLeapYear(year)))
			days[month] = 29;
		
		System.out.println(months[month]+"  "+year);
		System.out.println();
		for(int i=1; i<weekDays.length; i++) {
			System.out.print(weekDays[i]+" ");
		}
		System.out.println();
		for(int i=0; i<dayOfWeek; i++) {
			System.out.print("    ");
		}
		for(int i=1; i<=days[month];i++) {
			if(i<10)
				System.out.print(i+"   ");
			else
				System.out.print(i+"  ");
			if((i+dayOfWeek) % 7 == 0 || i == days[month])
				System.out.println();
		}
	}
}
