package org.bridgelabz.algorithm;

import java.util.ArrayList;

import org.bridgelabz.utility.Utility;

public class APPrimeNumber {
	public static void main(String[] args) {
		String s1 = null;
		String s2 = null;
		boolean b = false;
		System.out.println("Enter the range of the prime number");
		int n = Utility.getInt();
		ArrayList<Integer> a = Utility.prime1(n);
		System.out.println(a);
		//Integer ah=a.get(0);
		//System.out.println(ah);
		for(int i=0; i<a.size(); i++) {
			for(int j=i+1; j<a.size(); j++) {
				s1 = Integer.toString(a.get(i));
				//System.out.println(s1+"-");
				s2 = Integer.toString(a.get(j));
				//System.out.println(s1+"-"+s2);
				b = Utility.isAnagram(s1, s2);
				if(b)
				{
					//System.out.println(s1+"-"+s2);
					if(Utility.isPallindrom(Integer.parseInt(s1+s2))) {}
						//System.out.println(a.get(i)+","+a.get(j));
						System.out.println(s1+" "+s2);
				}
			}
		}
		
		//boolean b = Utility.isAnagram(""+a.get(0),""+a.get(1));
	}
}
