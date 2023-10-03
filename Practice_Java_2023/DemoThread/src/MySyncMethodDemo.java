
public class MySyncMethodDemo {

	public static void main(String[] args) {
		DisPlayT d = new DisPlayT();
		MyThread1 t1 = new MyThread1(d);
		MyThread2 t2 = new MyThread2(d);
		t1.start();
		t2.start();
	}

}

class MyThread1 extends Thread{
	DisPlayT d ;
	
	public MyThread1() {
		// TODO Auto-generated constructor stub
	}
	public MyThread1(DisPlayT d) {
		this.d = d;
	}
	@Override
	public void run() {
		d.displayN();
	}
}

class MyThread2  extends Thread{
	DisPlayT d;
	
	public MyThread2() {
		// TODO Auto-generated constructor stub
	}
	
	public MyThread2(DisPlayT d) {
		this.d = d;
	}
	
	@Override
	public void run() {
		d.displayC();
	}
}

class DisPlayT {
	public synchronized void displayN() {
		for(int i=1;i<=10;i++) { 
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
	
	public synchronized void displayC() {
		for(int i=65;i<=75;i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
}
