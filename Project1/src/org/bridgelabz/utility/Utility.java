package org.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import org.bridgelabz.datastructure.Deque;
import org.bridgelabz.datastructure.Queue;
import org.bridgelabz.datastructure.QueueUsingLinkedList;
import org.bridgelabz.datastructure.SingleLinkedList;
import org.bridgelabz.datastructure.Stack;
import org.bridgelabz.datastructure.StackUsingLinkedList;

/******************************************************************************************
 *  purpose: Declare Utility Class implements methods which are called by any other class. 
 * 
 *  @author  MohitKumar
 *  @version 1.0
 *  @since   19-12-2018
 ******************************************************************************************/

public class Utility {
	
	//Create the static reference variable of Scanner class
	static Scanner scanner = new Scanner(System.in);	
	
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
	 * purpose: This method is used to get power in integer type.
	 * 
	 * @param   integer base
	 * @param   integer exponent
	 * @return  integer
	 */
	
	public static int power(int base, int exponent) {
		int product = 1;
		while(exponent > 0) {
			product = product * base;
			exponent--;
		}
		return product;
	}
	
	/**
	 * purpose: By using this method we can calculate the power in double type.
	 * 
	 * @param   double base
	 * @param   double exponent
	 * return   double
	 */
	
	public static double power(double base, double exponent) {
		double product = 1;
		while(exponent > 0) {
			product = product * base;
			exponent--;
		}
		return product;
	}
	
	/**
	 * purpose: This method is used to replace <<username>> with the proper name of the user.
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
	
	/**
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
	
	public static boolean isLeapYear(int year) {
		    if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0 ) {
		    	return true;
			}
			else {
				return false;
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
		if(number == 1)
			return false;
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
	
	/**
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
	 * @return double windchill
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
				int column = Utility.getInt();
				if(row == 0 && column == 0 || row == 0 && column == 1 || row == 0 && column == 2 || row == 1 && column == 0 || row == 1 && column == 1 || row == 1 && column == 2 || row == 2 && column == 0 || row == 2 && column == 1 || row == 2 && column == 2) {
					if(board[row][column] == '_') {
						board[row][column] = 'O';
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
				int column = r.nextInt(3);
				if(board[row][column] == '_') {
					board[row][column] = 'X';
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
    
	/**
	 * Purpose: This method is used to find out the lowest number of note for amount.
	 * 
	 * @param amount 
	 * @param sum initial value of sum.
	 * @return int lowest number of note
	 */
	
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
	
	public static int dayOfWeek(int m, int d, int y) {
		
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31 * m0 / 12 ) % 7; 
		return d0;
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
	 * 
	 * @param    P principal loan amount
	 * @param    Y years to pay off
	 * @param    R percent interest
	 * @return   double Monthly Payment
	 */
	
	public static double monthlyPayment(double P, double Y, double R) {
		double n = 12 * Y;
		double r = R / (12 * 100);
		double payment = (P * r) / (1 - ( 1 / (Utility.power((1 + r), n))));
		return payment;
	}
	
	/**
	 * Purpose: This method is used to calculate square root of the number. 
	 * 
	 * @param   number
	 * @return  double
	 */

	public static double squareRoot(double number) {
		double t = number;
		final double EPSILON = 1e-15;
		while(Math.abs(t - number / t) > EPSILON * t)
			t = (number / t + t) / 2;
		return t;
	}
	
	/**
	 * Purpose: This method is used to convert Decimal to Binary number.
	 * 
	 * @param   number Decimal Number 
	 * @return  String Binary Number
	 */

	public static String toBinary(int number) {
		String str = "";
		while(number != 0) {
			int rem = number % 2;
			str = rem + str;
			number = number / 2;
		}
		int rem1 = str.length() % 4;
		for(int i = 0; i < 4 - rem1; i++)
			str = 0 + str;
		return str;
	}
	
	/**
	 * Purpose: This method is used to Swap nibbles and find the new number.
	 * 
	 * @param   str String in binary number
	 * @return  integer decimal value
	 */

	public static int swapNibble(String str) {
		char temp;
		char binary[] = str.toCharArray();
		int length = binary.length / 2;
		for(int i=0; i<length; i++) {
			temp = binary[i];
			binary[i] = binary[length + i];
			binary[length + i] = temp;
		}
		System.out.println();
		int decimal = toDecimal(binary);
		return decimal;
	}
	
	/**
	 * Purpose: This method is used to convert binary to Decimal.
	 * 
	 * @param   binary Binary Number
	 * @return  integer Decimal number
	 */
	
	public static int toDecimal(char[] binary) {
		int sum = 0;
		int size = binary.length;
		for(int i=0; i<size; i++) {
			sum = sum + (binary[size - 1 - i] -48) * power(2, i);
		}
		return sum;
	}
	
