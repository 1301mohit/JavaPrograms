package org.bridgelabz.datastructure;

/**
 * Purpose: Single LinkedList
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   02.01.2019
 * @param <T> Generic type
 */
public class SingleLinkedList<T>{
	class Node{
		String data;
		Node next;
		Node(String data){
			this.data = data;
		}
	}
	Node head;
	
	/*
	 * Purpose: Add the new node in the linkedlist.
	 * 
	 * @param   data data of the new node.
	 * @return  true or False.
	 */
	public boolean add(String data) {
		Node n = new Node(data);
		Node temp;
		if (head == null) {
			head = n;
			return true;
		} else {
			temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = n;
			return true;
		}
	}
	
	/*
	 * Purpose: Display the data of the LinkedList.
	 */
	public void display() {
		Node temp;
		temp = head;
		if (head == null)
			System.out.println("No element is there");
		while (temp != null) {
			if (temp.next != null)
				System.out.print(temp.data + ",");
			else
				System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	/*
	 * Purpose: Number of node present in the linkedlist.
	 * 
	 * @return  integer number of node present in the linkedlist.
	 */
	public int size() {
		Node temp;
		temp = head;
		int count = 0;
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}
	
	/*
	 * Purpose: Search the data in the LinkedList.
	 *  
	 * @param   data 
	 * @return  integer position of the searched data.
	 */
	public int search(String data) {
		Node temp;
		temp = head;
		int pos = 1;
		if (head == null) {
			System.out.println("No element is there");
			return 0;
		} else {
			while ((temp.next != null) && (!temp.data.equals(data))) {
				temp = temp.next;
				pos++;
			}
			if (pos == size() && (!temp.data.equals(data)))
				return 0;
			else
				return pos;
		}
	}
	
	/*
	 * Purpose: Remove the data from a particular position
	 * 
	 * @param   position 
	 * @return  String removed data
	 */
	public String remove(int position) {
		Node temp, temp1;
		temp = head;
		if (head == null) {
			System.out.println("No element is there");
			return null;
		} else {
			if (position == 1) {
				head = temp.next;
				return temp.data;
			} else
				while (temp.next.next != null && position > 2) {
					position--;
					temp = temp.next;
				}
			temp1 = temp.next;
			temp.next = temp1.next;
			return temp1.data;
		}
	}
	
	/*
	 * Purpose: Convert LinkedList to String array.
	 * 
	 * @return String array LinkedList data in String array form
	 */
	public String[] toArray() {
		Node temp;
		temp = head;
		String[] obj = new String[size()];
		int i = 0;
		while (temp != null) {
			obj[i] = temp.data;
			temp = temp.next;
			i++;
		}
		return obj;

	}
	
	/*
	 * Purpose: Sort the linkedlist in ascending order based on data.
	 */
	public void sort() {
		Node temp;
		temp = head;
		int p = size();
		while(p > 0) {
			temp = head;
			while(temp.next != null) {
				if((temp.data).compareTo(temp.next.data) > 0) {
					String t = temp.data;
					temp.data = temp.next.data;
					temp.next.data = t;
				}
				temp = temp.next;
			}
			p--;
		}
	}
}
