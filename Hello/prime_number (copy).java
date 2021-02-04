import java.util.Scanner;
public class prime_number{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x%2==0){
			System.out.println("Not a prime");		
		}
		else{
			System.out.println("Prime");
		}

	}
}

