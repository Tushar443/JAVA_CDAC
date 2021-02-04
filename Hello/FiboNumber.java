import java.util.Scanner;
public class FiboNumber{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a=0,b=1,c=1;
		if(x==0){System.out.println("Invalid");}
		else{
			System.out.print("0 ");
			for(int i=1;c<x;i++){
				System.out.print(c +" ");
				c=a+b;
				a=b;b=c;				
			}
			System.out.println();
		}		


	}
}

