package Collection;

import java.util.*;
import java.util.Iterator;
import java.util.ListIterator;

import javafx.print.Collation;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("Blue");
		a.add("Green");
		a.add("Red");
		a.add(0, "Thunder");
		a.add("Green");
		
		
//		a.clear();
		
//		System.out.println(a.get(0));
		
//		System.out.println(a.isEmpty());
		
//		a.remove(0);

//		System.out.println(a.indexOf("Green"));
		
//		System.out.println(a.contains("Red"));
		
//		a.remove("Green");
		
//		a.sort(null);
		
		a.set(2, "My Red");
		
		System.out.println(a.size());
		
//		a.trimToSize();
		
		Collections.sort(a);
		
//		Iterator i = a.iterator();
//		while (i.hasNext()) {
//			System.out.println(i.next());
//		}
		System.out.println("###############");
		ListIterator l =a.listIterator();
		while(l.hasNext()) {
			System.out.println(l.next());
		}
//		while(l.hasPrevious()) {
//			System.out.println(l.previous());
//		}
	}
}
