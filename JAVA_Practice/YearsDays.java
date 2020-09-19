import java.util.*;
public class YearsDays{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Days : ");
        int days=sc.nextInt();
        double count =(double)days/365;
        System.out.printf("Years %.3f %n",count);
    }
}