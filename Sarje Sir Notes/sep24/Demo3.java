class Outer{
	// static int i = 100;
	int i=100;
	class Foo{
		// static final int j =100;
		void m1(){
			System.out.println("non static class "+i);
		}
	}
}
class Demo3{
	public static void main(String args[]){
		Outer r = new Outer();
		Outer.Foo ref = r.new Foo();
		ref.m1();
	}
}