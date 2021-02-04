import java.util.Scanner;
public class SwapNumbers{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("before "+x+ " "+ y);
		/**
		x=x+y;
		y=x-y;
		x=x-y;
		
		
		x=x*y;
		y=x/y;
		x=x/y;
		
		
		x = x^y;
		y=x^y;
		x=x^y;		
		*/

		 x = (x & y) + (x | y);
		 y = x + (~y) + 1; 
    		 x = x + (~y) + 1;
		System.out.println("After  "+x+ " "+ y);


/**
		With Temp variable

		System.out.println("before "+x+ " "+ y);		
		int temp =0;
		temp = x;
		x=y;
		y=temp;		

		System.out.println("After "+x+ " "+ y);
*/
		

	}
}

