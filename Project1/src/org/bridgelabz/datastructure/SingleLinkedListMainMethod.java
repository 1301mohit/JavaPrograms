package org.bridgelabz.datastructure;

public class SingleLinkedListMainMethod {

	public static void main(String[] args) {
		SingleLinkedList s = new SingleLinkedList();
		s.display();
		s.add("abc");
		s.display();
		s.add("bcd");
		s.add("cde");
		s.display();
		System.out.println(s.size());
		System.out.println("Position:"+s.search("cde"));
		System.out.println(s.remove(1));
		s.display();
		Object str[] = s.toArray();
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}
	
}
