package org.bridgelabz.objectorientedprograms;

import java.util.Random;

import org.bridgelabz.datastructure.QueueUsingLinkedList;
import org.bridgelabz.utility.Utility;

public class DeckOfCards2 {

	public static void main(String[] args) {
		System.out.println("Enter names of the four player");
		String p1Name = Utility.nextLine();
		String p2Name = Utility.nextLine();
		String p3Name = Utility.nextLine();
		String p4Name = Utility.nextLine();
		String suit[] = {"♣️","♦️", "♥️", "♠️"};
		String rank[] = {"02", "03", "04", "05", "06", "07", "08", "09", "10", "Jack", "Queen", "King", "Ace"};
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
		QueueUsingLinkedList<Player> players = new QueueUsingLinkedList<Player>();
		QueueUsingLinkedList<String> players1 = new QueueUsingLinkedList<String>();
		QueueUsingLinkedList<String> players2 = new QueueUsingLinkedList<String>();
		QueueUsingLinkedList<String> players3 = new QueueUsingLinkedList<String>();
		QueueUsingLinkedList<String> players4 = new QueueUsingLinkedList<String>();
		Random r = new Random();
		String temp;
		int i = 0;
		int p = 0;
		for(int j=0; j<suit.length; j++) {
			for(int k=0; k<rank.length; k++)
			{
				cards[i] = suit[j] + rank[k];
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
		//	players1.enqueue(cards[p]);
			player1[j] = cards[p];
			p++;
		//	players2.enqueue(cards[p]);
			player2[j] = cards[p];
			p++;
		//	players2.enqueue(cards[p]);
			player3[j] = cards[p];
			p++;
		//	players2.enqueue(cards[p]);
			player4[j] = cards[p];
			p++;
		}
		Utility.bubbleSortOfString(player1);
		Utility.bubbleSortOfString(player2);
		Utility.bubbleSortOfString(player3);
		Utility.bubbleSortOfString(player4);
		for(int j=0; j<9; j++) {
			players1.enqueue(player1[j]);
			players2.enqueue(player2[j]);
			players3.enqueue(player3[j]);
			players4.enqueue(player4[j]);
		}
		Player p1 = new Player();
		p1.setCards(players1);
		p1.setName(p1Name);
		Player p2 = new Player();
		p2.setCards(players2);
		p2.setName(p2Name);
		Player p3 = new Player();
		p3.setCards(players3);
		p3.setName(p3Name);
		Player p4 = new Player();
		p4.setCards(players4);
		p4.setName(p4Name);
		players.enqueue(p1);
		players.enqueue(p2);
		players.enqueue(p3);
		players.enqueue(p4);
		System.out.println(p1.getName());
		System.out.println(p1.getCards());
		System.out.println(p2.getName());
		System.out.println(p2.getCards());
		System.out.println(p3.getName());
		System.out.println(p3.getCards());
		System.out.println(p4.getName());
		System.out.println(p4.getCards());
		//System.out.println(p1.getName());
		//System.out.println(p1.getCards());
		
//		
	for(int j=0;j<4;j++) {
			System.out.println(players.peek1().getName());
		System.out.println(players.dequeue().getCards());
		System.out.println();
	}
			
//			for(int k=0;k<9;k++) {
//				System.out.println(players.dequeue().getCards());
//				if(k != 8)
//					System.out.print(player[j][k]+",");
//				else
//					System.out.print(player[j][k]);
//			}
//			System.out.println();
//			System.out.println();
//		}
//		
//		for(int j=0;j<4;j++) {
//			System.out.println("Player"+(j+1));
//			for(int k=0;k<9;k++) {
//				if(k != 8)
//					System.out.print(player[j][k]+",");
//				else
//					System.out.print(player[j][k]);
//			}
//			System.out.println();
//			System.out.println();
//		}
	}
}
