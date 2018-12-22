package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

/**
 * Purpose: print the Euclidean distance from the point(X, Y) to the origin.
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   20-12-2018
 */

public class Distance {
	public static void main(String[] args) {
		int valueOfX = Integer.parseInt(args[0]);
		int valueOfY = Integer.parseInt(args[1]);
		double distance = Utility.calculateDistance(valueOfX,valueOfY);
		System.out.println(distance);
	}
}
