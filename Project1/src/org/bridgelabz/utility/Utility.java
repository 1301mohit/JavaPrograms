package org.bridgelabz.utility;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 *  purpose: Declare Utility Class implements methods which are called by any other class. 
 * 
 *  @author  MohitKumar
 *  @version 1.0
 *  @since   12-12-2018
 */

public class Utility {
	static Scanner sc = new Scanner(System.in);	//Create the static reference variable of Scanner class
	
	/*
	 *  This method is used to get integer value from user
	 *  @return integer
	 */
	
	public static int getInt(){
		int n = sc.nextInt();
		return n;
	}
	
	/*
	 * This method is used to get double value from user
	 * @return double
	 */
	
	public static double getDouble(){
		double n = sc.nextDouble();
		return n;
	}
	
	/*
	 * This method is used to get one word string from user
	 * @return String
	 */
	
	public static String next(){
		String n = sc.next();
		return n;
	}
	
	/*
	 * This method is used to get sentence or word string from user
	 * @return String
	 */
	
	public static String nextLine(){
		String n = sc.nextLine();
		return n;
	}
	
	/*
	 * This method is used to get float value from user
	 * @return float
	 */
	
	public static float getFloat(){
		float n = sc.nextFloat();
		return n;
	}
	
	/*
	 * This method is used to get byte value from user
	 * @return byte
	 */
	
	public static Byte getByte(){
		byte n = sc.nextByte();
		return n;
	}
	
	/*
	 * This method is used to get boolean value from user
	 * @return boolean
	 */
	
	public static boolean getBoolean(){
		boolean n = sc.nextBoolean();
		return n;
	}
	
	/*
	 * This method is used to get power of integer value
	 * @param a This is the first parameter i.e base
	 * @param b This is the second parameter i.e exponent
	 * return integer
	 */
	
	public static int pow(int a, int b) {
		int p = 1;
		while(b != 0) {
			p = p * a;
			b--;
		}
		return p;
	}
	
	public static double pow(double a, double b) {
		double p = 1;
		while(b != 0) {
			p = p * a;
			b--;
		}
		return p;
	}
	/*
	 * This method is used to replace <<username>> with the proper name of the user
	 * @return String
	 */
	
	public static String replaceString(){
		String st = "Hello <<username>>, How are you?";
		System.out.println("Username has minimum three character");
		System.out.println("Enter Username");
		String s = nextLine();
		if(s.length() < 3) {
			throw new IllegalArgumentException("Minimum length of the username is 3");
		}
		else {
		String st1 = st.substring(0, 6);
		String st2 = s;
		String st3 = st.substring(18, 32);
		//Concatenate the strings
		return (st1+st2+st3);
		}
	}
	
	/*
	 * We use random function to get value between 0 and 1. If < 0.5 then tails otherwise heads
	 * and we calculate percentage of heads and tails.
	 */
	public static void flipCoin() {
		int tail = 0,head = 0;
		Random r = new Random();
		System.out.println("The number of times to flip coin");
		double n = getDouble();
		for(int i=0; i<n; i++) {
			double d =  r.nextDouble();
			if(d < 0.5)
				//count number of tail
				tail++;
			else 
				//count number of head
				head++;
		}
		System.out.println("Percentage of tail:"+(tail/n)*100);
		System.out.println("Percentage of head:"+(head/n)*100);
	}
	
