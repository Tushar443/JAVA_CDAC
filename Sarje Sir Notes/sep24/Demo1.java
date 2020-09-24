interface Foo1{
	default void m1(){
		System.out.println("default inteface method");
	}
}
class Bar implements Foo1{
//    public void m1(){
// 		System.out.println("Deault Bar m1");
// 	}
}
class Demo1{
	public static void main(String args[]){
		Bar b = new Bar();
		b.m1();
	}
}