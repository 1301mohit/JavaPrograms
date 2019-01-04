package org.bridgelabz.datastructure;

public class StackUsingLinkedList<T> {
	class Node{
		T data;
		Node next;
		Node(T data){
			this.data = data;
		}
	}
	Node head;
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
}
