package org.bridgelabz.datastructure;

/**
 * Purpose: Dequeue Program
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   04.01.2019
 * @param <T> Generic type
 */
public class Deque<T> {
	int capacity;
	int rear = -1;
	int front = -1;
	Object deque[];
	public Deque(int capacity) {
		this.capacity = capacity;
		deque = new Object[capacity];
	}
	
	/*
	 * Purpose: Add data in Dequeue thougth rear.
	 * 
	 * @param   data 
	 * @return  true or false
	 */
	public boolean addRear(T data) {
		if(rear == capacity - 1 || rear+1 == front) {
			System.out.println("Deque is full");
			return false;
		}
		else {
			deque[++rear] = data;
			if(front == -1) {
				front = 0;
			}
			return true;
		}
	}
	
	/*
	 * Purpose: Remove data in Dequeue through front.
	 * 
	 * @return  generic removed data
	 */
	public T removeFront() {
		T temp;
		if(front == -1) {
			System.out.println("Deque is empty");
			return null;
		}
		else {
			if(front == capacity) {
				temp = (T) deque[front];
				front = 0;
			}
			else {
				temp = (T) deque[front];
				deque[front] = null;
				front++;
				if(front == rear + 1) {
					front = -1;
					rear = -1;
				}
			}
			return temp;
		}
	}
	
	/*
	 * Purpose: Remove data from dequeue through rear.
	 * 
	 * @return  generic removed data
	 */
	public T removeRear() {
		T temp;
		if(rear == -1) {
			System.out.println("Deque is empty");
			return null;
		}
		else {
			temp = (T) deque[rear];
			deque[rear] = null;
			rear--;
			if(rear == -1 && front == 0 ) {
				rear = -1;
				front = -1;
			}
			return temp;
		}
	}
	
	/*
	 * Purpose: Add data in Dequeue through front
	 * 
	 * @param   data 
	 * @return  true or false
	 */
	public boolean addFront(T data ) {
		if(front == rear + 1) {
			System.out.println("Queue is full");
			return false;
		}
		else {
		if(front == -1) {
			deque[++front] = data ;
			rear = 0;
			return true;
		}
		else {
			if(front == 0) {
				front = capacity - 1;
				deque[front] = data ;
			}
			else {
				deque[--front] = data ;
			}
			return true;
		}
		}
	}
	
	/*
	 * Purpose: By using this method we can display the data of the dequeue.
	 * 
	 * @return  String data in String form
	 */
	public String toString() {
		String string = "";
		if(front != -1) {
			
			if(front > rear) {
				for(int i=front; i<capacity; i++)
					string = string + deque[i] + ",";
				front = 0;
			}
			if(front <= rear) {
				for(int i=front; i<=rear; i++) {
					string = string + deque[i];
					if(i < rear)
						string = string + ",";
				}
			}
		}
		return string;
	}
	
	/*
	 * Purpose: To check Dequeue is empty or not.
	 * 
	 * @return  True or False.
	 */
	public boolean isEmpty() {
		if(front == -1 && rear == -1)
			return true;
		else
			return false;
	}
	
	/**
	 * Purpose: To calculate the number of the data present in the Dequeue.
	 * 
	 * @return  integer number of data
	 */
	public int size() {
		int count = 0;
		if(front != -1) {
			
			if(front > rear) {
				for(int i=front; i<capacity; i++)
					count++;
				front = 0;
			}
			if(front <= rear) {
				for(int i=front; i<=rear; i++) {
					count++;
				}
			}
		}
		return count;
	}
}
