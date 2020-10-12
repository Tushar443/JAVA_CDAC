package Collection;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	private int sno;
	private String name;
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	public int getSno() {
		return sno;
	}
	public String getName() {
		return name;
	}
}

public class UserDefinedClassInArrayLIst {

	public static void main(String[] args) {
		ArrayList<Student> a =new ArrayList<>();
		
		a.add(new Student(1,"Tushar"));
		a.add(new Student(2,"Prakash"));
		a.add(new Student(3,"Rahul"));

//		Iterator i = a.iterator();
//		while(i.hasNext()) {
//			Student s =(Student)i.next();
//			System.out.println(s.getName() +" "+ s.getSno());
//		}
		
		for(Student s : a) {
			System.out.println(s.getName() +" "+ s.getSno());
		}
	}
}
