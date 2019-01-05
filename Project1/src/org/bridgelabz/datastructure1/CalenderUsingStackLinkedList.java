package org.bridgelabz.datastructure1;

import org.bridgelabz.datastructure.QueueUsingLinkedList;
import org.bridgelabz.datastructure.StackUsingLinkedList;
import org.bridgelabz.utility.Utility;

/**
 * Purpose: To display the calender by using Stack using Linked List.
 * 
 * @author  Mohit Kumar
 * @version 1.0
 * @since   05.01.2018
 */
public class CalenderUsingStackLinkedList {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
		int d = Utility.dayOfWeek(month, 1, year);
		QueueUsingLinkedList<String> qmonths = new QueueUsingLinkedList<String>();
		QueueUsingLinkedList<Integer> qdays = new QueueUsingLinkedList<Integer>();
		QueueUsingLinkedList<String> qweek = new QueueUsingLinkedList<String>();
		StackUsingLinkedList<String> stack1months = new StackUsingLinkedList<String>();
		StackUsingLinkedList<Integer> stack1days = new StackUsingLinkedList<Integer>();
		StackUsingLinkedList<String> stack1week = new StackUsingLinkedList<String>();
		StackUsingLinkedList<String> stack2months = new StackUsingLinkedList<String>();
		StackUsingLinkedList<Integer> stack2days = new StackUsingLinkedList<Integer>();
		StackUsingLinkedList<String> stack2week = new StackUsingLinkedList<String>();
		String months[] = {"","January","Feburary","March","April","May","June","July","August","September","October","November","December"};
		int days[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		String week[] = {"","Sun","Mon","Tue","Wed","Thr","Fri","Sat"};
		for(int i=1; i<months.length; i++)
			qmonths.enqueue(months[i]);
		for(int i=1; i<days.length; i++) {
			if(i == 2) {
				if((month == 2) && (Utility.isLeapYear(year)))
					qdays.enqueue(29);
				else
					qdays.enqueue(days[i]);
			}
			else
				qdays.enqueue(days[i]);
		}
		for(int i=1; i<week.length; i++) {
			qweek.enqueue(week[i]);
		}
		for(int i=1; i<months.length; i++) {
			stack1months.push(qmonths.dequeue());
		}
		for(int i=1; i<days.length; i++) {
			stack1days.push(qdays.dequeue());
		}
		for(int i=1; i<week.length; i++) {
			stack1week.push(qweek.dequeue());
		}
		for(int i=1; i<months.length; i++) {
			stack2months.push(stack1months.pop());
		}
		for(int i=1; i<days.length; i++) {
			stack2days.push(stack1days.pop());
		}
		for(int i=1; i<week.length; i++) {
			stack2week.push(stack1week.pop());
		}
		System.out.println(stack2months.peek(12 - month)+"  "+year);
		System.out.println();
		for(int i=1; i<week.length; i++) {
			System.out.print(stack2week.pop()+" ");
		}
		System.out.println();
		for(int i=0; i<d; i++) {
			System.out.print("    ");
		}
		for(int i=1;i<=stack2days.peek(12 - month);i++) {
			if(i < 10)
				System.out.print(i+"   ");
			else
				System.out.print(i+"  ");
			if((i+d) % 7 == 0 || i == stack2days.peek(12 - month))
				System.out.println();
		}
	}
}
