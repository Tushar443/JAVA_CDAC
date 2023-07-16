package MultiThread_Concurrent_Topics;

public class ThreadLocalDemo2 {

	public static void main(String[] args) {
		TransactionID t1 = new TransactionID("1st customer");
		TransactionID t2 = new TransactionID("2nd customer");
		TransactionID t3 = new TransactionID("3rd customer");
		TransactionID t4 = new TransactionID("4th customer");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}

class TransactionID extends Thread{
	static int transId = 0;
	private static ThreadLocal tl = new ThreadLocal<>() {
		protected Object initialValue() {
			return ++transId;
		};
	};
	
	public TransactionID() {
		// TODO Auto-generated constructor stub
	}
	
	public TransactionID(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println(currentThread().getName()+""
				+ "executing with transID ="+tl.get());
	}
}
