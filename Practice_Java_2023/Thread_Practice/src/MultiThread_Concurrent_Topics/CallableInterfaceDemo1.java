package MultiThread_Concurrent_Topics;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableInterfaceDemo1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyCallable[] jobs = {
				new MyCallable(10),
				new MyCallable(15),
				new MyCallable(5),
				new MyCallable(100),
				new MyCallable(40),
				new MyCallable(23),
		};
		ExecutorService service = Executors.newFixedThreadPool(3);
		for(MyCallable job : jobs) {
			Future f= service.submit(job);
			System.out.println(f.get());
		}
	}

}

class MyCallable implements Callable{

	int num;
	
	public MyCallable() {
		// TODO Auto-generated constructor stub
	}
	public MyCallable(int  num) {
		this.num=num;
	}
	@Override
	public Object call() throws Exception {
		int sum = 0;
		for(int i =1;i<=num;i++) {
			sum+=i;
		}
		return sum;
	}
	
}
