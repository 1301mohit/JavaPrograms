package org.bridgelabz.datastructure1;

import org.bridgelabz.utility.Utility;

public class SimpleBalancedParentheses {

	public static void main(String[] args) {
		System.out.println("Enter expression");
		String expression = Utility.nextLine();
		boolean b = Utility.isBalancedParentheses(expression);
		if(b == true)
			System.out.println("String is Balanced");
		else
			System.out.println("String is not Balanced");
		
	}

}
