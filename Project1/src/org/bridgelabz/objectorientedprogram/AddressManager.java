package org.bridgelabz.objectorientedprogram;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bridgelabz.utility.Utility;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

/**
 * Purpose : Here we can define the methods of the address book application class menu.
 * 
 * @author   Mohit Kumar
 * @version  1.0
 * @since    16/01/2019
 */
public class AddressManager implements AddressManagerInterface{
	ObjectMapper mapper=new ObjectMapper();
	//Utility input=new Utility();
	List<Person> list=new ArrayList<>();
	AddressBookInterface addbook=new AddressBook();
	String name;
	boolean fileAlreadyOpenFlag=false;
	boolean changemade=false;
	
	/*
	 *Purpose: The purpose of the method to create new user.
	 */
	public void create()
	{
		if(fileAlreadyOpenFlag==true  && changemade==true)
		{
			System.out.println("Do You Want To Save Changes For Previous Open File");
			System.out.println("1. Yes\n2. No");
			int ans=Utility.getInt();
			if(ans==1)
			{
			save();
			fileAlreadyOpenFlag=false;
			}
			else
			{
				fileAlreadyOpenFlag=false;
			}
		}
		System.out.println("Give Name Of Address Book");
		String name=Utility.next();
		if(new File("/home/admin1/Desktop/AddressBooks/"+name+".json").exists())
		{
			System.out.println("Address Book Already Exists");
		}
		else
		{
			try {
				list.clear();
			mapper.writeValue(new File("/home/admin1/Desktop/AddressBooks/"+name+".json"), list);
			this.name=name;
			
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	/*
	 * Purpose: open the file
	 */
	public boolean open()
	{
		boolean flag=false;
		if(fileAlreadyOpenFlag==true)
		{
			System.out.println("Do You Want To Save Changes For Previous Open File");
			System.out.println("1. Yes\n2. No");
			int ans=Utility.getInt();
			if(ans==1)
			{
			save();
			fileAlreadyOpenFlag=false;
			}
			else
			{
				fileAlreadyOpenFlag=false;
				list.clear();
			}
		}
		
		File allfile=new File("/home/admin1/Desktop/AddressBooks");
		File [] files=allfile.listFiles();
		System.out.println("Available Files");
		for(int i=0;i<files.length;i++)
		{
			if(files[i].getName().contains(".json"))
			System.out.println(files[i].getName());
		}
		System.out.println();
		System.out.println("Give Name Of Address Book");
		String name=Utility.next();
		
		if(new File("/home/admin1/Desktop/AddressBooks/"+name+".json").exists())
		{
			fileAlreadyOpenFlag=true;
			flag=true;
			this.name=name;
			try 
			{
				list=mapper.readValue(new File("/home/admin1/Desktop/AddressBooks/"+name+".json"), new TypeReference<List<Person>>(){});
				changemade=addbook.operation(list);
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			
		}
		else
		{
			System.out.println("File Not Found");
		}
		return flag;
	}
	
	/*
	 * purpose: Save the changes in the file
	 */
	public void save() 
	{
		
		try 
		{
			System.out.println(name);
			fileAlreadyOpenFlag=false;
			mapper.writeValue(new File("/home/admin1/Desktop/AddressBooks/"+name+".json"), list);
		}
		catch (IOException e) 
		{	
			e.printStackTrace();
		}
		System.out.println("Changes Saved");
	}
	
	/*
	 *Purpose: Save the file in text format
	 */
	public void saveAs()
	{
		//System.out.println("Enter Format In Which FormatYou Want To save");
		//String format=Utility.next();
		String format = "txt";
		try {
			
		FileOutputStream fos=new FileOutputStream("/home/admin1/Desktop/AddressBooks/"+name+"."+format);
		byte b[]="FirstName   LastName    City        State       Zip         PhoneNumber \n".getBytes();
		String spaces="            ";
		fos.write(b);
		for(int i=0;i<list.size();i++)
		{
			
			b=(list.get(i).firstname+spaces.substring(list.get(i).firstname.length(),spaces.length())).getBytes();
			fos.write(b);
			b=(list.get(i).lastname+spaces.substring(list.get(i).lastname.length(),spaces.length())).getBytes();
			fos.write(b);
			b=(list.get(i).address.city+spaces.substring(list.get(i).address.city.length(),spaces.length())).getBytes();
			fos.write(b);
			b=(list.get(i).address.state+spaces.substring(list.get(i).address.state.length(),spaces.length())).getBytes();
			fos.write(b);
			b=(list.get(i).address.zip+spaces.substring(list.get(i).address.zip.length(),spaces.length())).getBytes();
			fos.write(b);
			b=(list.get(i).address.phone+spaces.substring(list.get(i).address.phone.length(),spaces.length())).getBytes();
			fos.write(b);
			b="\n".getBytes();
			fos.write(b);
			
		}
		fos.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	/*
	 * purpose: close the current file
	 */
	public void close()
	{
		if(fileAlreadyOpenFlag==true && changemade==true)
		{
			System.out.println("Do You Want To Save Changes For Previous Open File");
			System.out.println("1. Yes\n2. No");
			int ans=Utility.getInt();
			if(ans==1)
			{
			save();
			fileAlreadyOpenFlag=false;
			System.out.println("File Closed");
			}
			else
			{
				fileAlreadyOpenFlag=false;
				System.out.println("File Closed");
			}
		}
		else if(fileAlreadyOpenFlag==true && changemade==false)
		{
			fileAlreadyOpenFlag=false;
		}
	}
}
