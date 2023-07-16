package MultiThread_Concurrent_Topics;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo1 {

	public static void main(String[] args) {
		PrintJob[] jobs = {
				new PrintJob("tushar"),
				new PrintJob("prakash"),
				new PrintJob("durga"),
				new PrintJob("rahul"),
				new PrintJob("demo"),
				new PrintJob("thunder"),
		};
		
		ExecutorService service = Executors.newFixedThreadPool(4);
		
		for(PrintJob job : jobs) {
			service.submit(job);
		}
		service.shutdown();
	}

}

class PrintJob implements Runnable{

	String name;
	
	PrintJob(){	}
	PrintJob(String name){
		this.name=name;
	}
	
	@Override
	public void run() {
		System.out.println(name+" job started by "+ Thread.currentThread().getName());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name+" Completed by "+ Thread.currentThread().getName());
	}
	
}