package org.bridgelabz.objectorientedprograms;

import org.bridgelabz.utility.Utility;
import org.codehaus.jackson.map.ObjectMapper;

public class StockAccount {
	ObjectMapper objectMapper = new ObjectMapper();
	/*StockAccount(String filename){
		
	*/
	void valueOf()
	{
		StockUser u1 = Utility.convertJsonToJava("/home/admin1/Documents/stock5/user.json", StockUser.class);
		CompanyShare c1 = Utility.convertJsonToJava("/home/admin1/Documents/stock5/stock5.json", CompanyShare.class);
		System.out.println();
		System.out.println("Total value of account is"+u1.getNumberofShare() * c1.getAmount());
	}
//	void buy(double amount, String symbol) {
////		System.out.println("Enter share name");
////		String shareName = Utility.next();
////		System.out.println("Enter number of share");
////		int numberOfShare = Utility.getInt();
//		StockUser u1 = Utility.convertJsonToJava("/home/admin1/Documents/stock5/user.json", StockUser.class);
//		CompanyShare c1 = Utility.convertJsonToJava("/home/admin1/Documents/stock5/stock5.json", CompanyShare.class);
//		int numberOfShare = (int) (amount/c1.getAmount());
//		c1.setNumberOfShare(c1.getNumberOfShare() - numberOfShare);
//		u1.
//	}
//	void sell(int amount, String symbol) {
//		
//	}
//	void save(String fileName) {
//		
//	}
//	void printReport() {
//		
	}

