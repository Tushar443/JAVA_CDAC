package MultiThread_Concurrent_Topics;

public class InheritableThreadLocalDemo1 {

	public static void main(String[] args) {
		ParentThread p = new ParentThread();
		p.start();

	}

}

class ParentThread extends Thread{
  // static ThreadLocal tl = new ThreadLocal<>();
   static InheritableThreadLocal<Object> tl = new InheritableThreadLocal<>() {
	   protected Object childValue(Object parentValue) {
		return "CC";
		   
	   };
   };
   @Override
	public void run() {
		tl.set("PP");
		System.out.println("Parent Thread Value= "+tl.get());
		Childthread ch = new Childthread();
		ch.start();
	}
}

class Childthread extends Thread{
	@Override
	public void run() {
		System.out.println("Child Thread Value= "+ParentThread.tl.get());
	}
}