package org.bridgelabz.datastructure;

public class Deque<T> {
	int capacity;
	int rear = -1;
	int front = -1;
	Object deque[];
	public Deque(int capacity) {
		this.capacity = capacity;
		deque = new Object[capacity];
	}
	public boolean addRear(T item) {
		if(rear == capacity - 1 || rear+1 == front) {
			System.out.println("Deque is full");
			return false;
		}
		else {
			deque[++rear] = item;
			if(front == -1) {
				front = 0;
			}
			
		//	System.out.println("rear:"+rear);
		//	System.out.println("front:"+front);
			return true;
		}
	}
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
			//	System.out.println("rear:"+rear);
			//	System.out.println("front:"+front);
				temp = (T) deque[front];
				deque[front] = null;
				front++;
			//	System.out.println("rear:"+rear);
			//	System.out.println("front:"+front);
				if(front == rear + 1) {
					front = -1;
					rear = -1;
				}
			}
			//System.out.println("rear:"+rear);
			//System.out.println("front:"+front);
			
			return temp;
		}
	}
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
	public boolean addFront(T item) {
		if(front == rear + 1) {
			System.out.println("Queue is full");
			return false;
		}
		else {
		if(front == -1) {
			deque[++front] = item;
			rear = 0;
			return true;
			//System.out.println("Not possible");
			//return false;
		}
		else {
			if(front == 0) {
				front = capacity - 1;
				deque[front] = item;
			}
			else {
				deque[--front] = item;
			}
			return true;
		}
		}
	}
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
	public boolean isEmpty() {
		if(front == -1 && rear == -1)
			return true;
		else
			return false;
	}
	/*public int size() {
		int count = 0;
		for(int i=front; i<capacity -1; i++)
			count++;
		for(int i=0; i<=rear; i++)
			count++;
		return count;
	}*/
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
