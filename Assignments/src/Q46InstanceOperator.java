
public class Q46InstanceOperator {
	public static void main(String[] args) {
		//DownCasting
	/**	Person p= new Manager();
		Manager m =(Manager)p;
		m.show();
	*/
		
		Person arr[]= {new Manager(),new Person(),new Manager(),new Person(),new Manager()};
		
		for(Person x : arr) {
			if (x instanceof Manager) {
//				Manager m =(Manager)x;
				x.show();
			}
		}
		
//		Manager Show
//		Person Show
//		Manager Show
//		Person Show
//		Manager Show
	}
}
class Person{
	public void show() {
		System.out.println("Person Show");
	}
}
class Manager extends Person{
	public void show() {
		System.out.println("Manager Show");
	}
}
