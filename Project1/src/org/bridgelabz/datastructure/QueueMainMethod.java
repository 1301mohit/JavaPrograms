package org.bridgelabz.datastructure;

public class QueueMainMethod {
	public static void main(String[] args) {
		Queue<String> q = new Queue<String>(5);
		System.out.println(q);
		q.enqueue("Ravi");
		q.enqueue("Amit");
		System.out.println(q.size());
		System.out.println(q);
		q.dequeue();
		System.out.println(q);
		System.out.println(q.isEmpty());
		q.dequeue();
		System.out.println(q.isEmpty());
	}
}
