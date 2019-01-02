package org.bridgelabz.datastructure1;

import java.io.IOException;
import org.bridgelabz.datastructure.SingleLinkedList;

import org.bridgelabz.utility.Utility;

public class OrderedList {
	public static void main(String[] args) throws IOException {
		SingleLinkedList<String> s = new SingleLinkedList<String>();
		System.out.println("Enter path");
		String path = Utility.next();
		String str[] = Utility.readFromFile(path);
		/*System.out.println("String Array");
		for(int i=0;i<str.length; i++) {
			System.out.println(str[i]+" ");
		}*/
		for(int i=0;i<str.length;i++) {
			if(str[i] != null)
				s.add(str[i]);
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