	/*
	 * This method is used to identify user input year is leap year or not
	 * @exception IllegalArgumentException if user input less than four digit or
	 * greater than four digit
	 */
	public static String isLeapYear(int year) {
		if(year > 9999 || year < 1000) //Check the digit of the year is four or not
			throw new IllegalArgumentException("Please enter 4 digit number"); //Throw an exception if the year is not four digit
		else {
			if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0 ) {	//To check the year is leap year or not
				return (year+" is leap year");
			}
			else {
				return (year+" is not leat year");
			}
		}
	}
	
	/*
	 * This method is used to print table of the power of 2 according to user input
	 * in this method user input is exponent of the power
	 * @exception IllegalArgumentException if exponent is greater than 30 and less than 0 
	 * @param exponent This is the parameter of the method i.e the exponent of the power 
	 */
	
	public static void table(int exponent){
		if(exponent > 31 || exponent < 0)
			throw new IllegalArgumentException("The range of the exponent is 0 to 30");
		else
			for(int i=0; i<exponent+1; i++) {
				System.out.println("2^"+i+"->"+Utility.pow(2,i));	//print the table of the power of 2
			}
	}
	
	/*
	 * This method is used to calculate the harmonic number 
	 * @exception IllegalArgumentException if user input 0 and less than 0 value
	 * @param number this is the parameter which is taken by the user
	 * @return double
	 */
	
	public static double harmonicNumber(int number) {
		if(number <= 0)
			throw new IllegalArgumentException("Please enter positive value");
		else {
			double s = 0;
			//The sum of the harmonic series
			for(int i=1; i<=number; i++) {
				s = s + 1.0/i;
			}
			return s;
		}
	}
	
	/*
	 * This method is used to calculate the prime factor of the number
	 * The square of the prime factor is less than n
	 * @param n This is the parameter taken by the user
	 * @return String
	 */
	
	public static String primeFactor(int n) {
		int c = 0;
		String st = "";
		for(int i=2; i*i<=n; i++) {	//By using this loop we calculate all factors of n
			if(n % i == 0) {
				for(int j=2; j<=i/2; j++) {	//By using this loop we calculate prime factors of n
					c = 0;
					if(i % j == 0) {
						c = 1;
						break;
					}
				}
				if(c == 0) {
					st = st + i + " ";
				}
			}
		}
	return st;
	}
	
	/*
	 * This method is used to print two dimensional array of integer value
	 * @param i This is the two dimensional array parameter of integer type taken by the user
	 */

	public static void itwoDArray(int[][] i) {
		for(int j=0; j<i.length; j++) {
			for(int k=0; k<i[0].length; k++) {
				System.out.print(i[j][k]+" ");
			}
			System.out.println();
		}
	}
	
	/*
	 * This method is used to print two dimensional array of double value
	 * @param i This is the two dimensional array parameter of double type taken by the user
	 */
	
	public static void dtwoDArray(double[][] d) {
		for(int j=0; j<d.length; j++) {
			for(int k=0; k<d[0].length; k++) {
				System.out.print(d[j][k]+" ");
			}
			System.out.println();
		}
	}
	
	/*
	 * This method is used to print two dimensional array of boolean value
	 * @param i This is the two dimensional array parameter of boolean type taken by the user
	 */

	public static void btwoDArray(boolean[][] bln) {
		for(int j=0; j<bln.length; j++) {
			for(int k=0; k<bln.length; k++) {
				System.out.print(bln[j][k]+" ");
			}
			System.out.println();
		}	
	}
	
	public static double distance(int x, int y) {
		return Math.sqrt(x*x + y*y);
	}
	
	/*
	 * This method is used to calculate the roots of the quadratic equation
	 * @param a This is the coefficient of x^2
	 * @param b This is the coefficient of x
	 * @param c This is the constant
	 * @exception if the value of the a is equal to 0 then its throw an exception 
	 */
	public static void root(double a, double b, double c) {
		
		//The coefficient of a is not zero
		if(a == 0)
			
			throw new IllegalArgumentException("Please enter the value of the a is other than 0");
		
		//Calculate delta
		double delta = b*b - 4*a*c;
		
		//Initialize root1
		double root1 = 0;
		
		//Initialize root2
		double root2 = 0;
		
		System.out.println("Roots of the Quadratic equation");
		
		// condition for real and different roots
		if(delta > 0) {
			root1 = (-b + Math.sqrt(delta))/(2*a);
			root2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println("root1:"+root1);
			System.out.println("root2:"+root2);
		}
		
		//condition for real and equal roots
		else if(delta == 0) {
			root1 = root2 = -b/(2*a);
			//root2 = -b/2*a;
			System.out.println("root1:"+root1);
			System.out.println("root2:"+root2);
		}
		
		// if roots are not real 
		else {
			double p1 = (-b/(2*a));
			double p2 = (Math.sqrt(-delta)/(2*a));
			System.out.println("root1:"+p1+" + i"+p2);
			System.out.println("root2:"+p1+" - i"+p2);
		}
	}
	
	/**
	 * This method is used to Play till the gambler is broke or has won
	 * stake is input by the user i.e i
	 * if stake is equal to 0 then its broke
	 * stake is equal to goal then its won
	 */
	public static void gambler() {
		int win = 0, loss = 0;
		Random r = new Random();
		System.out.println("Enter stake");
		
		//input stake
		int stake = Utility.getInt();
		
		System.out.println("Enter goal");
		
		//input goal
		int goal = Utility.getInt();
		
		System.out.println("Enter number of times");
		
		//input number of times user want to play
		int n = Utility.getInt();
		
		//for loop starts from 1 and ends when i is equal to number of times or stake is equal to 0 or stake is equal to goal
		for(int i=1; i<=n && stake!=0 && stake!=goal; i++) {
			
			//random input only 0 and 1
			int a = r.nextInt(2);
			
			//if random number is equal to 0 then  win
			if(a == 0) { 
				win++;
				stake++;
			}
			
			//if random number is equal to 1 then loss
			else {
				loss++;
				stake--;
			}
		}
		
		//Print number of times win
		System.out.println("Number of wins:"+win);
		
		//Print percentage of win
		System.out.println("Percentage of win:"+(double)win/(win + loss)*100);
		
		//Print percentage of loss
		System.out.println("Percentage of loss:"+(double)loss/(win + loss)*100);
	}
	
	/*
	 * This method is used to check two string is anagram or not
	 * @param s1 This is the first parameter i.e. first string
	 * @param s2 This is the second parameter i.e. second string
	 */

	public static boolean isAnagram(String s1, String s2) {
		
		//compare the length of two strings is equal or not
		if(s1.length()!=s2.length())
			return false;
		
		//call count method and pass first string
		int c1[] = count(s1);
		
		//call count method and pass second string
		int c2[] = count(s2);
		
		//check the value of the two strings are equal or not
		for(int i=0; i<c1.length; i++) {
			if(c1[i] != c2[i])
				return false;
		}
		return true;
	}
	
	/**
	 * This method is used to count the alphabets present in the string and increment the index
	 * of the count array
	 * @param s s is a string
	 * @return integer one dimensional array
	 */
	public static int[] count(String s) {
		
		//Convert String to character array
		char c[] = s.toCharArray();
		
		//Define a count array and the size of the array is 36
		int count[] = new int[36];
		
		//using loop 0 to size of the character array
		for(int i=0; i<c.length; i++) {
			
			//if character array is small alphabet
			if(c[i]>='a' && c[i]<='z')
				
				//small alphabet covert into the integer and increment the count array
				count[c[i]-97]++;
			
			//if character array is capital alphabet
			if(c[i]>='A' && c[i]<='Z')
				
				//capital alphabet convert into the integer and increment the count array
				count[c[i]-65]++;
			
			//if character array is digit between 0 to 9
			if(c[i]>='0' && c[i]<='9')
				
				//digit convert into the integer and increment the count array
				count[c[i]-22]++;
		}
		
		//return count array
		return count;
	}
	
	/*
	 * This method is used to print the prime number series
	 * @param n its defines the range of the prime number
	 */
	public static void prime(int n) {
		
		//This for loop is starts from 2 and iterate n times
		for(int i=2; i<=n; i++) {
			int c = 0;
			
			//This for loop is starts from 2 and iterate half of the value of the first loop
			for(int j=2; j<=i/2; j++) {
				
				/*If the reminder of the first loop value and the second loop value is 0
				  then the value of the c is equal to 1 and break the inner loop*/
				if(i % j == 0) {
					c = 1;
					break;
				}
			}
			
			//if c is equal to 0 its mean the value of i is prime number and print the value of i
			if(c == 0)
				System.out.print(i+" ");
		}
	}
	
