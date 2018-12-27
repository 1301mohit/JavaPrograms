package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

/**
 * To generate distinct coupon number and count total random number needs to have all distinct number
 * @author   Mohit Kumar
 * @version  1.0
 * @since    20.12.2018
 */

public class CouponNumber {
	public static void main(String[] args) {
		int numberOfCouponNumber;
		do {
			System.out.println("Enter number of coupon number");
			numberOfCouponNumber = Utility.getInt();
			if(numberOfCouponNumber <= 0)
				System.out.println("Please enter positive number");
			System.out.println("-----------------------------");
		}while(numberOfCouponNumber <= 0);
		int number[] = new int[numberOfCouponNumber];
		do {
			System.out.println("Enter distinct integer value");
			for(int i=0; i<number.length; i++)
				number[i] = Utility.getInt();
			if(Utility.isDistinct(number) == false)
				System.out.println("Please enter distinct integer value");
			System.out.println("------------------------------------");
		}while(Utility.isDistinct(number) == false);
		int count = Utility.couponNumber(numberOfCouponNumber, number);
		System.out.println("Number of random number:"+count);
	}
}
