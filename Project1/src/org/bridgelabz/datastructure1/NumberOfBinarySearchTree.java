package org.bridgelabz.datastructure1;

import org.bridgelabz.utility.Utility;

/**
 * Purpose: To calculate number of binary search tree.
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   05.01.2018
 */
public class NumberOfBinarySearchTree {
	public static void main(String[] args) {
		System.out.println("Enter number");
		int number = Utility.getInt();
		System.out.println("\nEnter nodes");
		int node[] = new int[number];
		for(int i=0; i<node.length; i++)
			node[i] = Utility.getInt();
		long[] numberOfBinarySearchTree = Utility.numberOfBinarySeachTree(node);
		System.out.println("\nNumber of Binary Search Tree");
		for(int i=0; i<number; i++)
			System.out.println(numberOfBinarySearchTree[i]);
	}
}
