package org.bridgelabz.objectorientedprogram;

import java.io.File;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.bridgelabz.utility.Utility;
import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class InventoryManager {
	private static ObjectMapper mapper=new ObjectMapper();
	//static Utility input=new Utility();
	public static void main(String args[]) throws Exception
	{
		
		int Option = 0;
		do {
			System.out.println("1. Add Inventory");
			System.out.println("2. Remove Inventory");
			System.out.println("3. Update Inventory");
			System.out.println("4. View All Inventory");
			System.out.println("5. For Exit");
			Option=Utility.getInt();
			switch(Option)
			{
			case 1:
				System.out.println("Enter Inventory Name");
				String name=Utility.next();
				System.out.println("Enter "+name+" Number");
				int number=Utility.getInt();
				System.out.println("Enter "+name+" Price");
				int price=Utility.getInt();
				addInventory(new InventoryFactory(name,number,price));
				break;
			case 2:
				removeInventory();
				break;
			case 3:
				updateInventory();
				break;
			case 4:
				viewAll();
				break;
			case 5:
				System.out.println("Exiting");
				break;
			default :
				System.out.println("Invalid Entry Retype");
			}
			
		}while(Option!=5);
		
	}
	
	public static void viewAll() throws Exception  
	{
		List <InventoryFactory> list=mapper.readValue(new File("/home/admin1/Desktop/InventoryReport.json"), new TypeReference<List<InventoryFactory>>() {});
		System.out.print("Inventory Name    ");
		System.out.print("Inventory Number    ");
		System.out.print("Inventory Value    ");
		System.out.print("Inventory Total    ");
		System.out.println();
		String temp="                      ";
		int Total=0;
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i).getinventoryname());
			System.out.print(temp.substring(0,temp.length()-list.get(i).getinventoryname().length()));
			System.out.print(list.get(i).getinventorynumber());
			System.out.print(temp.substring(0,temp.length()-(list.get(i).getinventorynumber()+"").length()));
			System.out.print(list.get(i).getinventoryvalue());
			System.out.print(temp.substring(0,temp.length()-(list.get(i).getinventoryvalue()+"").length()));
			System.out.print(list.get(i).getinventoryvalue()*list.get(i).getinventorynumber());
			System.out.print(temp.substring(0,temp.length()-((list.get(i).getinventoryvalue()*list.get(i).getinventorynumber())+"").length()));
			System.out.println();
			Total+=list.get(i).getinventoryvalue()*list.get(i).getinventorynumber();
		}
		System.out.println("Total  =  "+Total);
		System.out.println();
		
	}
	
	public static void  addInventory(InventoryFactory obj) throws Exception
	{
		List <InventoryFactory> list=mapper.readValue(new File("/home/admin1/Desktop/InventoryReport.json"), new TypeReference<List<InventoryFactory>>() {});
		list.add(obj);
		writingFile(list);
	}
	
	public static void removeInventory() throws Exception
	{
		System.out.println("Enter Name Of Inventory");
		String s=Utility.next();
		List <InventoryFactory> list=mapper.readValue(new File("/home/admin1/Desktop/InventoryReport.json"), new TypeReference<List<InventoryFactory>>() {});
		Predicate<InventoryFactory> p=new Predicate<InventoryFactory>() 
		{	
			@Override
			public boolean test(InventoryFactory t) 
			{
				return !(t.getinventoryname().equals(s));
			}
		};
		
		//Streaming API use of List interface
		list=list.stream().filter(p).collect(Collectors.toList());
		System.out.println(list.size());
		writingFile(list);
	}
	
	public static void writingFile(List<InventoryFactory> list)throws Exception
	{
		JsonFactory js=new JsonFactory();
		JsonGenerator jgen=js.createJsonGenerator(new File("/home/admin1/Desktop/InventoryReport.json"),JsonEncoding.UTF8);
		jgen.writeStartArray();
		for(int i=0;i<list.size();i++)
		{
		jgen.writeStartObject();
		jgen.writeStringField("inventoryname", list.get(i).getinventoryname());
		jgen.writeNumberField("inventorynumber", list.get(i).getinventorynumber());
		jgen.writeNumberField("inventoryvalue", list.get(i).getinventoryvalue());
		jgen.writeEndObject();
		}
		jgen.writeEndArray();
		jgen.close();
	}
	
	public static  void updateInventory() throws Exception
	{
		List <InventoryFactory> list=mapper.readValue(new File("/home/admin1/Desktop/InventoryReport.json"), new TypeReference<List<InventoryFactory>>() {});
		System.out.println("What You Want To Update");
		System.out.println("1. Name");
		System.out.println("2. Number");
		System.out.println("3. Value");
		int s=Utility.getInt();
		final String temp;
		System.out.println("Enter Name Of Inventory");
		 temp=Utility.next();
		System.out.println();
		if(s==1)
		{
			System.out.println("Enter New Name");
			String change=Utility.next();
			Function<InventoryFactory,InventoryFactory> f=new Function<InventoryFactory,InventoryFactory>()
				{
				@Override
				public InventoryFactory apply(InventoryFactory t) {
					InventoryFactory x=(InventoryFactory)t;
					if(x.getinventoryname().equals(temp))
					{
						x.setinventoryname(change);
					}
					
					return x;
				}
			};
			
			//Streaming API use of List interface
			list=list.stream().map(f).collect(Collectors.toList());
			writingFile(list);
		}
		else if(s==2)
		{
			
			System.out.println("Enter New Number");
			int change=Utility.getInt();
			Function<InventoryFactory,InventoryFactory> f=new Function<InventoryFactory,InventoryFactory>()
				{
				@Override
				public InventoryFactory apply(InventoryFactory t) {
					InventoryFactory x=(InventoryFactory)t;
					if(x.getinventoryname().equals(temp))
					{
						x.setinventorynumber(change);
					}
					return x;
				}
			};
			
			//Streaming API use of List interface
			list=list.stream().map(f).collect(Collectors.toList());
			writingFile(list);
		}
		else if(s==3)
		{
			System.out.println("Enter New value");
			int change=Utility.getInt();
			Function<InventoryFactory,InventoryFactory> f=new Function<InventoryFactory,InventoryFactory>()
				{
				@Override
				public InventoryFactory apply(InventoryFactory t) 
				{
					InventoryFactory x=(InventoryFactory)t;
					if(x.getinventoryname().equals(temp))
					{
						x.setinventoryvalue(change);
					}
					
					return x;
				}
				};
			
			list=list.stream().map(f).collect(Collectors.toList());
			writingFile(list);
		}
	}
}
