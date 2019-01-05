package org.bridgelabz.datastructure1;

import org.bridgelabz.utility.Utility;

/**
 * Purpose: To check parentheses are balanced or not by using Stack.
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   04.01.2019
 */
public class SimpleBalancedParentheses {

	public static void main(String[] args) {
		System.out.println("Enter expression");
		String expression = Utility.nextLine();
		boolean balance = Utility.isBalancedParentheses(expression);
		if(balance == true)
			System.out.println("String is Balanced");
		else
			System.out.println("String is not Balanced");
		
	}

}
