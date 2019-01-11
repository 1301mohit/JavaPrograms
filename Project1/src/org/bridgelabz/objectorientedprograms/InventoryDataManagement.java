package org.bridgelabz.objectorientedprograms;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.bridgelabz.utility.Utility;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class InventoryDataManagement {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		File rFile = new File("/home/admin1/Documents/rice.json");
		File pFile = new File("/home/admin1/Documents/pulses.json");
		File wFile = new File("/home/admin1/Documents/wheats.json");
		Rice rice = objectMapper.readValue(rFile, Rice.class);
		Pulses pulse = objectMapper.readValue(pFile, Pulses.class);
		Wheats wheat = objectMapper.readValue(wFile, Wheats.class);
		System.out.println("Name:"+rice.getPrice()+" "+"Price:"+rice.getPrice()+" "+"Weight:"+rice.getWeight());
		System.out.println("Name:"+pulse.getName()+" "+"Price:"+pulse.getPrice()+" "+"Weight:"+pulse.getWeight());
		System.out.println("Name:"+wheat.getName()+" "+"Price:"+pulse.getPrice()+" "+"Weight:"+pulse.getWeight());
		System.out.println("Price of "+rice.getPrice()+" kg "+rice.getName()+" is "+rice.getPrice()*rice.getWeight());
		System.out.println("Price of "+pulse.getPrice()+" kg "+pulse.getName()+" is "+pulse.getPrice()*pulse.getWeight());
		System.out.println("Price of "+wheat.getPrice()+" kg "+wheat.getName()+" is "+wheat.getPrice()*wheat.getWeight());
		rice.setTotal(rice.getPrice(), rice.getWeight());
		pulse.setTotal(pulse.getPrice(), pulse.getWeight());
		wheat.setTotal(wheat.getPrice(), wheat.getWeight());
//		objectMapper.writeValue(new FileOutputStream("/home/admin1/Documents/rice.json"), rice);
//		objectMapper.writeValue(new FileOutputStream("/home/admin1/Documents/pulses.json"), pulse);
//		objectMapper.writeValue(new FileOutputStream("/home/admin1/Documents/wheats.json"), wheat);
		String jsonRice = Utility.convertJavaToJson(rice);
		String jsonPulse = Utility.convertJavaToJson(pulse);
		String jsonWheat = Utility.convertJavaToJson(wheat);
		System.out.println(jsonRice);
		System.out.println(jsonPulse);
		System.out.println(jsonWheat);
	}
		

}
