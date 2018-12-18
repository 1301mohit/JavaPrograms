package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

public class QuadraticEquation {
	public static void main(String[] args) {
		System.out.println("The Quadratic equation a*x*x+b*x+c");
		/*System.out.println("Enter the value of x");
		double x = Utility.getDouble();*/
		System.out.println("Enter the value of a");
		double a = Utility.getDouble();
		System.out.println("Enter the value of b");
		double b = Utility.getDouble();
		System.out.println("Enter the value of c");
		double c = Utility.getDouble();
		Utility.root(a, b, c);
	}
}
