package org.bridgelabz.datastructure1;

import java.io.IOException;
import org.bridgelabz.datastructure.SingleLinkedList;

import org.bridgelabz.utility.Utility;

/**
 * Purpose: Read a List of Numbers from a file and arrange it ascending Order in aLinked List. 
 *          Take user input for a number, if found then pop the number out of the list 
 *          else insert the number in appropriate position.
 * 
 * @author  Mohit Kumar 
 * @version 1.0
 * @since   02.01.2018
 */
public class OrderedList {
	public static void main(String[] args) throws IOException {
		SingleLinkedList<String> s = new SingleLinkedList<String>();
		System.out.println("Enter path");
		String path = Utility.next();
		String string[] = Utility.readFromFile(path);
		for(int i=0;i<string.length;i++) {
			if(string[i] != null)
				s.add(string[i]);
		}
		s.sort();
		System.out.println("\nData in List in ascending order");
		s.display();
		System.out.println("\nEnter number");
		String number = Utility.next();
		int position = s.search(number);
		if(position == 0) {
			System.out.println("\n\nData is not found");
			s.add(number);
			s.sort();
			System.out.println("\n\nYour data is add in the list");
			s.display();
		}
		else {
			System.out.println("Data is found");
			s.remove(position);
			System.out.println("\nYour data is remove in the list");
			s.display();
		}
		Utility.writeInfile(s, path);
	}
}
