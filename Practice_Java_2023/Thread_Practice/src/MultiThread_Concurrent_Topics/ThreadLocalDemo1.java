package MultiThread_Concurrent_Topics;

public class ThreadLocalDemo1 {

	public static void main(String[] args) {
		ThreadLocal tl = new ThreadLocal<>();
		System.out.println(tl.get());
		tl.set("tushar");
		System.out.println(tl.get());
		tl.remove();
		System.out.println(tl.get());
		
		System.out.println("@@@@@@@@@@");
		ThreadLocal tl2 = new ThreadLocal<>() {
			@Override
			protected Object initialValue() {
				
				return "thunder";
			}
		};
		System.out.println(tl2.get());
		tl2.set("tushar");
		System.out.println(tl2.get());
		tl2.remove();
		System.out.println(tl2.get());
 	}

}
