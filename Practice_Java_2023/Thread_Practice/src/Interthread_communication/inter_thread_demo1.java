package Interthread_communication;

import java.util.Iterator;

public class inter_thread_demo1 {

	public static void main(String[] args) {
		
		DemoThread t = new DemoThread();
		t.start();
		synchronized (t) {
			try {
				System.out.println("Main thread called wait method");
				t.wait();
			} catch (InterruptedException e) {}
		}
		System.out.println("Main thread got the notification ");
		System.out.println(t.total);
	}

}

class DemoThread extends Thread{
	int total = 0;
	@Override
	public void run() {
		synchronized (this) {
			System.out.println("Child thread start executing job");
			for(int i=1;i<=100;i++) {
				total = total+i;
			}
			System.out.println("Child thread will notify ");
			this.notify();
		}
	}
}