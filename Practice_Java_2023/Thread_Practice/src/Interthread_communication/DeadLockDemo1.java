package Interthread_communication;

public class DeadLockDemo1 {

	public static void main(String[] args) {
		MyDeadLock d = new MyDeadLock();
		d.m1();
	}
}

class MyDeadLock extends Thread{
	A a = new A();
	B b =new B();
	
	public void m1() {
		this.start();
		a.d1(b); // this code is executed by main thread
	}
	
	@Override
	public void run() {
		b.d2(a);//this code is executed by child thread
	}
}

class A{
	public synchronized void d1(B b) {
		System.out.println("Main Thread 1 start execution of d1() method");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main Thread 1 try to calling B's LastB() method");
		b.lastB();
	}
	public synchronized void lastA() {
		System.out.println("Inside A this is lastA() method");
	}
}
class B{
	public synchronized void d2(A a) {
		System.out.println("Child Thread 2 start execution of d2() method");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Child Thread 2 try to calling A's LastA() method");
		a.lastA();
	}
	public synchronized void lastB() {
		System.out.println("Inside B this is lastB() method");
	}
}
