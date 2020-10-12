package Exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			int arr[]=new int[5];
			arr[5]=34;
			if(5000< 6000) {
				throw new ArithmeticException("Insufficient Balance");
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception : "+e);
		}catch(ArithmeticException e){
			System.out.println("Exception : "+e.getMessage());
		}catch(Exception e) {
			System.out.println("Exception");
		}
		
		System.out.println("rest of the code ...");

	}

}
