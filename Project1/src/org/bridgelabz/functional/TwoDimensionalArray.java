package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

/**
 * This class help to print Two dimensional array of integer, double, boolean type
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   19-12-2018
 */

public class TwoDimensionalArray {
	public static void main(String[] args) {
		System.out.println("Enter number of rows and column");
		int rows = Utility.getInt();
		int columns = Utility.getInt();
		System.out.println("1.Integer Array");
		System.out.println("2.Double Array");
		System.out.println("3.Boolean Array");
		System.out.println("Enter your choice:");
		int choice = Utility.getInt();
		if(choice == 1) {
			int integerArray[][] = new int[rows][columns];
			System.out.println("Enter integer elements");
			for(int j=0; j<rows; j++) {
				for(int k=0; k<columns; k++) {
					integerArray[j][k] = Utility.getInt();
				}
			}
			Utility.integerTwoDimensionArray(integerArray);
		}
		else if(choice == 2) {
			double doubleArray[][] = new double[rows][columns];
			System.out.println("Enter double elements");
			for(int j=0; j<rows; j++) {
				for(int k=0; k<columns; k++) {
					doubleArray[j][k] = Utility.getDouble();
				}
			}
			Utility.doubleTwoDimensionArray(doubleArray);
		}
		else if(choice == 3) {
			boolean booleanArray[][] = new boolean[rows][columns];
			System.out.println("Enter true or false only");
			for(int j=0; j<rows; j++) {
				for(int k=0; k<columns; k++) {
					booleanArray[j][k] = Utility.getBoolean();
				}
			}
			Utility.booleanTwoDimensionArray(booleanArray);
		}
		else {
			System.out.println("Please enter right choice");
		}
	}
}
