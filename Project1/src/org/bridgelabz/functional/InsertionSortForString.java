package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

public class InsertionSortForString {
	public static void main(String[] args) {
		System.out.println("Enter size of the array");
		int size = Utility.getInt();
		String str[] = new String[size];
		System.out.println("Enter String elements");
		for(int i = 0; i< size; i++)
			str[i] = Utility.next();
		String sort[] = Utility.insertionSortForString(str);
		for(int i=0; i<size; i++)
			System.out.println(sort[i]+" ");
	}
}
