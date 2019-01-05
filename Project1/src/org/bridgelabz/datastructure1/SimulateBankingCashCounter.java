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
		double amount = 0.0;
		int choice = 0;
		System.out.println("Enter number of people come in to deposit Cash and withdraw Cash.");
		int number = Utility.getInt();
		Queue<String> que = new Queue<String>(number);
		System.out.println("Enter names of the people");
		for(int i=0; i<number; i++) {
			String name = Utility.next();
			que.enqueue(name);
		}
		System.out.println();
		for(int i=0; i<number; i++) {
			System.out.println("\nName:"+que.dequeue());
			System.out.println("1.Deposite Cash");
			System.out.println("2.Withdraw Cash");
			do {
				System.out.print("\nEnter Your Choice:");
				choice = Utility.getInt();
				if(choice != 1 && choice != 2)	
					System.out.println("Please enter right choice");
			}while(choice != 1 && choice != 2);
			do {
			System.out.println("\nEnter your amount");
			amount = Utility.getDouble();
			if(amount > balance && choice == 2) {
				System.out.println("\nBalance is "+balance);
				System.out.println("Please enter amount less than or equal to "+balance);
			}
			}while(choice == 2 && amount > balance);
				switch(choice) {
				case 1:
						balance = balance + amount;
						break;
				case 2:
					if(amount < balance)
						balance = balance - amount;
					break;
				}
		}
		System.out.println("\nBank balance:"+balance);
	}
}
