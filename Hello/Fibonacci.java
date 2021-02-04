import java.util.Scanner;
public class Fibonacci{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a=0,b=1,c=1;
		if(x==0){System.out.println("Enter Valid Number");}
		else if(x==1){System.out.println("0 ");}
		else if(x==2) {System.out.println("0 1 ");}
		else{
			System.out.print("0 1 ");
			
		}
		for(int i=2;i<x;i++){
			c=a+b;
			System.out.print(c+" ");
			a=b;b=c;
		}
		System.out.println();
	}
}

