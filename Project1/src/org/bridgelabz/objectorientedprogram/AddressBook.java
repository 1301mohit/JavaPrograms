package org.bridgelabz.objectorientedprogram;

import java.util.ArrayList;
import java.util.List;

import org.bridgelabz.utility.Utility;

/**
 * Purpose: AddressBook class and perform add, edit, delete, sortByName, sortByZip and print in this class.
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   16/01/2019
 */
public class AddressBook implements AddressBookInterface{
	
	List<Person> list;
	String firstname="";
	String lastname="";
	String city="";
	String zip="";
	String state="";
	String phone="";
	boolean changesmade=false;

	
	//add new details in address book
	public void add()
	{
		changesmade=true;
		System.out.println("Enter firstname");
		firstname=Utility.next();
		System.out.println("Enter lastname");
		lastname=Utility.next();
		System.out.println("Enter city");
		city=Utility.next();
		System.out.println("Enter zip");
		zip=Utility.next();
		System.out.println("Enter state");
		state=Utility.next();
		System.out.println("Enter phonenumber");
		phone=Utility.next();
		Person tempperson=new Person(firstname,lastname,new Address(city,zip,state,phone));
		list.add(tempperson);
	}
	
	//edit details of address book
	public void edit()
	{
		changesmade=true;
		System.out.println("Enter Person FirstName Of Edited Person");
		firstname=Utility.next();
		System.out.println("Enter MobileNumber Of Edited Person");
		phone=Utility.next();
		int i=0;
		for(i=0;i<list.size();i++)
		{
			Person temp=list.get(i);
			if(temp.getfirstname().equals(firstname) && temp.getaddress().getphone().equals(phone))
			{
				int Answer2=0;
			do {
					System.out.println("What You Want To Edit");
					System.out.println("1.LastName");
					System.out.println("2.City");
					System.out.println("3.Zip");
					System.out.println("4.State");
					System.out.println("5.Phone");
					System.out.println("6.Exit");
					Answer2=Utility.getInt();
					switch(Answer2)
					{
						case 1:
							System.out.println("Enter New LastName");
							lastname=Utility.next();
							list.get(i).setlastname(lastname);
							break;
						case 2:
							System.out.println("Enter New City");
							city=Utility.next();
							list.get(i).address.city=city;
							break;
						case 3:
							System.out.println("Enter New Zip");
							zip=Utility.next();
							list.get(i).address.zip=zip;
							break;
						case 4:
							System.out.println("Enter New State");
							state=Utility.next();
							list.get(i).address.state=state;
							break;
						case 5:
							System.out.println("Enter New Phone");
							phone=Utility.next();
							list.get(i).address.phone=phone;
							break;
						case 6:
							System.out.println("Exiting");
							break;
						default:
							System.out.println("Invalid Entry");
					}
				}while(Answer2!=6);
			break;
			}
		}
		if(i>list.size())
		{
			System.out.println("No Person Fount With This Details");
		}
	}
	
	//delete the details of address book
	public void delete()
	{
		changesmade=true;
		System.out.println("Enter Person FirstName Of Deleted Person");
		firstname=Utility.next();
		System.out.println("Enter MobileNumber Of Deleted Person");
		phone=Utility.next();
		int i=0;
		for(i=0;i<list.size();i++)
		{
			Person temp=list.get(i);
			if(temp.firstname.equals(firstname) && temp.address.phone.equals(phone))
			{
			//	System.out.println("hello");
				list.remove(i);
				break;
			}
		}
		if(i>list.size())
		{
			System.out.println("No Person Found With This Details");

		}
	}
	
	//Sort the details of the address book by name
	public void sortByName()
	{
		List<Person> listTemp=new ArrayList<>();
		for(int i=0;i<list.size();i++)
		{
			listTemp.add(list.get(i));
		}
		for(int i=0; i<listTemp.size()-1; i++)
		{
			for(int j=i+1; j<listTemp.size(); j++)
			{
				if(listTemp.get(i).firstname.compareTo(listTemp.get(j).firstname)>0)
				{
					Person temp1=listTemp.remove(i);
					Person temp2=listTemp.remove(j-1);
					listTemp.add(i, temp2);
					listTemp.add(j,temp1);
				}
			}
		}
		print(listTemp);
		
	}
	
	//sort the address details by zip
	public void sortByZip()
	{
		List<Person> listTemp=new ArrayList<>();
		for(int i=0;i<list.size();i++)
		{
			listTemp.add(list.get(i));
		}
		
		for(int i=0;i<listTemp.size()-1;i++)
		{
			for(int j=i+1;j<listTemp.size();j++)
			{
				if(listTemp.get(i).address.zip.compareTo(listTemp.get(j).address.zip)>0)
				{
					Person temp1=listTemp.remove(i);
					Person temp2=listTemp.remove(j-1);
					listTemp.add(i, temp2);
					listTemp.add(j,temp1);
				}
			}
		}
		print(listTemp);
	}
	

	/*
	 * perform the operation according to the user input.
	 */
	@Override
	public boolean operation(List<Person> receiveList) {
		list=receiveList;
			int Answer=0;
			
			do {
				System.out.println("Choose Operation You Want To Do");
				System.out.println("1.Add");
				System.out.println("2.Edit");
				System.out.println("3.Delete");
				System.out.println("4.SortByName");
				System.out.println("5.SortByZip");
				System.out.println("6.Print");
				System.out.println("7.Exit");
				Answer=Utility.getInt();
				switch(Answer)
				{
					case 1:
						add();
						break;
					case 2:
						edit();
						break;
					case 3:
						delete();
						break;
					case 4:
						sortByName();
						break;
					case 5:
						sortByZip();
						break;
					case 6:
						print(list);
						break;
					case 7:
						System.out.println("Exiting");
						break;
					default :
						System.out.println("Invalid Entry Re-Enter");
						break;
				}
						
			}while(Answer!=7);
			return changesmade;
	}
	
	/*
	 * Print the details of the address book.
	 * 
	 * @param List All the data of the address book.
	 */
	@Override
	public void print(List<Person> listprint) {
		System.out.println("FirstName   LastName    City        State       Zip         PhoneNumber \n");
		String spaces="            ";
		for(int i=0;i<listprint.size();i++)
		{
			System.out.print(listprint.get(i).firstname+spaces.substring(listprint.get(i).firstname.length(),spaces.length()));
			System.out.print(listprint.get(i).lastname+spaces.substring(listprint.get(i).lastname.length(),spaces.length()));
			System.out.print(listprint.get(i).address.city+spaces.substring(listprint.get(i).address.city.length(),spaces.length()));
			System.out.print(listprint.get(i).address.state+spaces.substring(listprint.get(i).address.state.length(),spaces.length()));
			System.out.print(listprint.get(i).address.zip+spaces.substring(listprint.get(i).address.zip.length(),spaces.length()));
			System.out.print(listprint.get(i).address.phone+spaces.substring(listprint.get(i).address.phone.length(),spaces.length()));
			System.out.println();
			
		}
		System.out.println();
		
	}

}
