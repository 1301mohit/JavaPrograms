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
	public String getStocksName() {
		return stocksName;
	}
	public void setStocksName(String stocksName) {
		this.stocksName = stocksName;
	}
	public String getStocksSymbol() {
		return stocksSymbol;
	}
	public void setStocksSymbol(String stocksSymbol) {
		this.stocksSymbol = stocksSymbol;
	}
	public int getNumberOfShare() {
		return numberOfShare;
	}
	public void setNumberOfShare(int numberOfShare) {
		this.numberOfShare = numberOfShare;
	}
	public int getPricePerShare() {
		return pricePerShare;
	}
	public void setPricePerShare(int pricePerShare) {
		this.pricePerShare = pricePerShare;
	}
	
}