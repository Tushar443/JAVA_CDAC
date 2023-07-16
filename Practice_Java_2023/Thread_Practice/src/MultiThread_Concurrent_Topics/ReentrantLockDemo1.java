package MultiThread_Concurrent_Topics;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo1 {

	public static void main(String[] args) {
		Display d= new Display();
		//Display d2 = new Display();
		MyThreadSync t1= new MyThreadSync(d,"Dhoni");
		MyThreadSync t2= new MyThreadSync(d,"Yuvi");
		t1.start();
		t2.start();

	}

}

class MyThreadSync extends Thread{
	Display d;
	String s;
	
	public MyThreadSync() {
		// TODO Auto-generated constructor stub
	}
	
	public MyThreadSync(Display d , String s) {
		this.d = d;
		this.s = s;
	}
	
	@Override
	public void run() {
		d.wish(s);
	}
}


class Display {
	
	ReentrantLock l= new ReentrantLock();
	
	//public static synchronized void wish(String name) {
	public void wish(String name) {
		l.lock();
		for(int i =1 ;i <=10 ;i++) {
			System.out.print("Good Morning "+i+" :- ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
			System.out.println(name);
			
		}
		l.unlock();
		
	}
}
