package org.bridgelabz.datastructure1;

import org.bridgelabz.utility.Utility;

public class PrimeNumbersInA2DArray {

	public static void main(String[] args) {
		int[][] prime = new int[10][100];
		boolean flag = true;
		for(int i=0;i<prime.length;i++) {
			System.out.print(i*100+"-"+(i*100+100)+"  ");
			for(int j=i*100;j<prime[0].length+(i*100);j++) {
				
				for(int k=2;k<j/2;k++) {
					if(j % k == 0) {
						flag = false;
					}
				}
				if(flag == true)
					System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
