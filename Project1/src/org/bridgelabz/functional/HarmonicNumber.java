package org.bridgelabz.functional;
import org.bridgelabz.utility.Utility;
public class HarmonicNumber {
	public static void main(String[] args) {
		System.out.println("Enter positive integer");
		int n = Utility.getInt();
		double d = Utility.harmonicNumber(n);
		System.out.print("Nth Harmonic value is:"+d);
	}
}
