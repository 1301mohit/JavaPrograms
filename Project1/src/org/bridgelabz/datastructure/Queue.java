package org.bridgelabz.datastructure;

public class Queue<T> {
	int capacity;
	int front = -1;
	int rear = -1;
	Object que[];
	public Queue(int capacity){
		this.capacity = capacity;
		que = new Object[capacity];
	}
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
	public boolean isEmpty(){
		if(front == -1)
			return true;
		return false;
	}
	public int size() {
		int count = 0;
		for(int i=front;i<=rear;i++) {
			count++;
		}
		return count;
	}
}
