package org.bridgelabz.objectorientedprogram;

public class Stocks {
	String stocksName;
	String stocksSymbol;
	int numberOfShare;
	int pricePerShare;
	public Stocks()
	{
		
	}
	public Stocks(String stocksname,String stockssymbol,int numberofshare, int pricepershare)
	{
		this.stocksName = stocksname;
		this.stocksSymbol = stockssymbol;
		this.numberOfShare = numberofshare;
		this.pricePerShare = pricepershare;
	}
	
	public String getstocksname() 
	{
		return stocksName;
	}

	public void setstocksname(String stocksname) 
	{
		this.stocksName = stocksname;
	}

	public String getstockssymbol() 
	{
		return stocksSymbol;
	}

	public void setstockssymbol(String stockssymbol) 
	{
		this.stocksSymbol = stockssymbol;
	}

	public int getNumberofshare() 
	{
		return numberOfShare;
	}

	public void setNumberofshare(int numberofshare) 
	{
		this.numberOfShare = numberofshare;
	}

	public int getPricepershare() 
	{
		return pricePerShare;
	}

	public void setPricepershare(int pricepershare) 
	{
		this.pricePerShare = pricepershare;
	}
}
