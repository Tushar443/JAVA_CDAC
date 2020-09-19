import java.util.*;
public class Percentage{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 5 Subject Marks");
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        int x3=sc.nextInt();
        int x4=sc.nextInt();
        int x5=sc.nextInt();
        int sum =x1+x2+x3+x4+x5;
        System.out.println("Sum is : " + sum);
        double per=((float) sum / 500)*100;
        System.out.println("Percentage is : " + per + " %");
    }

}