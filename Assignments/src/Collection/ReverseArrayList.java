package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
		ArrayList a = new ArrayList<>();
		
		a.add("Tushar");
		a.add("Prakash");
		a.add( "Rahul");
		
		
		System.out.println(a);
		Collections.reverse(a);
		System.out.println("############");
		System.out.println(a);

		
	}

}
