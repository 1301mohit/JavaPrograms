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
	
	/*
	 * Purpose: To add new node in the queue.
	 * 
	 * @param   data data of new node.
	 * @return  True or False.
	 */
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
	
	/*
	 * Purpose: To remove node from the queue.
	 * 
	 * @return  generic data of the removed node.
	 */
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
	
	/*
	 * Purpose: Display the data of the queue.
	 */
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
	
	/*
	 * Purpose: To get the data according to the position.
	 * 
	 * @param   position 
	 * @return  generic data of the position
	 */
	public T peek(int position) {
		Node temp = head;
		while(position > 1) {
			temp = temp.next;
			position--;
		}
		return temp.data;
	}
	
	/**
	 * Purpose: Number of node present in the queue.
	 *  
	 * @return  integer
	 */
	public int size() {
		Node temp = head;
		int count = 0;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
}
