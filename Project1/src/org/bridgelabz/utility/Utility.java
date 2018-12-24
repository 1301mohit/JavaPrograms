package org.bridgelabz.utility;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/******************************************************************************************
 *  purpose: Declare Utility Class implements methods which are called by any other class. 
 * 
 *  @author  MohitKumar
 *  @version 1.0
 *  @since   19-12-2018
 ******************************************************************************************/

public class Utility {
	static Scanner scanner = new Scanner(System.in);	//Create the static reference variable of Scanner class
	
	/**
	 *  purpose: This method is used to get integer value from user.
	 *  
	 *  @return  integer
	 */
	
	public static int getInt(){
		int inputInteger = scanner.nextInt();
		return inputInteger;
	}
	
	/**
	 * purpose: This method is used to get double value from user.
	 * 
	 * @return  double
	 */
	
	public static double getDouble(){
		double inputDouble = scanner.nextDouble();
		return inputDouble;
	}
	
	/**
	 * purpose: This method is used to get one word string from user.
	 * 
	 * @return  String
	 */
	
	public static String next(){
		String inputOneWordString = scanner.next();
		return inputOneWordString;
	}
	
	/**
	 * purpose: This method is used to get sentence or word string from user.
	 * 
	 * @return  String
	 */
	
	public static String nextLine(){
		String inputString = scanner.nextLine();
		return inputString;
	}
	
	/**
	 * purpose: This method is used to get float value from user.
	 * 
	 * @return  float
	 */
	
	public static float getFloat(){
		float inputFloat = scanner.nextFloat();
		return inputFloat;
	}
	
	/**
	 * purpose: This method is used to get byte value from user
	 * 
	 * @return  byte
	 */
	
	public static Byte getByte(){
		byte inputByte = scanner.nextByte();
		return inputByte;
	}
	
	/**
	 * purpose: This method is used to get boolean value from user.
	 * 
	 * @return  boolean
	 */
	
	public static boolean getBoolean(){
		boolean inputBoolean = scanner.nextBoolean();
		return inputBoolean;
	}
	
	/**
	 * purpose: This method is used to get power of integer value.
	 * 
	 * @param   integer base
	 * @param   integer exponent
	 * @return  integer
	 */
	
	public static int power(int base, int exponent) {
		int product = 1;
		while(exponent != 0) {
			product = product * base;
			exponent--;
		}
		return product;
	}
	
	/**
	 * purpose: By using this method we can calculate the power of double.
	 * 
	 * @param   double base
	 * @param   double exponent
	 * return   double
	 */
	
	public static double power(double base, double exponent) {
		double product = 1;
		while(exponent != 0) {
			product = product * base;
			exponent--;
		}
		return product;
	}
	
	/**
	 * purpose: This method is used to replace <<username>> with the proper name of the user
	 * 
	 * @return  String Whole String with the name of the user
	 */
	
	public static String replaceString(String givenString, String username){
		
		//Store the String hello in string1
		String string1 = givenString.substring(0, 6);
		
		//Store username in string2
		String string2 = username;
		
		//Store ,How are you? in string3
		String string3 = givenString.substring(18, 32);
		
		//Concatenate the strings
		return (string1 + string2 + string3);
	}
	
	/*
	 * purpose: This method is used for get Percentage of Head vs Tails
	 * 
	 * @parameter Double number
	 */
	
	public static double[] flipCoin(double number) {
		double percentage[] = new double[2];
		int tail = 0,head = 0;
		Random random = new Random();
		
		for(int i=0; i<number; i++) {
			double d =  random.nextDouble();
			if(d < 0.5)
				
				//count number of tail
				tail++;
			
			else 
				
				//count number of head
				head++;
		}
		percentage[0] = (tail/number)*100;
		percentage[1] = (head/number)*100;
		return percentage;
	}
	
