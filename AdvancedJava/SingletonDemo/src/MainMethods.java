class Student {
	private static Student myref;
	private int rno;
	private String name;
	
	private Student() {
		
	}

	public int getRno() {
		return rno;
	}
	
	public String getName() {
		return name;
	}
	
	private Student(int rno, String name) {
		this.rno = rno;
		this.name = name;
	}
	public static Student getIntance(int rno,String name) {
		Student s = null;
		if(myref==null) {
			myref = new Student(rno,name);
		}
		return myref;
	}
}

public class MainMethods{
	public static void main(String[] args) {
		Student s1 =Student.getIntance(1,"Tushar");
		Student s2 =Student.getIntance(2,"kishoe");
		Student s3 =Student.getIntance(3,"rohit");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}
}
