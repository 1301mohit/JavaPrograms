package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

/**
 * Purpose: To calculate the windchill value
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   20-12-2018
 */

public class WindChill {
	public static void main(String[] args) {
		
		//t is temperature(in Fahrenheit)
		double t = Double.parseDouble(args[0]);
		
		//v is the wind speed(in miles per hour)
		double v = Double.parseDouble(args[1]);
		do {
			
		//t is temperature(in Fahrenheit)
		t = Utility.getDouble();
		
		//v is the wind speed(in miles per hour)
		v = Utility.getDouble();
		if(t > 50) {
			System.out.println("please enter temperature less than 51");	
		}
		if(v > 120 || v < 3) {
			System.out.println("please enter temperature less than 121 and greater than 3");
		}
		}while(t > 50 || (v > 120 || v < 3));
		double windChill = Utility.calculateWindChill(t, v);
		System.out.println("The value of the windCill is"+windChill);
	}
}
