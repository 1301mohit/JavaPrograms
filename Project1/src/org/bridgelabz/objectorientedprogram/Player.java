package org.bridgelabz.objectorientedprogram;

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
}
