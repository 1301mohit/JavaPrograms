package org.bridgelabz.datastructure;

public class QueueMainMethod {
	public static void main(String[] args) {
		/*Queue<String> q = new Queue<String>(5);
		System.out.println(q);
		q.enqueue("Ravi");
		q.enqueue("Amit");
		System.out.println(q.size());
		System.out.println(q);
		q.dequeue();
		System.out.println(q);
		System.out.println(q.isEmpty());
		q.dequeue();
		System.out.println(q.isEmpty());*/
		/*QueueUsingLinkedList<String> qll = new QueueUsingLinkedList<String>();
		System.out.println(qll);
		qll.enqueue("ravi");
		qll.enqueue("mukesh");
		qll.dequeue();
		qll.dequeue();
		System.out.println(qll);*/
	/*	StackUsingLinkedList<String> sll = new StackUsingLinkedList<String>();
		System.out.println(sll);
		sll.push("ravi");
		sll.push("amit");
		System.out.println(sll);
		sll.pop();
		System.out.println(sll);
		sll.pop();
		System.out.println();*/
		Deque<String> d = new Deque<String>(3);
		System.out.println(d);
	//	d.addRear("abc");
	//	d.addRear("bcd");
	//	d.addRear("cde");
	//	d.addRear("def");
	//	System.out.println(d);
//		System.out.println(d.removeFront());
//		System.out.println(d.removeFront());
//		System.out.println(d.removeFront());
//		System.out.println(d.removeFront());
//		System.out.println();
	//	System.out.println(d.removeRear());
	//	System.out.println(d.removeRear());
	//	System.out.println(d.removeRear());
	//	System.out.println(d);
		d.addFront("abc");
		d.addFront("bcd");
		d.addFront("cde");
		d.addFront("def");
		System.out.println(d);
		System.out.println(d.size());
	}
}
