package org.bridgelabz.objectorientedprogram;

import java.util.Random;

/**
 * Purpose: The cards using Random method and then
 *			distribute 9 Cards to 4 Players and Print the Cards the received 
 *			by the 4 Players using 2D Array.
 *			
 * @author  Mohit Kumar
 * @version 1.0
 * @since   13/01/2019
 */

public class DeckOfCards {

	public static void main(String[] args) {
		String suit[] = {"♣️","♦️", "♥️", "♠️"};
		String rank[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		String cards[] = new String[suit.length * rank.length];
		String[] player1 = new String[9];
		String[] player2 = new String[9];
		String[] player3 = new String[9];
		String[] player4 = new String[9];
		String[][] player = new String[4][];
		player[0] = player1;
		player[1] = player2;
		player[2] = player3;
		player[3] = player4;
		Random r = new Random();
		String temp;
		int i = 0;
		int p = 0;
		for(int j=0; j<suit.length; j++) {
			for(int k=0; k<rank.length; k++)
			{
				cards[i] = rank[k] + suit[j];
				i++;
			}
		}
		for(int j=0; j<1000; j++) {
			int r1 = r.nextInt(suit.length * rank.length);
			int r2 = r.nextInt(suit.length * rank.length);
			temp = cards[r1];
			cards[r1] = cards[r2];
			cards[r2] = temp;
		}
		for(int j=0; j<9; j++) {
			player1[j] = cards[p];
			p++;
			player2[j] = cards[p];
			p++;
			player3[j] = cards[p];
			p++;
			player4[j] = cards[p];
			p++;
		}
		
		for(int j=0;j<4;j++) {
			System.out.println("Player"+(j+1));
			for(int k=0;k<9;k++) {
				if(k != 8)
					System.out.print(player[j][k]+",");
				else
					System.out.print(player[j][k]);
			}
			System.out.println();
			System.out.println();
		}
	}

}
