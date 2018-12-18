package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		System.out.println("Enter number of rows and column");
		int a = Utility.getInt();
		int b = Utility.getInt();
		System.out.println("1.Integer Array");
		System.out.println("2.Double Array");
		System.out.println("3.Boolean Array");
		System.out.println("Enter your choice:");
		int ch = Utility.getInt();
		if(ch == 1) {
			int i[][] = new int[a][b];
			for(int j=0; j<a; j++) {
				for(int k=0; k<b; k++) {
					i[j][k] = Utility.getInt();
				}
			}
			Utility.itwoDArray(i);
		}
		else if(ch == 2) {
			double d[][] = new double[a][b];
			for(int j=0; j<a; j++) {
				for(int k=0; k<b; k++) {
					d[j][k] = Utility.getDouble();
				}
			}
			Utility.dtwoDArray(d);
		}
		else if(ch == 3) {
			boolean bln[][] = new boolean[a][b];
			for(int j=0; j<a; j++) {
				for(int k=0; k<b; k++) {
					bln[j][k] = Utility.getBoolean();
				}
			}
			Utility.btwoDArray(bln);
		}
		else {
			System.out.println("Please enter right choice");
		}
	}
}