	/**
	 * Purpose: This method is used to identify user input year is leap year or not.
	 * 
	 * @param   year
	 * @return  String
	 */
	public static String isLeapYear(int year) {
		    if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0 ) {
				return (year+" is leap year");
			}
			else {
				return (year+" is not leat year");
			}
	}
	
	/**
	 *Purpose: This method is used to print table of the power of 2 according to user input.
	 * 
	 * exponent This is the parameter of the method i.e the exponent of the power
	 * @param Integer exponent
	 * @return  Integer array 
	 */
	
	public static int[] table(int exponent){
		int arr[] = new int[exponent+1];
		System.out.println("Table of power of 2");
		for(int i=0; i<=exponent; i++) {
		arr[i] = Utility.power(2, i);	
		}
			return arr;
	}
	
	/**
	 * Purpose: This method is used to calculate the harmonic number 
	 * 
	 * @param   number this is the parameter which is taken by the user
	 * @return  double
	 */
	
	public static double harmonicNumber(int number) {
		
		double sum = 0;
		
		/*
		 * The sum of the harmonic series
		 */
		for(int i=1; i<=number; i++) {
			sum = sum + 1.0/i;
		}
		return sum;
	}
	
	/**
	 * Purpose: This method is used to calculate the prime factor of the number and the square of the prime factor is less than n
	 * 
	 * @param number This is the parameter taken by the user
	 * @return String
	 */
	
	public static String primeFactor(int number) {
		boolean flag;
		String st = "";
		
		//By using this loop we calculate all factors of n
		for(int i=2; i*i<=number; i++) {	
			flag = false;
			//if factor is prime than true else false
			if(number % i == 0) 
				flag = isPrime(i);
			//if flag is true than concatenate all prime factor in a single string
			if(flag)
				st = st + i + " ";
		}
		return st;
	}
	
	/**
	 * Purpose: To check number is prime or not.
	 * 
	 * @param   number
	 * @return  true or false
	 */
	
	public static boolean isPrime(int number)
	{
		for(int j=2; j<=number/2; j++) {	
			if(number % j == 0)
				return false;
		}
		return true;
	}
	
	/**
	 * This method is used to print two dimensional array of integer value.
	 * 
	 * @param intArray This is the two dimensional array parameter of integer type taken by the user
	 */

	public static void integerTwoDimensionArray(int[][] intArray) {
		PrintWriter pw = new PrintWriter(System.out);
		System.out.println("Elements of Integer type");
		for(int j=0; j<intArray.length; j++) {
			for(int k=0; k<intArray[0].length; k++) {
				pw.print(intArray[j][k]+" ");
				pw.flush();
			}
			System.out.println();
		}
	}
	
    /**
	 * Purpose: This method is used to print two dimensional array of double value.
	 * 
	 * @param doubleArray This is the two dimensional array parameter of double type taken by the user
	 */
	
	public static void doubleTwoDimensionArray(double[][] doubleArray) {
		PrintWriter pw = new PrintWriter(System.out);
		System.out.println("Elements of double type");
		for(int j=0; j<doubleArray.length; j++) {
			for(int k=0; k<doubleArray[0].length; k++) {
				pw.print(doubleArray[j][k]+" ");
				pw.flush();
			}
			System.out.println();
		}
	}
	
	/**
	 * This method is used to print two dimensional array of boolean value
	 * 
	 * @param i This is the two dimensional array parameter of boolean type taken by the user
	 */

	public static void booleanTwoDimensionArray(boolean[][] booleanArr) {
		PrintWriter pw = new PrintWriter(System.out);
		System.out.println("Elements of Boolean type");
		for(int j=0; j<booleanArr.length; j++) {
			for(int k=0; k<booleanArr.length; k++) {
				pw.print(booleanArr[j][k]+" ");
				pw.flush();
			}
			System.out.println();
		}	
	}
	
	/**
	 * Purpose: Calculate distance from origin
	 * 
	 * @param  x integer distance from y-axis. 
	 * @param  y integer distance from x-axis.
	 * @return Double
	 */
	
	public static double calculateDistance(int x, int y) {
		return Math.sqrt(x*x + y*y);
	}
	
	/**
	 * This method is used to calculate the roots of the quadratic equation
	 * 
	 * @param a double This is the coefficient of x^2
	 * @param b double This is the coefficient of x
	 * @param c double This is the constant
	 */
	
	public static void root(double a, double b, double c) {
		
		//Calculate delta
		double delta = b*b - 4*a*c;
		
		//Initialize root1
		double root1 = 0;
		
		//Initialize root2
		double root2 = 0;
		
		System.out.println("Roots of the Quadratic equation");
		
		// if delta is positive then there are two real solutions.
		if(delta > 0) {
			root1 = (-b + Math.sqrt(delta))/(2*a);
			root2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println("root1:"+root1);
			System.out.println("root2:"+root2);
		}
		
		//if delta is zero then there is one real solution.
		else if(delta == 0) {
			root1 = root2 =-b/(2*a);
			System.out.println("root:"+root1);
		}
		
		// if delta is negative then there are two complex solutions.
		else {
			double p1 = (-b/(2*a));
			double p2 = (Math.sqrt(-delta)/(2*a));
			System.out.println("root1:"+p1+" + i"+p2);
			System.out.println("root2:"+p1+" - i"+p2);
		}
	}
	
	/**
	 * Purpose: This method is used to play the gambler game till the gambler is broke or has won.
	 * 
	 * @return  double array
	 */
	
	public static double[] gambler() {
		double win = 0, loss = 0;
		Random r = new Random();
		double arr[] = new double[3];
		
		System.out.println("Enter stake");
		int stake = Utility.getInt();
		
		System.out.println("Enter goal");
		int goal = Utility.getInt();
		
		//input number of times user want to play
		System.out.println("Enter number of times");
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
		
		//Number of times wins stores in arr[0]
		arr[0] = win;
		
		//Percentage of wins to stores in arr[1]
		arr[1] = win/(win + loss)*100;
		
		//Percentage of loss to stores in arr[2]
		arr[2] = loss/(win + loss)*100;
		
		return arr;
	}
	
	/*
	 * Purpose: This method is used to check two string is anagram or not
	 * 
	 * @param   string1 String
	 * @param   string2 String
	 */

	public static boolean isAnagram(String string1, String string2) {
		
		//compare the length of two strings is equal or not
		if(string1.length()!=string2.length())
			return false;
		
		//call count method and pass first string
		int count1[] = count(string1);
		
		//call count method and pass second string
		int count2[] = count(string2);
		
		//check the value of the two strings are equal or not
		for(int i=0; i<count1.length; i++) {
			if(count1[i] != count2[i])
				return false;
		}
		return true;
	}
	
	/**
	 * Purpose: This method is used to count the alphabets present in the string and increment the index of the count array.
	 * @param string 
	 * @return integer one dimensional array
	 */
	public static int[] count(String string) {
		
		//Convert String to character array
		char c[] = string.toCharArray();
		
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
	
	/**
	 * Purpose: This method is used to print the prime numbers between 1 and parameter number.
	 * 
	 * @param   number user number
	 * @return  ArrayList<Integer> Series of prime number
	 */
	
	public static ArrayList<Integer> prime(int number) {
		ArrayList<Integer> prime = new ArrayList<Integer>();
		
		//This for loop is starts from 2 and iterate n times
		for(int i=2; i<=number; i++) {
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
				prime.add(i);
		}
		return prime;
	}
	
	/**
	 * Purpose: This method is used to check number is pallindrome or not
	 * @param number
	 * @return true or false
	 */
	
	public static boolean isPallindrom(int number) {
		int t = number, r, s = 0;
		while(number != 0) {
			r = number % 10;
			s = s * 10 + r;
			number = number / 10;
		}
		if(t == s)
			return true;
		else
			return false;
	}
	
	/**
	 * Purpose: This method is used to sort an integer array
	 * @param   sort integer
	 * @return  integer array
	 */
	
	public static int[] bubbleSort(int[] sort) {
		int temp;
		boolean swapped;
		int size = sort.length;
		for(int i = 0; i < size; i++) {
			swapped = false;
			for(int j=0; j<size-i-1; j++) {
				if(sort[j] > sort[j + 1]) {
					temp = sort[j];
					sort[j] = sort[j + 1];
					sort[j + 1] = temp;
					swapped = true;
				}
			}
			if(swapped == false)
				return sort;
		}
		return sort;
	}
	
	/**
	 * Purpose: This method is used to take input from user
	 * 
	 * @return  integer array
	 */
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
	
	/**
	 * Purpose: This method is used to print elements of array
	 * 
	 * @param print
	 */
	public static void printArray(int print[]) {
		for(int i=0; i<print.length; i++) {
			System.out.print(print[i]+" ");
		}
		System.out.println();
	}
	
	/**
	 * Purpose: This method is used to generate random number and to process distinct coupons.
	 * 
	 * @param   numberOfCouponNumber
	 * @param   number
	 * @return  integer value
	 */
	
	public static int couponNumber(int numberOfCouponNumber, int[] number) {
		int count = 0, t;
		Random r = new Random();
		int maxValue = maxValue(number);
		int size = number.length;
		while(size != 0) {
			int p = r.nextInt(maxValue + 1);
			count++;
			for(int i=0; i<size; i++) {
				if(number[i] == p) {
					t = number[i];
					number[i] = number[size - 1];
					number[size - 1] = t;
					i--;
					size--;
				}
			}
		}
		return count;
	}
	
	/**
	 * This method to check the elements of the array is distinct or not 
	 * @param number
	 * @return true or false
	 */
	
	public static boolean isDistinct(int[] number) {
		for(int i = 0; i < number.length; i++) {
			for(int j = i + 1; j < number.length; j++) {
				if(number[i] == number[j])
					return false;
			}
		}
		return true;
	}
	
	/**
	 * This method is used for to find the maximum value of the array.
	 * 
	 * @param number
	 * @return integer temp stores the maximum value and return
	 */
	
	public static int maxValue(int[] number) {
		
		//We store first element of array in temp variable.
		int temp = number[0];
		
		//By using loop we store maximum value of array in temp.
		for(int i = 1; i < number.length; i++) {
			if(temp < number[i])
				temp = number[i];
		}
		
		//return maximum value
		return temp;
	}
	
	/**
	 * Purpose: Method to use sort the integer from the integer array.
	 * 
	 * @param   sort sort is an array where to store the all integer value.
	 * @return  String array string in sorted form  
	 */
	
	public static String[] bubbleSortOfString(String sort[]) {
		String temp = null;
		boolean swapped;
		for(int i=0; i<sort.length; i++) {
			swapped = false;
			for(int j = 0; j < sort.length - i - 1; j++) {
				if(sort[j].compareTo(sort[j+1]) > 0) {
					temp = sort[j];
					sort[j] = sort[j+1];
					sort[j+1] = temp;
					swapped = true;
				}
			}
			if(swapped == false)
				return sort;
		}
		return sort;
	}
	
	/**
	 * Purpose: Method to use search the integer from the integer array.
	 * 
	 * @param   search search is a array where to store the all integer value.
	 * @param   searchedInteger integer which is search in array.
	 * @return  integer index of searched element if present otherwise -1.
	 */

	public static int binarySearchForInt(int[] search, int searchedInteger) {
		int first = 0, last = search.length - 1;
		while(first <= last) {
			int mid = (first + last) / 2;
			if(searchedInteger == search[mid])
				return mid;
			else if(searchedInteger > search[mid])
				first = mid + 1;
			else
				last = mid - 1;
		}
		return -1;
	}
	
	/**
	 * Purpose: Method to use search the string from the string array.
	 * 
	 * @param   search
	 * @param   searchedString
	 * @return  integer index of searched element if present otherwise -1.
	 */

	public static int binarySearchForString(String[] search, String searchedString) {
		int first = 0, last = search.length - 1;
		while(first <= last) {
			int mid = (first + last) / 2;
			if(search[mid].equals(searchedString))
				return mid;
			else if(searchedString.compareTo(search[mid])>0)
				first = mid + 1;
			else
				last = mid - 1;
		}
		return -1;
	}
	
	/**
	 * Purpose: This method is used for the sort of the elements of the integer array by using insertion sort.
	 * 
	 * @param   sort array 
	 * @return  String array
	 */

	public static int[] insertionSortForInt(int sort[]) {
		int key = sort[0];
		int j;
		for(int i=1; i<sort.length; i++) {
			key = sort[i];
			j = i - 1;
			while(j>=0 && sort[j]>key) {
				sort[j+1] = sort[j];
				j--;
			}
			sort[j+1] = key;
		}
		return sort;
	}
	
	/**
	 * Purpose: This method is used for the sort of the elements of the string array by using insertion sort.
	 * 
	 * @param   string array
	 * @return  String array
	 */

	public static String[] insertionSortForString(String string[]) {
		String key;
		int j;
		for(int i = 1; i <   string.length; i++) {
			key =   string[i];
			j = i - 1;
			while(j >= 0 &&   string[j].compareTo(key) > 0) {
				  string[j+1] =   string[j];
				j--;
			}
			  string[j+1] = key;
		}
		return   string;
	}
	
	/**
	 * Purpose: This method is used to measure the elapsed time between start and end
	 */
	
	public static void stopwatch()
	{
		long start = 0, stop = 0;
		boolean flag = false;
		while(true) {
			System.out.println("1.Start");
			System.out.println("2.Stop");
			System.out.println("Enter your choice");
			int choice = getInt();
			if(choice == 1) {
				if(flag == false) {
					start = System.currentTimeMillis();
					flag = true;
				}
				else
					System.out.println("\nAlredy Started\n");
			}
			if(choice == 2) {
				if(flag == true) {
					stop = System.currentTimeMillis();
					System.out.println("\nElapsed Time:"+(stop - start)+" milliseconds");
					flag = false;
					break;
				}
				else 
					System.out.println("\nFirst Start\n");
			}
		}
	}
	
	/**
	 * Purpose: This method is used to print two dimensional array.
	 * 
	 * @param print
	 */
	
	public static void twoDimArray(char print[][]) {
		for(int i=0; i<print.length; i++) {
			for(int j=0; j<print.length; j++) {
				System.out.print("| "+print[i][j]+" |");
			}
			System.out.println();
		}
	}

	/**
	 * Purpose:  To calculate WindChill
	 * 
	 * @param t  type double and t is temperature(in Fahrenheit)
	 * @param v  type double and v is the wind speed(in miles per hour)
	 * @return double
	 */
	public static double calculateWindChill(double t, double v) {
		double w = 35.74 + 0.6215 + (0.4275 * t - 35.75) *(Math.pow(v,0.18));
		return w;
	}
	
	/**
	 * Purpose: This method help to play a Cross Game or Tic­Tac­Toe Game.
	 */

	public static void tictactoe() {
		Random r = new Random();
		int count = 0;
		boolean flag = false;
		char board[][] = new char[3][3];
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[0].length; j++) {
				board[i][j] = '_';
				System.out.print("| "+board[i][j]+" ");
				if(j == 2)
					System.out.println("|");
			}
			System.out.println();
		}
		while(count != 9) {
			if(flag == false) {
				System.out.println();
				System.out.println("User Chance");
				System.out.print("Enter row number:");
				int row = Utility.getInt();
				System.out.print("Enter column number:");
				int col = Utility.getInt();
				if(row == 0 && col == 0 || row == 0 && col == 1 || row == 0 && col == 2 || row == 1 && col == 0 || row == 1 && col == 1 || row == 1 && col == 2 || row == 2 && col == 0 || row == 2 && col == 1 || row == 2 && col == 2) {
					if(board[row][col] == '_') {
						board[row][col] = 'O';
						count++;
						flag = true;
						Utility.twoDimArray(board);
					}
					else
						System.out.println("wrong input");
				}
				else
					System.out.println("Please enter right rows and columns");
			}
			if(board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O' ||
			   board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O' ||
			   board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O' ||
			   board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O' ||
			   board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O' ||
			   board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O' ||
			   board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O' ||
			   board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') {
					System.out.println("User Wins");
					break;
			}
			if(flag && count < 9) {
				System.out.println();
				System.out.println("Computer Chance");
				int row = r.nextInt(3);
				int col = r.nextInt(3);
				if(board[row][col] == '_') {
					board[row][col] = 'X';
					count++;
					flag = false;
					Utility.twoDimArray(board);
				}
			}
			if(board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X' ||
			   board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X' ||
			   board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X' ||
			   board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X' ||
			   board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X' ||
			   board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X' ||
			   board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X' ||
			   board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {
				System.out.println("Computer Wins");
				break;
			}
			
		}
		if(count == 9)
			System.out.println("Game Draw");
	}

	public static void permute(String str, int l, int r) {
	       if (l == r) 
	            System.out.println(str); 
	       else
	       { 
	            for (int i = l; i <= r; i++) 
	            { 
	                str = swap(str,l,i); 
	                permute(str, l+1, r); 
	                str = swap(str,l,i); 
	            } 
	       } 
	    }

	private static String swap(String str, int i, int j) {

        char temp; 
        char[] charArray = str.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray);
	}

	public static int fewest(int amount, int sum) {
		int remainder;
		if(amount == 0)
			return sum;
		else if(amount >= 1000) {
			remainder = amount / 1000;
			sum = sum + remainder;
			amount = amount % 1000;
			System.out.println("\nNumber of Rs1000 note:"+remainder);
		}
		else if(amount >= 500) {
			remainder = amount / 500;
			sum = sum + remainder;
			amount = amount % 500;
			System.out.println("\nNumber of Rs500 note:"+remainder);
		}
		else if(amount >= 100) {
			remainder = amount / 100;
			sum = sum + remainder;
			amount = amount % 100;
			System.out.println("\nNumber of Rs100 note:"+remainder);
		}
		else if(amount >= 50) {
			remainder = amount / 50;
			sum = sum + remainder;
			amount = amount % 50;
			System.out.println("\nNumber of Rs50 note:"+remainder);
		}
		else if(amount >= 10) {
			remainder = amount / 10;
			sum = sum + remainder;
			amount = amount % 10;
			System.out.println("\nNumber of Rs10 note:"+remainder);
		}
		else if(amount >= 5) {
			remainder = amount / 5;
			sum = sum + remainder;
			amount = amount % 5;
			System.out.println("\nNumber of Rs5 note:"+remainder);
		}
		else if(amount >= 2) {
			remainder = amount / 2;
			sum = sum + remainder;
			amount = amount % 2;
			System.out.println("\nNumber of Rs2 note:"+remainder);
		}
		else if(amount >= 1) {
			remainder = amount / 1;
			sum = sum + remainder;
			amount = amount % 1;
			System.out.println("\nNumber of Rs1 note:"+remainder);
		}
		return fewest(amount, sum);
	}
	
	/**
	 * Purpose: To find the day of the week that date.
	 * 
	 * @param m integer m is month
	 * @param d integer d is day
	 * @param y integer y is year
	 * @return String day of the week.
	 */
	public static String dayOfWeek(int m, int d, int y) {
		String day[] = {"Sunday","Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday"};
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31 * m0 / 12 ) % 7; 
		return day[d0];
	}
	
	/**
	 * Purpose: Convert temperature value Fahrenheit to Celsius.
	 * 
	 * @param   Fahrenheit 
	 * @return  double Celsius
	 */
	
	public static double temperatureConvertionFToC(double Fahrenheit) {
		double celsius = (Fahrenheit - 32) * 5 / 9;
		return celsius;
	}
	
	/**
	 * Purpose: Convert temperature value Celsius to Fahrenheit.
	 * 
	 * @param   Celsius
	 * @return  double Fahrenheit
	 */
	
	public static double temperatureConvertionCToF(double Celsius) {
		double Fahrenheit = (Celsius * 9 / 5) + 32;
		return Fahrenheit;
	}

	/**
	 * Purpose:  To calculate monthly Payment.
	 * @param    P principal loan amount
	 * @param    Y years to pay off
	 * @param    R percent interest
	 * @return   double Monthly Payement
	 */
	
	public static double monthlyPayment(double P, double Y, double R) {
		double n = 12 * Y;
		double r = R / (12 * 100);
		double payment = (P * r) / (1 - ( 1 / (Utility.power((1 + r), n))));
		return payment;
	}
	
	
}






















