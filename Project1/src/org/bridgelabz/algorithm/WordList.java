package org.bridgelabz.algorithm;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import org.bridgelabz.utility.Utility;

public class WordList {

	public static void main(String[] args) throws FileNotFoundException {
//		File file = new File("/home/admin1/abc.txt");
//		Scanner sc = null;
//		try {
//			sc = new Scanner(file);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		while(sc.hasNext())
//			System.out.println();
		//File file =  new File("/home/admin1/Documents/abc.txt"); 
		//Scanner sc = new Scanner(file); 
		//System.out.println("Enter word");
		//String word = Utility.next();
	   //while (sc.indexOf(word) != -1) 
			// System.out.println(sc.nextLine()); 
		System.out.println("----------------");
		FileReader file = new FileReader("/home/admin1/Documents/abc.txt");
		Scanner in = new Scanner(file);
		String str[] = new String[7];
		int count=0, i=0;
		while(in.hasNext()) {
			String word = in.next();
			  System.out.println(word);
			count++;
			str[i] = word;
		      i++;
		}
		System.out.println(count);
		
	//	int i=0, count=0;
	//	String str = in.next();
		// while (in.hasNext()) {
		   //   String word  = in.next();
		//     System.out.println(word);
		//      System.out.println("1234");
		      
		// }
		 for(int j=0;j<str.length;j++) {
			 System.out.print(str[i]+" ");
		 }
		// System.out.println(count);
		/*List<String> list = new ArrayList<String>();
		while(str != null) {
			list.add(str);
		}
		String[] stringArr = list.toArray();*/
	}

}
