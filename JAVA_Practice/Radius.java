import java.util.*;
public class Radius {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Radius : ");
        int r =sc.nextInt();
        double a =3.14*r*r;
        double c=3.14*2*r;
        System.out.println("Area is : " + a);        
        System.out.println("Circumference is : " + c);
    }
}