	/**
	 * Purpose: This method is used for find the guess number.
	 * 
	 * @param f starting number of the range
	 * @param l last number of the range
	 * @return integer guess number
	 */

	public static int toFindYourNumber(int f, int l) {
		int mid = (f + l)/2;
		System.out.println("If guess number is "+mid+" than enter true otherwise false");
		if(Utility.getBoolean())
			return mid;
		else {
			System.out.println("If guess number is greater than "+mid+" than press 0 and if guess number is less than "+mid+" than press 1");
			System.out.println("Enter your choice");
			int c = Utility.getInt();
			if(c == 0)
				return toFindYourNumber(mid+1,l);
			else if(c == 1)
				return toFindYourNumber(f,mid-1);
			else
				return -1;
		}
	}
	
	/**
	 * Purpose: This method is used for sort an array.
	 * 
	 * @param 	arr user input array
	 * @param   left it is left index of the array
	 * @param   right it is right index of the array
	 */
	
	public static void mergeSort(int[] arr, int left, int right) {
		if(left < right) {
			int mid = left + (right - left) / 2;
			
			//Sort first and second halves
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			
			//merge first halves and second halves
			merge(arr, left, mid, right);
		}
	}
	
	/**
	 * Purpose: Merge two subarrays of arr[].
	 * 
	 * @param arr array
	 * @param left left index
	 * @param mid mid index
	 * @param right right index
	 */

	private static void merge(int[] arr, int left, int mid, int right) {
		int i, j, k;
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		//Create temporary arrays
		int Left[] = new int[n1];
		int Right[] = new int[n2];
		
		//Copy data to temporary arrays Left[] and Right[]
		for(i=0; i<n1; i++)
			Left[i] = arr[left + i];
		for(j=0; j<n2; j++)
			Right[j] = arr[mid + 1 + j];
		
		//Merge the temporary arrays into arr[]
		i = 0;
		j = 0;
		k = left;
		while(i<n1 && j<n2) {
			if(Left[i] <= Right[j]) {
				arr[k] = Left[i];
				i++;
				k++;
			}
			else {
				arr[k] = Right[j];
				j++;
				k++;
			}
		}
		
		//Copy the remaining elements of Left[], if there are any
		while(i < n1) {
			arr[k] = Left[i];
			i++;
			k++;
		}
		
		//Copy the remaining elements of Right[], if there are any
		while(j < n2) {
			arr[k] = Right[j];
			j++;
			k++;
		}
	}
	 /**
	  * Purpose: This method helps to read from file.
	  * 
	  * @param   path where file present in the system.
	  * @return  String array the data ot file convert into String array.
	  * @throws  IOException
	  */
	
	public static String[] readFromFile(String path) throws IOException {
		File f = new File(path);
		FileReader fr = new FileReader(f);  //Path:"/home/admin1/Documents/bcd.txt"
		BufferedReader br = new BufferedReader(fr);
		String[] str = new String[(int)f.length()];
		int i=0;
		String line = br.readLine();
		while(line != null) {
			str[i] = line;
			line = br.readLine();
			i++;
		}
		br.close();
		return str;
	}
	
	/**
	 * Purpose: This method helps to write in file.
	 * 
	 * @param  ll Linkedlist
	 * @param  path where the file present in the system.
	 * @throws FileNotFoundException
	 */

	public static void writeInfile(SingleLinkedList<String> ll, String path) throws FileNotFoundException {
		Object obj[] = ll.toArray();
		PrintWriter pw = new PrintWriter(path);  //Path:"/home/admin1/Documents/mbcd.txt"
		for(int i=0;i<obj.length;i++)
			pw.println(obj[i]);
		pw.close();
	}
	
	/**
	 * Purpose: To check the parentheses of the expression is balanced or not.
	 * 
	 * @param   expression
	 * @return  boolean 
	 */
	
	public static boolean isBalancedParentheses(String expression) {
		int size = expression.length();
		boolean flag = false;
		Stack<Character> stack = new Stack<Character>(size);
		char expressionArray[] = expression.toCharArray();
		for(int i=0; i<expressionArray.length;i++) {
			if(expressionArray[i] == '(' || expressionArray[i] == '{' || expressionArray[i] == '[') {
				stack.push(expressionArray[i]);
				flag = true;
			}
			else if(expressionArray[i] == ')' || expressionArray[i] == '}' || expressionArray[i] == ']'){
				if(flag) {
					switch(expressionArray[i]) {
					case ')':
						System.out.println(stack.pop(expressionArray[i]));
						if( stack.pop(expressionArray[i]) != '(')
							return false;
						break;
					case '}':
						if(flag && stack.pop(expressionArray[i]) != '{')
							return false;
						break;
					case ']':
						if(flag && stack.pop(expressionArray[i]) != '[')
							return false;
						break;
					default:
						System.out.println("Wrong Expression");
					}
				}
				stack.push(expressionArray[i]);
			}
		}
		return stack.isEmpty();
	}
	
