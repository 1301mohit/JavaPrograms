package org.bridgelabz.functional;

import java.util.ArrayList;
import org.bridgelabz.utility.Utility;

public class SumOfThreeIntegersAddToZero {
	public static void main(String[] args) {
		System.out.println("Enter number of integers:");
		int n = Utility.getInt();
		int a[] = new int[n];
		System.out.println("Enter integers");
		for(int i=0; i<a.length; i++) {
			a[i] = Utility.getInt();
		}
		
		int c = 0;
		ArrayList<String> arr = new ArrayList<String>();
		System.out.println("Distinct Triplets are");
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				for(int k=j+1; k<a.length; k++) {
					int sum = a[i] + a[j] + a[k];
					if(sum == 0) {
						String st = null;
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
						c++;
						st = st+a[i]+a[j]+a[k];
						arr.add(st);
						//arr.get(st);
					}
				}
			}
		}
		System.out.println("Number of distinct triplets");
		System.out.println(c);
	}
}
