class A{
	int x;
	public A() {
		System.out.println("A Constructor");
	}
	public A(int x) {
		System.out.println("Parameter A "+ x );
	}
}
class B extends A{
	public B() {
//		super();
		this(4);
		System.out.println("B Constructor");
	}
	public B(int x) {
		super(x);
		System.out.println("PArameter B "+ x);
	}
}
public class Q47ConstChainning {
	public static void main(String[] args) {
		A b =new B();
//		A b =new B(3);
		
	}
}