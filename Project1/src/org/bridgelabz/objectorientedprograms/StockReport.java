package org.bridgelabz.objectorientedprograms;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;

import org.bridgelabz.utility.Utility;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class StockReport {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException 
	{
		

		ArrayList<Stock> arr = new ArrayList<Stock>();
		ObjectMapper mapper = new ObjectMapper();
		double totalvalue = 0.0;
		try {
			System.out.println("Enter number of Stocks");
			int numberOfStocks = Utility.getInt();
			System.out.println();
			double valueOfStock[] = new double[numberOfStocks];
			
			for(int i=0; i<numberOfStocks; i++) {
				Stock stock = new Stock();
				System.out.println("Stock"+(i+1)+":");
				System.out.println("Enter share name");
				stock.setStockName(Utility.next());
				System.out.println();
				System.out.println("Enter number of share");
				stock.setNumberOfShare(Utility.getInt());
				System.out.println();
				System.out.println("Enter share price");
				stock.setSharePrice(Utility.getDouble());
				System.out.println();
				valueOfStock[i] = stock.getSharePrice() * stock.getNumberOfShare();
				totalvalue = totalvalue + valueOfStock[i];
				arr.add(stock);
			}
			System.out.println("Stock Report");
			System.out.println("------------");
			String str = Utility.convertJavaToJson(arr);
			System.out.println(str);
			mapper.writeValue(new FileOutputStream("/home/admin1/Documents/stock1.json"), Utility.convertJavaToJson(arr));
			System.out.println();
			for(int i=0; i<numberOfStocks; i++)
				System.out.println("Total price of "+arr.get(i).getStockName()+" is "+valueOfStock[i]);
			System.out.println();
			System.out.println("Total price of all stocks is :"+totalvalue);
		}catch(InputMismatchException e) {
			System.out.println("Please enter right input");
		}
	}
}











////JSON parser object to parse read file
//JSONParser jsonParser = new JSONParser();
//JSONArray stockList = null;
//try (FileReader reader = new FileReader("/home/admin1/Documents/stock.json"))
//{
//  //Read JSON file
//  Object obj = null;
//	try {
//		obj = jsonParser.parse(reader);
//	} catch (org.json.simple.parser.ParseException e) {
//		e.printStackTrace();
//	}
//
//  stockList = (JSONArray) obj;
//  System.out.println(stockList);
//   
//  //Iterate over employee array
////   stockList.forEach( emp -> parseStockObject( (JSONObject) emp ) );
//
//} catch (FileNotFoundException e) {
//  e.printStackTrace();
//} catch (IOException e) {
//  e.printStackTrace();
//}
//Object[] str = new Object[stockList.size()];
//for(int i=0; i<str.length; i++) {
//		str[i] = stockList.get(i);
//	}
//System.out.println(str[0]);
//}
//LinkedList<Stock> list = mapper.readValue(new File("/home/admin1/Documents/stock.json"), new TypeReference<LinkedList<Stock>>() {});
//System.out.println(list.get(0));

