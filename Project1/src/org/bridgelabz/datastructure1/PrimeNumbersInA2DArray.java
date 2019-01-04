package org.bridgelabz.datastructure1;

import org.bridgelabz.utility.Utility;

public class PrimeNumbersInA2DArray {

	public static void main(String[] args) {
		int[][] prime = new int[10][100];
		System.out.println("prime numbers in a 2D Array");
		System.out.println("---------------------------");
		System.out.println();
		for(int i=0;i<prime.length;i++) {
			for(int j=i*100;j<prime[0].length+(i*100);j++) {
				if(j == i*100)
					System.out.printf("%04d"+"-"+"%04d"+"  ",i*100,i*100+100);
				else {
					if(Utility.isPrime(j)) {
						System.out.printf("%03d"+" ",j);
					}
				}
			}
			System.out.println();
		}
	}

}
