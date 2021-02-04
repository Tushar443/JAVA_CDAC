package practice;

import java.util.Scanner;
public class SumProductMinMax3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 integer value");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int sum = a+b+c;
		System.out.println("The sum is= "+sum);
		int pro=a*b*c;
		System.out.println("The product is= "+pro);
		
		if(a>b && a>c) {
			System.out.println("The Max is "+a);
		}
		else if(b>a && b>c) {
			System.out.println("The Max is "+b);
		}
		else {
			System.out.println("The Max is "+c);
		}

	}

}
