package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRetainAll {

	public static void main(String[] args) {
		ArrayList a =new ArrayList<>();
		
		a.add("Tushar");
		a.add("Prkash");
		a.add("Rahule");
		a.add("Rohit");
		
		ArrayList a1 =new ArrayList<>();
		
		a1.add("Tushar");
		a1.add("PAyal");
		
		
//		a.retainAll(a1); // only common remians
//		a.removeAll(a1);
//		a.addAll(a1);
		
		Iterator i = a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
