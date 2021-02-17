package com.threaddemo;

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread m = new MyThread();
		m.start();
		//m.run(1);

		for(int i=0;i<10;i++) {
			System.out.println("Main");
		}
		System.out.println(Thread.currentThread());
	}

}

class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		for(int i=0;i<10;i++) {
			System.out.println("Thread");
		}
	}
//	public void start() {
//		for(int i=0;i<10;i++) {
//			System.out.println("Start");
//		}
//	}
//	public void run(int x) {
//		for(int i=0;i<10;i++) {
//			System.out.println("Thread "+x);
//		}
//	}
}