public static void prime1(int n) {
		ArrayList<> arr = new ArrayList();
		//This for loop is starts from 2 and iterate n times
		for(int i=2; i<=n; i++) {
			int c = 0;
			
			//This for loop is starts from 2 and iterate half of the value of the first loop
			for(int j=2; j<=i/2; j++) {
				
				/*If the reminder of the first loop value and the second loop value is 0
				  then the value of the c is equal to 1 and break the inner loop*/
				if(i % j == 0) {
					c = 1;
					break;
				}
			}
			
			//if c is equal to 0 its mean the value of i is prime number and print the value of i
			if(c == 0)
				arr.add(i);
				//System.out.print(i+" ");
		}
	}
	
	public static boolean isPallindrom(int n) {
		int t = n, r, s = 0;
		while(n != 0) {
			r = n % 10;
			s = s * 10 + r;
			n = n / 10;
		}
		if(t == s)
			return true;
		else
			return false;
	}
	
	public static int[] bubbleSort(int[] a) {
		int temp;
		boolean swapped;
		int size = a.length;
		for(int i = 0; i < size; i++) {
			swapped = false;
			for(int j=0; j<size-i-1; j++) {
				if(a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					swapped = true;
				}
			}
			if(swapped == false)
				return a;
		}
		return a;
	}
	
	public static int[] inputArray() {
		System.out.println("Enter the size of the array");
		int size = Utility.getInt();
		int a[] = new int[size];
		System.out.println("Enter elements of array");
		for(int i=0; i<a.length; i++) {
			a[i] = getInt();
		}
		return a;
	}
	
	public static void printArray(int b[]) {
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]+" ");
		}
	}
	
	public static void couponNumber() {
		int c = 0, t;
		System.out.println("Enter number of coupon number");
		int n = getInt();
		int a[] = new int[n];
		System.out.println("Enter distinct integer value");
		for(int i=0; i<a.length; i++) {
			a[i] = getInt();
		}
		int maxValue = maxValue(a);
		Random r = new Random();
		while(n != 0) {
			int p = r.nextInt(maxValue + 1);
			c++;
			for(int i=0; i<n; i++) {
				if(a[i] == p) {
					t = a[i];
					a[i] = a[n - 1];
					a[n - 1] = t;
					i--;
					n--;
				}
			}
		}
		System.out.println("Number of random number:"+c);
	}
	
	public static int maxValue(int[] a) {
		int temp = a[0];
		for(int i = 1; i < a.length; i++) {
			if(temp < a[i])
				temp = a[i];
		}
		return temp;
	}
	
	public static String[] bubbleSortOfString(String str[]) {
		String temp = null;
		boolean swapped;
		for(int i=0; i<str.length; i++) {
			swapped = false;
			for(int j = 0; j < str.length - i - 1; j++) {
				if(str[j].compareTo(str[j+1]) > 0) {
					temp = str[j];
					str[j] = str[j+1];
					str[j+1] = temp;
					swapped = true;
				}
			}
			if(swapped == false)
				return str;
		}
		return str;
	}

	public static int binarySearchForInt(int[] arr, int searchedElement) {
		int first = 0, last = arr.length - 1;
		while(first <= last) {
			int mid = (first + last) / 2;
			if(searchedElement == arr[mid])
				return mid;
			else if(searchedElement > arr[mid])
				first = mid + 1;
			else
				last = mid - 1;
		}
		return -1;
	}

	public static int binarySearchForString(String[] strarr, String searchedStr) {
		int first = 0, last = strarr.length - 1;
		while(first <= last) {
			int mid = (first + last) / 2;
			if(strarr[mid].equals(searchedStr))
				return mid;
			else if(searchedStr.compareTo(strarr[mid])>0)
				first = mid + 1;
			else
				last = mid - 1;
		}
		return -1;
	}

	public static int[] insertionSortForInt(int arr[]) {
		int key = arr[0];
		int j;
		for(int i=1; i<arr.length; i++) {
			key = arr[i];
			j = i - 1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		return arr;
	}

	public static String[] insertionSortForString(String str[]) {
		String key;
		int j;
		for(int i = 1; i < str.length; i++) {
			key = str[i];
			j = i - 1;
			while(j >= 0 && str[j].compareTo(key) > 0) {
				str[j+1] = str[j];
				j--;
			}
			str[j+1] = key;
		}
		return str;
	}

	/**
	 * Starts the stopwatch.
	 * @param start start is the system time, in milliseconds.
	 * @param active by using active, we know stopwatch is start or stop. 
	 */
	public static void startTime(long start, boolean active) {
		start = System.currentTimeMillis();
		active = true;
		System.out.println("Starting time:"+start);
	}
	
	public static void stopwatch()
	{
		long start = 0, stop = 0;
		boolean flag = false;
		while(true) {
			System.out.println("1.Start");
			System.out.println("2.Stop");
			System.out.println("Enter your choice");
			int choice = getInt();
			if(choice == 1 && flag == false) {
				start = Instant.now().getEpochSecond();
				flag = true;
			}
			else if(choice == 2 && flag == true) {
				stop = Instant.now().getEpochSecond();
				System.out.println("Time:"+(stop - start));
				flag = false;
				break;
			}
			else {
				System.out.println("Please enter right choice");
				break;
			}
		}
	}
	
	/**
	 * Stops the stopwatch.
	 * @param start start is the system time, in milliseconds.
	 * @param duration in duration parameter we store difference between stop time and start time
	 * @param active active is ture then calculate the duration
	 */
	public static long stopTime(long start, long duration, boolean active) {
		long stop = System.currentTimeMillis();
		if(active) duration = (stop - start);
		else System.out.println("First Start time");
		active = false;
		System.out.println("Stoping time:"+stop);
		return duration;
	}
	
	/*public static void stopwatch() {
		//duration is the time, in milliseconds, that has passed on the stopwatch between startTime() and stopTime() calls.
		long duration = 0;
						
		//start is the system time in milliseconds, when startTime() was called.
		long start = 0;
						
		//When active is true, the stopwatch is still going, and the duration does not update until it's stopped.
		boolean active = false;
		startTime(start, active);
		duration = stopTime(start, duration, active);
		System.out.println("Difference:"+duration);
	}*/
	
	/*public static void stopwatch() {
		//duration is the time, in milliseconds, that has passed on the stopwatch between startTime() and stopTime() calls.
		long duration = 0;
				
		//start is the system time in milliseconds, when startTime() was called.
		long start = 0;
				
		//When active is true, the stopwatch is still going, and the duration does not update until it's stopped.
		boolean active = false;
		System.out.println("1.Start time");
		System.out.println("2.Stop time");
		System.out.println("Enter your choice:");
		int choice = getInt();
		switch(choice) {
			case '1':
				//Start the stopwatch.
				//startTime(start, active);
				System.out.println("start");
				break;
			case '2':
				//Stop the stopwatch.
				duration = stopTime(start, duration, active);
				System.out.println(duration);
				break;
			default:
				System.out.println("Please enter right choice");
		}
	}*/
	public static void twoDimArray(char arr[][]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print("| "+arr[i][j]+" |");
			}
			System.out.println();
		}
	}
}






















