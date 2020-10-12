package Collection;

class Student1 implements Cloneable{
	private int sno;
	private String name;
	public Student1(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	public int getSno() {
		return sno;
	}
	public String getName() {
		return name;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

public class CloneDemo {

	public static void main(String[] args) {
		try {
			Student1 s = new Student1(1, "Thunder");
			Student1 s1 = (Student1)s.clone();

			System.out.println(s.getName() +" "+ s.getSno());
			System.out.println(s1.getName() +" "+ s1.getSno());
			
			System.out.println(s1 == s);
			System.out.println(s.equals(s1));
		}catch(CloneNotSupportedException e) {
			
		}
		
	}

}
