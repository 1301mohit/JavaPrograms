package org.bridgelabz.objectorientedprogram;

import org.bridgelabz.objectorientedprogram.StockAccount;
import org.bridgelabz.utility.Utility;

public class StockAccountMain {
	public static void main(String[] args)
	{	
		int Answer=0;
	//	Utility input=new Utility();
		do
		{
			System.out.println("1. Create A Account");
			System.out.println("2. Login");
			System.out.println("3. Exit");
			System.out.print("Enter your choice:");
			Answer=Utility.getInt();
			switch(Answer)
			{
			case 1:
				System.out.println();
				System.out.println("Enter your name");
				String name=Utility.next();
				StockAccount newperson=new StockAccount(name);
				break;
				
			case 2:
				System.out.println("Enter Name");
				String nameLogin=Utility.next();
				StockAccount currentPerson=new StockAccount(nameLogin, 2);
				try {
					int Answer2=0;
					do {
						System.out.println("1. Buy");
						System.out.println("2. Sell");
						System.out.println("3. PrintReport");
						System.out.println("4. Exit");
						Answer2=Utility.getInt();
						switch(Answer2)
						{
							case 1:
								System.out.println("Enter Symbol");
								String symbol=Utility.next();
								System.out.println("Enter number");
								int noOfShare=Utility.getInt();
								currentPerson.buy(symbol, noOfShare,nameLogin);
								break;
							case 2:
								System.out.println("Enter Symbol");
								String symbol1=Utility.next();
								System.out.println("Enter number");
								int noOfShare1=Utility.getInt();
								currentPerson.sell(symbol1, noOfShare1, nameLogin);
								break;
							case 3:
								currentPerson.printReport();
								break;
							case 4:
								currentPerson.save(nameLogin);
								System.out.println("Exiting");
								break;
							default :
								System.out.println("Invalid Entry");												
						}
					}while(Answer2!=4);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}		
				break;
				
			case 3:
				System.out.println("Exiting");
				break;
			default :
				System.out.println("Invalid Entry");
			}
		}while(Answer!=3);
	}
}
