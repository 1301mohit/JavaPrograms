package org.bridgelabz.objectorientedprograms;

/**
 * Purpose: Stock class
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   11/01/2019
 */

public class Stock
{
	@Override
	public String toString() {
		return "Stock [stockName=" + stockName + ", numberOfShare=" + numberOfShare + ", sharePrice=" + sharePrice
				+ "]";
	}
	String stockName;
	int numberOfShare;
	double sharePrice;
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public int getNumberOfShare() {
		return numberOfShare;
	}
	public void setNumberOfShare(int numberOfShare) {
		this.numberOfShare = numberOfShare;
	}
	public double getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}
}
