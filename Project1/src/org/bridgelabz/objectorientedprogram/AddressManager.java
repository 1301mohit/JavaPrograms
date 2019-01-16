package org.bridgelabz.objectorientedprogram;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bridgelabz.utility.Utility;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class AddressManager implements AddressManagerInterface{
	ObjectMapper mapper=new ObjectMapper();
	//Utility input=new Utility();
	List<Person> list=new ArrayList<>();
	AddressBookInterface addbook=new AddressBook();
	String name;
	boolean filealreadyopenflag=false;
	boolean changemade=false;
	public void create()
	{
		if(filealreadyopenflag==true  && changemade==true)
		{
			System.out.println("Do You Want To Save Changes For Previous Open File");
			System.out.println("1. Yes\n2. No");
			int ans=Utility.getInt();
			if(ans==1)
			{
			save();
			filealreadyopenflag=false;
			}
			else
			{
				filealreadyopenflag=false;
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
	public boolean open()
	{
		boolean flag=false;
		if(filealreadyopenflag==true)
		{
			System.out.println("Do You Want To Save Changes For Previous Open File");
			System.out.println("1. Yes\n2. No");
			int ans=Utility.getInt();
			if(ans==1)
			{
			save();
			filealreadyopenflag=false;
			}
			else
			{
				filealreadyopenflag=false;
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
			filealreadyopenflag=true;
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
	
	public void save() 
	{
		try 
		{
			filealreadyopenflag=false;
			mapper.writeValue(new File("/home/administrator/Desktop/AddressBooks/"+name+".json"), list);
		}
		catch (IOException e) 
		{	
			e.printStackTrace();
		}
		System.out.println("Changes Saved");
	}
	
	public void saveAs()
	{
		System.out.println("Enter For Format In Which You Want To save");
		String format=Utility.next();
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
	
	public void close()
	{
		if(filealreadyopenflag==true && changemade==true)
		{
			System.out.println("Do You Want To Save Changes For Previous Open File");
			System.out.println("1. Yes\n2. No");
			int ans=Utility.getInt();
			if(ans==1)
			{
			save();
			filealreadyopenflag=false;
			System.out.println("File Closed");
			}
			else
			{
				filealreadyopenflag=false;
				System.out.println("File Closed");
			}
		}
		else if(filealreadyopenflag==true && changemade==false)
		{
			filealreadyopenflag=false;
		}
	}
}
