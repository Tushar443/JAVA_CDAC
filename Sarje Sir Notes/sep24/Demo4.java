class Outer{
	void m1(){
		A r = new A();
		r.m2();	
		class A{
			void m2(){
				System.out.println("local class");
			}
		}
	}
}
class Demo4{
	public static void main(String args[]){
		Outer o = new Outer();
		o.m1();
	}
}