package org.bridgelabz.datastructure1;

import org.bridgelabz.datastructure.QueueUsingLinkedList;
import org.bridgelabz.utility.Utility;

public class CalenderUsingQueueLinkedList {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
		int d = Utility.dayOfWeek(month, 1, year);
		QueueUsingLinkedList<String> qmonths = new QueueUsingLinkedList<String>();
		QueueUsingLinkedList<Integer> qdays = new QueueUsingLinkedList<Integer>();
		QueueUsingLinkedList<String> qweek = new QueueUsingLinkedList<String>();
		String months[] = {"","January","Feburary","March","April","May","June","July","August","September","October","November","December"};
		int days[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		String week[] = {"","Sun","Mon","Tue","Wed","Thr","Fri","Sat"};
		for(int i=1;i<months.length;i++)
			qmonths.enqueue(months[i]);
		for(int i=1;i<days.length;i++) {
			if(i == 2) {
				if((month == 2) && (Utility.isLeapYear(year)))
					qdays.enqueue(29);
				else
					qdays.enqueue(days[i]);
			}
			else
				qdays.enqueue(days[i]);
		}
		for(int i=1;i<week.length;i++) {
			qweek.enqueue(week[i]);
		}
	/*	if((month == 2) && (Utility.isLeapYear(year)))
			days[month] = 29;*/
		System.out.println(qmonths.peek(month)+"  "+year);
		System.out.println();
		for(int i=1; i<week.length; i++) {
			System.out.print(qweek.dequeue()+" ");
		}
		System.out.println();
		for(int i=0; i<d; i++) {
			System.out.print("    ");
		}
		for(int i=1;i<=qdays.peek(month);i++) {
			if(i < 10)
				System.out.print(i+"   ");
			else
				System.out.print(i+"  ");
			if((i+d) % 7 == 0 || i == qdays.peek(month))
				System.out.println();
		}
	//	System.out.println(months[month]+"  "+year);
	//	System.out.println();
	//	for(int i=1; i<week.length; i++) {
	//		System.out.print(week[i]+" ");
	//	}
	//	System.out.println();
		//System.out.println("Sun Mon Tue Wed Thr Fri Sat");
//		for(int i=0; i<d; i++) {
//			System.out.print("    ");
//		}
//		for(int i=1; i<=days[month];i++) {
//			if(i<10)
//				System.out.print(i+"   ");
//			else
//				System.out.print(i+"  ");
//			if((i+d) % 7 == 0 || i == days[month])
//				System.out.println();
//		}
	}
}
