interface Foo{
	static void m1(){
		System.out.println("static inteface method");
	}
}
interface foo34{
	public abstract void show();
}
interface foo3{
 	 default void show3(){
		System.out.println("Default show3");
	}
}
class myclass implements foo3,foo34{
	public void show(){
		System.out.println("myclass show");
	}
	public void show3(){
		System.out.println("myclass show3");
	}
}

class Demo{
	public static void main(String args[]){
		myclass m = new myclass();
		m.show3();
		Foo.m1();
	}
}

