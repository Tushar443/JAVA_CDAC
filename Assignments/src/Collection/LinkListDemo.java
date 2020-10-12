package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkListDemo {
	public static void main(String[] args) {
		LinkedList l = new LinkedList<>();
		
		l.add("Tushar");
		l.add("Prakash");
		l.add("Rahul");
		
		l.addFirst("Payal");
		l.addLast("Radha");
		
		l.add("Rahul");
		l.add("Rahul");
		
//		System.out.println(l.get(0));
		System.out.println();
		
//		System.out.println(l.getFirst());
//		System.out.println(l.getLast());
		
//		System.out.println(l.getClass());
		
		System.out.println(l.indexOf("Rahul"));
		
//		System.out.println(l.lastIndexOf("Rahul"));
		System.out.println("########");
//		ListIterator l1 = l.listIterator();
		Iterator l1 =l.descendingIterator();
		while(l1.hasNext()) {
			System.out.println(l1.next());
		}
	}
}
