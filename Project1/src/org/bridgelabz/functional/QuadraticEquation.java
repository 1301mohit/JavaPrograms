package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

/**
 * Purpose:  To calculate the values of the quadratic equation.
 * 
 * @author   Mohit Kumar
 * @version  1.0
 * @since    21.12.2018
 */

public class QuadraticEquation {
	public static void main(String[] args) {
		System.out.println("The Quadratic equation a*x*x + b*x + c");
		
		//a is the coefficient of x*x.
		double a;
		do {
			System.out.println("Enter the value of a");
			a = Utility.getDouble();
			if(a == 0)
				System.out.println("Please enter the value of the a is other than 0");
		}while(a == 0);
		
		System.out.println("Enter the value of b");
		
		//b is the coefficient of x.
		double b = Utility.getDouble();
		System.out.println("Enter the value of c");
		
		//c is the constant
		double c = Utility.getDouble();
		
		//call root function
		Utility.root(a, b, c);
	}
}
