package org.bridgelabz.functional;

import java.util.Random;

import org.bridgelabz.utility.Utility;

public class TicTacToe {
	public static void main(String[] args) {
		Random r = new Random();
		int c = 0;
		boolean flag = false;
		char arr[][] = new char[3][3];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j] = '_';
				System.out.print("| "+arr[i][j]+" ");
				if(j == 2)
					System.out.println("|");
			}
			System.out.println();
		}
		while(c != 9) {
			
			if(flag == false) {
				System.out.println();
				System.out.println("User Chance");
				System.out.print("Enter row number:");
				int row = Utility.getInt();
				System.out.print("Enter column number:");
				int col = Utility.getInt();
				if(row == 0 && col == 0 || row == 0 && col == 1 || row == 0 && col == 2 || row == 1 && col == 0 || row == 1 && col == 1 || row == 1 && col == 2 || row == 2 && col == 0 || row == 2 && col == 1 || row == 2 && col == 2) {
					if(arr[row][col] == '_') {
						arr[row][col] = 'O';
						c++;
						flag = true;
						Utility.twoDimArray(arr);
					}
					else
						System.out.println("wrong input");
				}
					/*for(int i=0; i<arr.length; i++) {
						for(int j=0; j<arr.length; j++) {
							if(arr[i][j] == '_') {
								arr[i][j] = 'O';
								c++;
								flag = true;
							}
							
						}
					}*/
				else
					System.out.println("Please enter right rows and columns");
			}
			
			if(arr[0][0] == 'O' && arr[0][1] == 'O' && arr[0][2] == 'O' ||
					   arr[1][0] == 'O' && arr[1][1] == 'O' && arr[1][2] == 'O'	||
					   arr[2][0] == 'O' && arr[2][1] == 'O' && arr[2][2] == 'O' ||
					   arr[0][0] == 'O' && arr[1][1] == 'O' && arr[2][2] == 'O' ||
					   arr[0][2] == 'O' && arr[1][1] == 'O' && arr[2][0] == 'O' ||
					   arr[0][0] == 'O' && arr[1][0] == 'O' && arr[2][0] == 'O' ||
					   arr[0][1] == 'O' && arr[1][1] == 'O' && arr[2][1] == 'O' ||
					   arr[0][2] == 'O' && arr[1][2] == 'O' && arr[2][2] == 'O') {
						System.out.println("User Wins");
						break;
					}
			
			if(flag && c<9) {
				System.out.println();
				System.out.println("Computer Chance");
				int row = r.nextInt(3);
				int col = r.nextInt(3);
				if(arr[row][col] == '_') {
					arr[row][col] = 'X';
					c++;
					flag = false;
					Utility.twoDimArray(arr);
				}
			}
				/*for(int i=0; i<arr.length; i++) {
					for(int j=0; j<arr.length; j++) {
						if(arr[i][j] == '_') {
							arr[i][j] = 'X';
							c++;
							flag = false;
						}
					}
				}*/
			if(arr[0][0] == 'X' && arr[0][1] == 'X' && arr[0][2] == 'X' ||
			   arr[1][0] == 'X' && arr[1][1] == 'X' && arr[1][2] == 'X'	||
			   arr[2][0] == 'X' && arr[2][1] == 'X' && arr[2][2] == 'X' ||
			   arr[0][0] == 'X' && arr[1][1] == 'X' && arr[2][2] == 'X' ||
			   arr[0][2] == 'X' && arr[1][1] == 'X' && arr[2][0] == 'X' ||
			   arr[0][0] == 'X' && arr[1][0] == 'X' && arr[2][0] == 'X' ||
			   arr[0][1] == 'X' && arr[1][1] == 'X' && arr[2][1] == 'X' ||
			   arr[0][2] == 'X' && arr[1][2] == 'X' && arr[2][2] == 'X') {
				System.out.println("Computer Wins");
				break;
			}
			
		}
		System.out.println("Game Draw");
	}
}