	/**
	 * Purpose: To calculate the factorial of the number.
	 * 
	 * @param   number User input
	 * @return  long factorial value of the number
	 */
	
	public static long factorial(int number) {
		int product = 1;
		while(number > 0) {
			product = product * number;
			number--;
		}
		return product;
	}
	
	/**
	 * Purpose: To calculate the number of binary search tree.
	 * 
	 * @param   node
	 * @return  long array
	 */
	
	public static long[] numberOfBinarySeachTree(int[] node) {
		long numberOfBinarySearchTree[] = new long[node.length];
		for(int i=0; i<node.length; i++) {
			numberOfBinarySearchTree[i] = Utility.factorial(2*node[i]) / (Utility.factorial(node[i]+1) * Utility.factorial(node[i]));
		}
		return numberOfBinarySearchTree;
	}
	
	/**
	 * Purpose: To display the anagram prime number by using 2D array.
	 * 
	 * @param number range of the anagram prime number.
	 * @return String two dimensional array of anagram prime number.
	 */

	public static String[][] anagramPrimeNumberIn2DArrays(int number) {
		String string1 = "";
		String string2 = "";
		int count = 0;
		ArrayList<Integer> prime = prime(number);
		int row = prime.size();
		String anagram[][] = new String[row][2];
		System.out.println("\nPrime numbers that are Anagram\n");
		for(int i=0; i<prime.size(); i++) {
			for(int j=i+1; j<prime.size(); j++) {
				string1 = Integer.toString(prime.get(i));
				string2 = Integer.toString(prime.get(j));
				if(Utility.isAnagram(string1, string2))
				{
						anagram[count][0] = string1;
						anagram[count][1] = string2;
						count++;
				}
			}
		}
		return anagram;
	}
	
	/**
	 * Purpose: To display the anagram prime number by using Queue LinkedList.
	 * 
	 * @param number range of the anagram prime number.
	 * @return Queue Linked List of anagram prime number.
	 */

	public static QueueUsingLinkedList<String> anagramPrimeNumbersUsingQueueLinkedList(int number) {
		QueueUsingLinkedList<String> queueLinkedList = new QueueUsingLinkedList<String>();
		String string1 = "";
		String string2 = "";
		
		ArrayList<Integer> prime = prime(number);
		System.out.println("\nPrime numbers that are Anagram\n");
		for(int i=0; i<prime.size(); i++) {
			for(int j=i+1; j<prime.size(); j++) {
				string1 = Integer.toString(prime.get(i));
				string2 = Integer.toString(prime.get(j));
				if(Utility.isAnagram(string1, string2))
				{
						queueLinkedList.enqueue(string1+" "+string2);
				}
			
			}
		}
		return queueLinkedList;
	}
	
	/**
	 * Purpose: To display the anagram prime number by using Stack LinkedList.
	 * 
	 * @param number range of the anagram prime number.
	 * @return Stack Linked List of anagram prime number.
	 */

	public static StackUsingLinkedList<String> anagramPrimeNumbersUsingStackLinkedList(int number) {
		StackUsingLinkedList<String> stackLinkedList = new StackUsingLinkedList<String>();
		String string1 = "";
		String string2 = "";
		
		ArrayList<Integer> prime = prime(number);
		System.out.println("\nPrime numbers that are Anagram\n");
		for(int i=0; i<prime.size(); i++) {
			for(int j=i+1; j<prime.size(); j++) {
				string1 = Integer.toString(prime.get(i));
				string2 = Integer.toString(prime.get(j));
				if(Utility.isAnagram(string1, string2))
				{
						stackLinkedList.push(string1+" "+string2);
				}
			
			}
		}
		return stackLinkedList;
	}
	
	/**
	 * Purpose: To check the word is palindrome or not.
	 *  
	 * @param word User input
	 * @return true or false
	 */

	public static boolean palindromeChecker(String word) {
		int size = word.length();
		boolean isPalindrome = true;
		Deque<Character> d = new Deque<Character>(size);
		char ch[] = word.toCharArray();
		for(int i=0; i<ch.length; i++)
			d.addRear(ch[i]);
		for(int i=0; i<ch.length/2; i++) {
			if(d.removeFront() != d.removeRear() ) {
				isPalindrome = false;
				break;
			}	
		}
		return isPalindrome;
	}
	
