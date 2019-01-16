package org.bridgelabz.objectorientedprogram;

import java.util.ArrayList;
import java.util.List;

import org.bridgelabz.utility.Utility;

public class AddressBook implements AddressBookInterface{
	
	//Utility input=new Utility();
	List<Person> list;
	String firstname="";
	String lastname="";
	String city="";
	String zip="";
	String state="";
	String phone="";
	boolean changesmade=false;
//	@Override
//	public boolean operation(List<Person> receiveList)
//	{
//		list=receiveList;
//	//	boolean state=true;
//		int Answer=0;
//		
//		do {
//			System.out.println("Choose Operation You Want To Do");
//			System.out.println("1.Add");
//			System.out.println("2.Edit");
//			System.out.println("3.Delete");
//			System.out.println("4.SortByName");
//			System.out.println("5.SortByZip");
//			System.out.println("6.Print");
//			System.out.println("7.Exit");
//			Answer=input.getInt();
//			switch(Answer)
//			{
//				case 1:
//					add();
//					break;
//				case 2:
//					edit();
//					break;
//				case 3:
//					delete();
//					break;
//				case 4:
//					sortByName();
//					break;
//				case 5:
//					sortByZip();
//					break;
//				case 6:
//					print(list);
//					break;
//				case 7:
//					System.out.println("Exiting");
//					break;
//				default :
//					System.out.println("Invalid Entry Re-Enter");
//					break;
//			}
//					
//		}while(Answer!=7);
//		return changesmade;
//	}
	
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
	
//	public void print(List<Person> listprint)
//	{
//		System.out.println("FirstName   LastName    City        State       Zip         PhoneNumber \n");
//		String spaces="            ";
//		for(int i=0;i<listprint.size();i++)
//		{
//			System.out.print(listprint.get(i).firstname+spaces.substring(listprint.get(i).firstname.length(),spaces.length()));
//			System.out.print(listprint.get(i).lastname+spaces.substring(listprint.get(i).lastname.length(),spaces.length()));
//			System.out.print(listprint.get(i).address.city+spaces.substring(listprint.get(i).address.city.length(),spaces.length()));
//			System.out.print(listprint.get(i).address.state+spaces.substring(listprint.get(i).address.state.length(),spaces.length()));
//			System.out.print(listprint.get(i).address.zip+spaces.substring(listprint.get(i).address.zip.length(),spaces.length()));
//			System.out.print(listprint.get(i).address.phone+spaces.substring(listprint.get(i).address.phone.length(),spaces.length()));
//			System.out.println();
//			
//		}
//		System.out.println();
//	}

	@Override
	public boolean operation(List<Person> receiveList) {
		list=receiveList;
		//	boolean state=true;
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
