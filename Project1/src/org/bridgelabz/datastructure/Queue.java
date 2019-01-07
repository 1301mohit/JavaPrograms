package org.bridgelabz.datastructure;

/**
 * Purpose: Queue Program
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   02.01.2019
 * @param <T> Generic type
 */
public class Queue<T> {
	int capacity;
	int front = -1;
	int rear = -1;
	Object que[];
	public Queue(int capacity){
		this.capacity = capacity;
		que = new Object[capacity];
	}
	
	/*
	 * Purpose: To add the new data in queue.
	 * 
	 * @param   data data of new node.
	 * @return  True or False.
	 */
	public boolean enqueue(T data) {
		if(rear == capacity - 1) {
			System.out.println("Queue is full");
			return false;
		}
		else {
			que[++rear] = data;
			if(front == -1)
				front = 0;
			return true;
		}
	}
	
	/*
	 * Purpose: To remove the data from the queue.
	 * 
	 * @return  generic removed data.
	 */
	public T dequeue() {
		T temp;
		if(front == -1) {
			System.out.println("Queue is empty");
			return null;
		}
		else {
			temp = (T) que[front++];
			if(front == rear+1) {
				rear = -1;
				front = -1;
			}
			return temp;
		}
	}
	
	/*
	 * Purpose: Display the data of the queue.
	 */
	public String toString() {
		if(front == -1) {
			System.out.println("Empty Queue");
			return null;
		}
		else {
			String st = "";
			for(int i=front; i<=rear; i++) {
				st = st + que[i];
				if(i<rear)
					st = st + ",";
			}
			return st;
		}
	}
	
	/*
	 * Purpose: To check queue is empty or not
	 * 
	 * @return  True or False
	 */
	public boolean isEmpty(){
		if(front == -1)
			return true;
		return false;
	}
	
	/*
	 * Purpose: To find out the size of the queue
	 * 
	 * @return  integer number of data present in the queue.
	 */
	public int size() {
		int count = 0;
		for(int i=front;i<=rear;i++) {
			count++;
		}
		return count;
	}
}
