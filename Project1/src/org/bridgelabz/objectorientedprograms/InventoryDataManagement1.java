package org.bridgelabz.objectorientedprograms;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class InventoryDataManagement1 {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		Inventory inventory = new Inventory();
		//ArrayList arr = new ArrayList();
		File file = new File("/home/admin1/Documents/Inventory.json");
		inventory = objectMapper.readValue(file, Inventory.class);
		System.out.println(inventory.getName()+" "+inventory.getWeight());
		objectMapper.writeValue(new FileOutputStream("/home/admin1/Documents/Inventory.json"), inventory);
	}

}
