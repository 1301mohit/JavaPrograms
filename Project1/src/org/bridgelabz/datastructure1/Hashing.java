package org.bridgelabz.datastructure1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.bridgelabz.datastructure.SingleLinkedList;
import org.bridgelabz.utility.Utility;

public class Hashing {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter path");
		String path = Utility.next();
		ArrayList a= new ArrayList(11);
		
		String element[] = {"5","7","0","33","22"};//,"35","64","96","55","22","85","23"};//Utility.readFromFile(path);
//		for (int i = 0; i < element.length; i++) {
//			System.out.println(element[i]);
//		}
		
	for (int i = 0; i < 11; i++) {
		a.add(null);
	}
	System.out.println(a);
	
		
		
		
		
		
//	int element1[] = new int[4];
	for(int i=0; i<element.length; i++) {
		int remainder = Integer.parseInt(element[i]) % 11; 
			//System.out.println("I "+i);
            //  System.out.println("Elem "+element[i]);
               if(a.get(remainder)==null) {
            	//   System.out.println("Elem  in if"+element[i]);
            	  a.add(remainder,new LinkedList());
            	//   System.out.println(a.get(remainder)+"re"+remainder);
            	  ((LinkedList)a.get(remainder)).add(element[i]);//.add(element[i]);
            	//   System.out.println("after"+ ((LinkedList)a.get(remainder))+" "+remainder);
            	   
    
            	  
               }else {
            //	   System.out.println("Elem  in else part"+element[i]);
            	   ((LinkedList)a.get(remainder)).add(element[i]);//.add(element[i]);
            	   
               }
		}
	
		for (int i = 0; i < 11; i++) {
			//System.out.println(a.get(i));
	//if(a.get(i)!=null) {
				System.out.println("index is"+i);
			System.out.println((LinkedList)a.get(i));
		//}
		}
		
	}
}