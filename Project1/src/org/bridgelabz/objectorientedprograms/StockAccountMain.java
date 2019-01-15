package org.bridgelabz.objectorientedprograms;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.bridgelabz.utility.Utility;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class StockAccountMain {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, FileNotFoundException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		StockUser user = new StockUser();
		System.out.println("1.Create new account");
		System.out.println("2.Update your account");
		int choice = Utility.getInt();
		switch(choice) {
		case 1:
			System.out.println();
			StockUser user1 = new StockUser();
			System.out.println("Enter userId:");
			String userId = Utility.next();
			//user.setUserId(userId);
			System.out.println("Enter userName:");
			String userName = Utility.next();
			//user.setUserName(Utility.next());
			System.out.println("Buy Share");
			System.out.println("Enter Share name");
			String shareName = Utility.next();
			//user.setShareName(shareName);
			System.out.println("Enter number of share");
			int numberOfShare = Utility.getInt();
			//user.setNumberOfShare(numberOfShare);
			JSONObject userDetails = new JSONObject();
			userDetails.put("userId", userId);
			userDetails.put("userName", userName);
			userDetails.put("shareName", shareName);
			userDetails.put("numberOfShare", numberOfShare);
			JSONArray userlist = new JSONArray();
			userlist.add(userDetails);
			try(FileWriter file = new FileWriter("/home/admin1/Documents/stock5/user.json")){
				file.write(userlist.toJSONString());
				file.flush();
			}catch(IOException e) {
				e.printStackTrace();
			}
//			System.out.println("Enter shareName:");
//			user.setShareName(Utility.nextLine());
//			System.out.println("Enter numberOfShare");
//			user.setNumberofShare(Utility.getInt());
//			Utility.convertJavaToJson(user);
//			CompanyShare c = Utility.convertJsonToJava("/home/admin1/Documents/stock5/stock5.json", CompanyShare.class);
//			if(c.getNumberOfShare() - user.getNumberofShare() > 0) {
//				c.setNumberOfShare(c.getNumberOfShare() - user.getNumberofShare());
//				Utility.convertJavaToJson(c);
//			}
//			else
//				System.out.println("Share is not available");
		case 2:
//			System.out.println();
//			System.out.println("Enter userId:");
//			String uId = Utility.nextLine();
//			System.out.println("Enter userName:");
//			int uNoOfShare = Utility.getInt();
//			System.out.println("1.Value of");
//			System.out.println("2.Add share of stock to account");
//			System.out.println("3.Subtract share of stock to account");
//			System.out.println("4.Save account to file");
//			System.out.println("5.Print a detailed report of stock and values");
//			int choice1 = Utility.getInt();
//			StockUser u1 = Utility.convertJsonToJava("/home/admin1/Documents/stock5/user.json", StockUser.class);
//			CompanyShare c1 = Utility.convertJsonToJava("/home/admin1/Documents/stock5/stock5.json", CompanyShare.class);
//		//	switch(choice1) {
//		//	case 1:
//				System.out.println();
//				System.out.println("Total value of account is"+u1.getNumberofShare() * c1.getAmount());
//	//		case 2:
//				if((c1.getNumberOfShare() - uNoOfShare) > 0) {
//					System.out.println();
//					System.out.println("Add share of stock to account");
//					//u1.setNumberofShare(uNoOfShare + u1.getNumberofShare());
//					c1.setNumberOfShare(c1.getNumberOfShare() - uNoOfShare);
//					Utility.convertJavaToJson(u1);
//					Utility.convertJavaToJson(c1);
//					objectMapper.writeValue(new FileOutputStream("/home/admin1/Documents/rice.json"), u1);
					
				}
					
	//		case 3:
				
	//		case 4:
	//		case 5:
			//}
		}
	}
//	void valueOf() {
//		StockUser u1 = Utility.convertJsonToJava("/home/admin1/Documents/stock5/user.json", StockUser.class);
//		CompanyShare c1 = Utility.convertJsonToJava("/home/admin1/Documents/stock5/stock5.json", CompanyShare.class);
//	}

