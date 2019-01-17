package org.bridgelabz.objectorientedprogram;

import org.bridgelabz.utility.Utility;

/**
 * Purpose: We can perform operation according to the user input according
 *          to the user input we can call the methods of Address manager.
 *          
 * @version 1.0
 * @since   17/01/2019
 */
public class AddressBookApplication {
	public static void main(String[] args) {
		AddressManagerInterface manager=new AddressManager();
		System.out.println("Welcome To Address Book");
		int Answer=0;
		do {
			System.out.println("Choose Operation You Want To Do");
			System.out.println("1.Create");
			System.out.println("2.Open");
			System.out.println("3.Save");
			System.out.println("4.SaveAs");
			System.out.println("5.Close");
			System.out.println("6.Exit");
			Answer=Utility.getInt();
			switch(Answer)
			{
				case 1:
					manager.create();
					break;
				case 2:
					manager.open();
					break;
				case 3:
					manager.save();
					break;
				case 4:
					manager.saveAs();
					break;
				case 5:
					manager.close();	
					break;
				case 6:
					System.out.println("Exiting");
					break;
				default:
					System.out.println("Invalid Entry");
			}
		}while(Answer!=6);
	}
}
