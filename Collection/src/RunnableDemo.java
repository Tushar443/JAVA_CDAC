
public class RunnableDemo {

	public static void main(String[] args) {
		System.out.println("Main Start");

		for (int i = 0; i < 10; i++) {
			System.out.println("Main " + i);
		}
		RunnableClass r = new RunnableClass();
		Thread t = new Thread(r);
		t.start();
//		t.start(); exception 
		System.out.println(Thread.currentThread().getId() + " Main End");

	}
}

class RunnableClass implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getId() + " run");
		for (int i = 0; i < 10; i++) {
			System.out.println("Runnable class " + i);
		}

	}

}
