package Interthread_communication;

public class DeamonThreadDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon());
		MyThreadD t = new MyThreadD();
		t.setDaemon(true);
		t.start();
		System.out.println(t.isDaemon());
		System.out.println("Main Thread Ends");

	}
}
class MyThreadD extends Thread{
	@Override
	public void run() {
		for(int i =0;i<=10;i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
