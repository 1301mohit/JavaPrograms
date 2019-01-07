package org.bridgelabz.datastructure1;

import org.bridgelabz.datastructure.Queue;
import org.bridgelabz.utility.Utility;

/**
 * Purpose: A Program which creates Banking Cash Counter where people come in to deposit Cash and withdraw Cash. 
 *          Have an input panel to add people to Queue to either deposit or withdraw money and dequeue the people.
 *          Maintain the Cash Balance.
 *
 * @author  Mohit Kumar
 * @version 1.0
 * @since   03.01.2019
 */
public class SimulateBankingCashCounter {
	public static void main(String[] args) {
		System.out.println("Enter bank balance");
		double balance = Utility.getDouble();
		
		System.out.println("Enter number of people come in to deposit Cash and withdraw Cash.");
		int number = Utility.getInt();
		Queue<String> que = new Queue<String>(number);
		System.out.println("Enter names of the people");
		for(int i=0; i<number; i++) {
			String name = Utility.next();
			que.enqueue(name);
		}
		System.out.println();
		
		double finalBalance = Utility.simulateBankingCashCounter(number, que, balance);
		
		
		System.out.println("\nBank balance:"+finalBalance);
	}
}
