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
	public static void main(String[] args) throws IOException  {
		System.out.println("Enter path");
		String path = Utility.next();
		
		SingleLinkedList<String> orderedList = Utility.orderedList(path); 
		
		Utility.writeInfile(orderedList, path);
	}
}
