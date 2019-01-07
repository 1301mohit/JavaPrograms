package org.bridgelabz.datastructure;

/**
 * Purpose: Stack using LinkedList
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   04.01.2019
 * @param <T> Generic type
 */
public class StackUsingLinkedList<T> {
	class Node{
		T data;
		Node next;
		Node(T data){
			this.data = data;
		}
	}
	Node head;
	
	/*
	 * Purpose: To add new node.
	 * 
	 * @param   data data of the new node
	 * @return  True or False to check node is add or not in stack.
	 */
	public boolean push(T data) {
		Node temp = head;
		Node n = new Node(data);
		if(head == null) {
			head = n;
			return true;
		}
		else {
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = n;
			return true;
		}
	}
	
	/*
	 * Purpose: To remove node
	 * 
	 * @return  generic data of the removed node.
	 */
	public T pop() {
		Node temp = head, temp1;
		if(head == null) {
			System.out.println("Stack is empty");
			return null;
		}
		else {
			if(temp.next == null) {
				head = null;
				return temp.data;
			}
			else {
				while(temp.next.next != null)
					temp = temp.next;
				temp1 = temp.next;
				temp.next = null;
				return temp1.data;
			}
		}
	}
	
	/*
	 * Purpose: Display the data of Stack LinkedList.
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
	 * Purpose: To get the data of any position.
	 * 
	 * @param   position 
	 * @return  generic data of the position.
	 */
	public T peek(int position) {
		Node temp = head;
		if(head == null) {
			System.out.println("Stack is empty");
			return null;
		}
		else {
			while(position > 0) {
				temp = temp.next;
				position--;
			}
			return temp.data;
		}
	}
	
	/*
	 * Purpose: Number of node present in the stack linkedlist.
	 * 
	 * @return  integer number of node
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
