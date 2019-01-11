package org.bridgelabz.objectorientedprograms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import org.bridgelabz.utility.Utility;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class StockReport {

	public static void main(String[] args) {
		//JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader("/home/admin1/Documents/stock.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray stockList = (JSONArray) obj;
            System.out.println(stockList);
             
            //Iterate over employee array
            stockList.forEach( emp -> parseStockObject( (JSONObject) emp ) );
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
		}
	}


