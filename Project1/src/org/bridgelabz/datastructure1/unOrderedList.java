package org.bridgelabz.datastructure1;

import java.io.IOException;
import org.bridgelabz.datastructure.SingleLinkedList;
import org.bridgelabz.utility.Utility;

/**
 * Purpose: Read the Text from a file, split it into words and arrange it as Linked List.
 *          Take a user input to search a Word in the List. If the Word is not found then add it
 *          to the list, and if it found then remove the word from the List. In the end save the
 *          list into a file.
 *          
 * @author  Mohit Kumar
 * @version 1.0
 * @since   31.12.2018
 */
public class unOrderedList {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter path");
		String path = Utility.nextLine();
		
		SingleLinkedList<String> unorderedList = Utility.unOrderedList(path);
		
		Utility.writeInfile(unorderedList,path);
	}
}
