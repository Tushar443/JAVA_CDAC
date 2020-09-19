import java.util.*;
public class SimpleInterest{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Principal Amount");
        double amt =sc.nextDouble();
        System.out.println("Enter rate of interest");
        float rate = sc.nextFloat();
        System.out.println("Enter time in years");
        int time = sc.nextInt();

        double SI = amt*(1+(rate*time));

        System.out.printf("Simple Interest  %.3f %n",SI);
    }

}