package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

/**
 * Purpose: This class help to calculate the percentage of win and loss in gambler game
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   19-12-2018
 *
 */

public class Gambler {
	public static void main(String[] args) {
	double[] element = Utility.gambler();
	//Print number of times win
	System.out.println("Number of wins:"+element[0]);
	
	//Print percentage of win
	System.out.println("Percentage of win:"+element[1]);
			
	//Print percentage of loss
	System.out.println("Percentage of loss:"+element[2]);
	}
}
