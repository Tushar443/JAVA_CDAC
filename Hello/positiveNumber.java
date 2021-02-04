import java.util.Scanner;
public class positiveNumber{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x>0){
			System.out.println("Positove");		
		}else if(x<0){
			System.out.println("Negative");		
		}else{
			System.out.println("Zero");
		}

		
	}

}
