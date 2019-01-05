package org.bridgelabz.datastructure;

/**
 * Purpose: Queue Using LinkedList.
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   04.01.2019
 * @param <T> Generic type
 */
public class QueueUsingLinkedList<T> {
	class Node{
		T data;
		Node next;
		Node(T data){
			this.data = data;
		}
	}
	Node head;
	
	public boolean enqueue(T data) {
		Node temp = head;
		Node n = new Node(data);
		if(head == null)
		{
			head = n;
		}
		else {
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = n;
		}
		return true;
	}
	
	public T dequeue() {
		Node temp = head;
		if(head == null) {
			System.out.println("Queue is empty");
			return null;
		}
		else {
			head = temp.next;
			temp.next = null;
			return temp.data;
		}
	}
	
	public String toString() {
		Node temp = head;
		String string = "";
		while(temp != null) {
			string = string + temp.data;
			if(temp.next != null)
				string = string + ",";
			temp = temp.next;
		}
		return string;
	}
	
	public T peek(int position) {
		Node temp = head;
		while(position > 1) {
			temp = temp.next;
			position--;
		}
		return temp.data;
	}
}
