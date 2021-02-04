import java.util.Scanner;
class Factorial{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int fact= 1;
		if(x ==0){ System.out.println("Factorial of "+x +" is 1" );}
		else if(x==1){System.out.println("Factorial of "+x +" is 1" );}
		else if(x==2){System.out.println("Factorial of "+x +" is 2" );}
		else{
			for(int i=2;i<=x;i++){
				fact = fact*i;		
			}
			System.out.println("factorial of "+x+" is "+fact);
	
		}
		
	}
}