	/**
	 * Purpose: To store the prime number in two dimensional array.
	 * 
	 * @param   range User input
	 * @return  Prime number present in two dimensional String array.
	 */
	
	public static String[][] primeNumbersInA2DArray(int range){
		String[][] prime = new String[range/100][100];
		
		System.out.println("prime numbers in a 2D Array");
		System.out.println("---------------------------");
		System.out.println();
		for(int i=0; i<prime.length; i++) {
				prime[i][0] = Integer.toString(i*100)+"-"+Integer.toString(i * 100 + 100)+" ";
			
		}
		int i=0, j=0, number = 2;
		while(number < range) {
			if(isPrime(number)) {
			
			if(number < (i + 1) * 100)
				j++;
			else {
				i++;
				j = 1;
			}
			prime[i][j] = Integer.toString(number);
			}
			number++;
		}
		return prime;
	}

	/**
	 * Purpose:  To check the balance after all deposit or Withdraw.
	 * 
	 * @param    number number of people want to deposite or withdraw money.
	 * @param    queue it helps to arrange the people
	 * @param    balance initial balance before deposite or withdraw.
	 * @return   balance in double.
	 */
	public static double simulateBankingCashCounter(int number, Queue<String> queue, double balance) {
		double amount = 0.0;
		int choice = 0;
		for(int i=0; i<number; i++) {
			System.out.println("\nName:"+queue.dequeue());
			System.out.println("1.Deposite Cash");
			System.out.println("2.Withdraw Cash");
			do {
				System.out.print("\nEnter Your Choice:");
				choice = Utility.getInt();
				if(choice != 1 && choice != 2)	
					System.out.println("Please enter right choice");
			}while(choice != 1 && choice != 2);
			do {
			System.out.println("\nEnter your amount");
			amount = Utility.getDouble();
			if(amount > balance && choice == 2) {
				System.out.println("\nBalance is "+balance);
				System.out.println("Please enter amount less than or equal to "+balance);
			}
			}while(choice == 2 && amount > balance);
				switch(choice) {
				case 1:
						balance = balance + amount;
						break;
				case 2:
					if(amount < balance)
						balance = balance - amount;
					break;
				}
		}
		return balance;
	}
	
	/**
	 * Purpose: Read a List of Numbers from a file and arrange it ascending Order in aLinked List. 
     *          Take user input for a number, if found then pop the number out of the list 
     *          else insert the number in appropriate position.
     *          
	 * @param   path Where file is present
	 * @return  Single LinkedList in sorted form
	 * @throws IOException
	 */

	public static SingleLinkedList<String> orderedList(String path) throws IOException {
		SingleLinkedList<String> orderedList = new SingleLinkedList<String>();
		String string[] = Utility.readFromFile(path);
		for(int i=0;i<string.length;i++) {
			if(string[i] != null)
				orderedList.add(string[i]);
		}
		orderedList.sort();
		System.out.println("\nData in List in ascending order");
		orderedList.display();
		System.out.println("\nEnter number");
		String number = Utility.next();
		int position = orderedList.search(number);
		if(position == 0) {
			System.out.println("\n\nData is not found");
			orderedList.add(number);
			orderedList.sort();
			System.out.println("\n\nYour data is add in the list");
			orderedList.display();
		}
		else {
			System.out.println("Data is found");
			orderedList.remove(position);
			System.out.println("\nYour data is remove in the list");
			orderedList.display();
		}
		return orderedList;
	}
	
	/**
	 * Purpose: Read the Text from a file, split it into words and arrange it as Linked List.
     *          Take a user input to search a Word in the List. If the Word is not found then add it
     *          to the list, and if it found then remove the word from the List. In the end save the
     *          list into a file.
	 * 
	 * @param   path Where the file is present.
	 * @return  unordered LinkedList
	 * @throws  IOException
	 */

	public static SingleLinkedList<String> unOrderedList(String path) throws IOException {
		SingleLinkedList<String> unorderedList = new SingleLinkedList<String>();
		String str[] = Utility.readFromFile(path);
		System.out.println("\nLinkedList elements");
		for(int i=0; i<str.length; i++) {
			if(str[i] != null)
				unorderedList.add(str[i]);
		}
		unorderedList.display();
		System.out.println("\nEnter searched element");
		String searchData = Utility.next();
		int a = unorderedList.search(searchData);
		//System.out.println("a:"+a);
		if(a == 0) {
			System.out.println("\nData is not found");
			unorderedList.add(searchData);
			System.out.println("Your data is add in this list");
		}
		else {
			System.out.println("\nData is found");
			unorderedList.remove(a);
			System.out.println("\nYour data is remove in this list");
		}
		unorderedList.display();
		return unorderedList;
	}
}






















