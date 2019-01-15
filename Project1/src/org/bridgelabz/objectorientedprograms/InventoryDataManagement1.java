package org.bridgelabz.objectorientedprograms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

/**
 * Purpose: Inventory Details for Rice, Pulses and Wheats
 *			with properties name, weight, price per kg.
 *
 * @author  Mohit Kumar 
 * @version 1.0
 */
public class InventoryDataManagement1 {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		JSONParser jsonParser = new JSONParser();
		JSONArray stockList = null;
		try(FileReader reader = new FileReader("/home/admin1/Documents/Inventory.json"))
		{
			Object obj = null;
			try {
				obj = jsonParser.parse(reader);
			} catch (org.json.simple.parser.ParseException e) {
				e.printStackTrace();
			}
			stockList = (JSONArray) obj;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
		Object[] str = new Object[stockList.size()];
		for(int i=0; i<stockList.size(); i++) {
			str[i] =  stockList.get(i);
		}
		System.out.println(Arrays.toString(str));
	}

}
