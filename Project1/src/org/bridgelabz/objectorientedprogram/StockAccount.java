package org.bridgelabz.objectorientedprogram;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

//import org.bridgelabz.datastructure1.unOrderedList;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class StockAccount {
	List<Stocks> stockList=new ArrayList<>();
	List<String> transition=new ArrayList<>();
	int amount;
	

	public StockAccount()
	{
		
	}
	
	public StockAccount(String name)
	{
		if(!new File("/home/admin1/Desktop/StockAccountDetails/"+name+".json").exists())
		{
			FileOutputStream file;
			this.amount=10000;
			try
			{
				file = new FileOutputStream("/home/admin1/Desktop/StockAccountDetails/"+name+".json");
				new ObjectMapper().writeValue(file , this);
				//new ObjectMapper().writeValue(new File("/home/admin1/Desktop/StockAccountDetails/"+name+".json"), this);
				file.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("Person Exists");
		}
	}
	public StockAccount(String name,int x)
	{
		try
		{
			ObjectMapper ob=new ObjectMapper();
	
			StockAccount persontemp=ob.readValue(new File("/home/admin1/Desktop/StockAccountDetails/"+name+".json"),new TypeReference<StockAccount>() {});//

			this.stockList=persontemp.stockList;
	
			this.transition=persontemp.transition;
			
			this.amount=persontemp.amount;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
			
	}
	
	public void setstockList(List<Stocks> stocklist)
	{
		this.stockList=stocklist;
	}
	public List<Stocks> getstockList()
	{
		return this.stockList;
	}
	public List<String> gettransition()
	{
		return this.transition;
	}
	
	public void settransition(List<String> transition)
	{
		this.transition=transition;
	}
	
	public void setamount(int amount)
	{
		this.amount=amount;
	}
	
	public int getamount()
	{
		return this.amount;
	}
	
	public void buy(String symbol,int noofshare,String namelogin)
	{
		try 
		{
			List<Stocks> list=new ObjectMapper().readValue(new File("/home/admin1/Desktop/StockAccountDetails/StockMain.json"), new TypeReference<List<Stocks>>() {});
			LinkedList<Stocks> stockmain=new LinkedList<Stocks>();
			for(int i=0;i<list.size();i++)
			{
				stockmain.addLast(list.get(i));
			}
			int i=0;
			String name="";
			int price=0;
			for(i=0;i<stockmain.size();i++)
			{
				Stocks tempvalue=stockmain.pop(); 
				if(tempvalue.stocksSymbol.equals(symbol))
				{
					if((noofshare*tempvalue.pricePerShare)>amount)
					{
						System.out.println("Not Have Sufficient Amount");
						return;
					}
					else
					{	
						tempvalue.numberOfShare-=noofshare;
						name=tempvalue.stocksName;
						price=tempvalue.pricePerShare;
						stockmain.add(tempvalue);
						amount-=noofshare*tempvalue.pricePerShare;
						break;
					}
				}
				else
				{
					stockmain.add(tempvalue);
				}
			}
			if(i==stockmain.size())
			{
				System.out.println("Invalid Symbol");
				return;
			}
			
			List<Stocks> fill=new ArrayList<>();
			while(!stockmain.isEmpty())
			{
				fill.add(stockmain.pop());
			}
			new ObjectMapper().writeValue(new File("/home/admin1/Desktop/StockAccountDetails/StockMain.json"), fill);
			boolean stockfindflag=false;
			for(int j=0;j<stockList.size();j++)
			{
				Stocks temp=stockList.get(j);
				if(temp.stocksSymbol.equals(symbol))
				{
					stockfindflag=true;
					Date d=new Date();
					SimpleDateFormat a=new SimpleDateFormat("dd MM yyyy HH mm SS");
					String s=symbol+" buy  "+a.format(d);
					transition.add(s);
					stockList.get(j).numberOfShare+=noofshare;
					break;
				}
				
			}
			
			if(stockfindflag==false)
			{
				stockList.add(new Stocks(name,symbol,noofshare,price));
				Date d=new Date();
				SimpleDateFormat a=new SimpleDateFormat("dd MM yyyy HH mm SS");
				String s=symbol+" buy  "+a.format(d);
				transition.add(s);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void sell(String symbol,int noofshare,String namelogin)
	{
		try 
		{
			for(int i=0;i<stockList.size();i++)
			{
				Stocks temp=stockList.get(i);
				if(temp.stocksSymbol.equals(symbol))
				{
					if(temp.numberOfShare<noofshare)
					{
						System.out.println("Not Have Sufficient Shares");
						return;
					}
					stockList.get(i).numberOfShare-=noofshare;
					
					Date d=new Date();
					SimpleDateFormat a=new SimpleDateFormat("dd MM yyyy HH mm SS");
					String s=symbol+" sell  "+a.format(d);
					transition.add(s);
					amount+=stockList.get(i).pricePerShare*noofshare;
					break;
				}
			}
			
			LinkedList<Stocks> list=new ObjectMapper().readValue(new File("/home/admin1/Desktop/StockAccountDetails/StockMain.json"), new TypeReference<List<Stocks>>() {});
			LinkedList<Stocks> stockmain=new LinkedList<Stocks>();
			for(int i=0;i<list.size();i++)
			{
				stockmain.add(list.get(i));
			}
			
			for(int i=0;i<stockmain.size();i++)
			{
				Stocks tempvalue=stockmain.pop();
				if(tempvalue.stocksSymbol.equals(symbol))
				{
					tempvalue.numberOfShare+=noofshare;
					stockmain.add(tempvalue);
				}
				else
				{
					stockmain.add(tempvalue);
				}
			}
			List<Stocks> fill=new ArrayList<>();
			while(!stockmain.isEmpty())
			{
				fill.add(stockmain.pop());
			}
			new ObjectMapper().writeValue(new File("/home/admin1/Desktop/StockAccountDetails/StockMain.json"), fill);
					
		}
		catch(Exception e)
		{
			
		}
			
	}
	
	public void save(String filename)
	{
		try
		{
			new ObjectMapper().writeValue(new File("/home/admin1/Desktop/StockAccountDetails/"+filename+".json"), this);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	public void printReport()
	{
		System.out.println("StockName    StockSymbol   NoOfShare  SharePrice");
		System.out.println();
		for(int i=0;i<stockList.size();i++)
		{
			Stocks temp=stockList.get(i);
			System.out.println(temp.stocksName+"           "+temp.stocksSymbol+"           "+temp.numberOfShare+"           "+temp.pricePerShare);
		}
		System.out.println();
		
		System.out.println("Transition Details");
		System.out.println();
		for(int i=0;i<transition.size();i++)
		{
			String temp=transition.get(i);
			System.out.println(temp);
		}
		System.out.println();
		System.out.println("Amount Left="+amount);
		System.out.println();
		System.out.println();
	}
}
