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
		SingleLinkedList<String> s = new SingleLinkedList<String>();
		System.out.println("Enter path");
		String path = Utility.nextLine();
		String str[] = Utility.readFromFile(path);
		System.out.println("String Array");
		for(int i=0; i<str.length; i++) {
			System.out.print(str[i]+" ");
		}
		System.out.println("\nLinkedList elements");
		for(int i=0; i<str.length; i++) {
			if(str[i] != null)
				s.add(str[i]);
		}
		s.display();
		System.out.println("\nEnter searched element");
		String searchData = Utility.next();
		int a = s.search(searchData);
		//System.out.println("a:"+a);
		if(a == 0) {
			System.out.println("\nData is not found");
			s.add(searchData);
			System.out.println("Your data is add in this list");
		}
		else {
			System.out.println("\nData is found");
			s.remove(a);
			System.out.println("\nYour data is remove in this list");
		}
		s.display();
	//	System.out.println("Enter path");
	//	String path1 = Utility.nextLine();
		Utility.writeInfile(s,path);
		
	//	br.close();
	}
}
