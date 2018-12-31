package org.bridgelabz.datastructure;

public class SingleLinkedList<T> {
	class Node{
		T data;
		Node next;
		Node(T data){
			this.data = data;
		}
	}
	Node head;
	public boolean add(T ele) {
		Node n = new Node(ele);
		Node temp;
		if(head == null) {
			head = n;
			return true;
		}
		else {
			temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = n;
			return true;
		}
	}
	public void display() {
		Node temp;
		temp = head;
		if(head == null)
			System.out.println("No element is there");
		while(temp != null) {
			if(temp.next != null)
				System.out.print(temp.data+",");
			else
				System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public int size(){
		Node temp;
		temp = head;
		int count = 0;
		while(temp != null)
		{
			temp = temp.next;
			count++;
		}
		return count;
	}
	public int search(T data) {
		Node temp;
		temp = head;
		int pos = 1;
		if(head == null) {
			System.out.println("No element is there");
			return 0;
		}
		else {
			while((temp.next != null) && (!temp.data.equals(data))) {
				temp = temp.next;
				pos++;
			}
			if(pos == size() && (!temp.data.equals(data))) 
				return 0;
			else
				return pos;
		}
	}
	public T remove(int pos) {
		Node temp, temp1;
		temp = head;
		if(head == null) {
			System.out.println("No element is there");
			return null;
		}
		else {
			if(pos == 1) {
				head = temp.next;
				return temp.data;
			}
			else
				while(temp.next.next != null && pos > 2) {
					pos--;
					temp = temp.next;
				}
				temp1 = temp.next;
				temp.next = temp1.next;
				return temp1.data;
		}
	}
	public Object[] toArray() {
		Node temp;
		temp = head;
		Object[] obj = new Object[size()];
		int i = 0;
		while(temp != null) {
			obj[i] = temp.data;
			temp = temp.next;
			i++;
		}
		return obj;	
		
	}
	/*public Object print() {
		Object obj;
		Node temp;
		temp = head;
		while(temp != null) {
			obj = temp.data;
			temp = temp.next;
			return obj;
		}
		return null;
	}*/
}
