import java.util.*;
public class Expr{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value of x : ");
		int x = sc.nextInt();
		int y;
		y = x*x + 3*x -7;
		System.out.println("1st Expression " + y);
		y=x++ + ++x;
		// y=x++;
		// y=++x;
		System.out.println("Value of x "+ x +", "+ "Y value " + y);

		int z =x++ - --y - --x + x++;
		System.out.println("value of x : "+ x);
		System.out.println("value of y : "+ y);
		System.out.println("value of z : "+ z);


		System.out.println("Enter True or False of x");
		boolean xb=sc.nextBoolean();
		System.out.println("Enter True or False of y");
		boolean yb =sc.nextBoolean();
		boolean zb;
		zb=xb && yb || !(xb || yb);
		System.out.println("value of z : "+ zb);
	}

}
