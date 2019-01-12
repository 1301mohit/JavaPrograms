package org.bridgelabz.objectorientedprograms;

import org.bridgelabz.datastructure.QueueUsingLinkedList;

public class Player {
	String name;
	QueueUsingLinkedList<String> cards;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public QueueUsingLinkedList<String> getCards() {
		return cards;
	}
	public void setCards(QueueUsingLinkedList<String> cards) {
		this.cards = cards;
	}
//	@Override
//	public String toString() {
//		return "Player [name=" + name + ", cards=" + cards + "]";
//	}
	
	
}
