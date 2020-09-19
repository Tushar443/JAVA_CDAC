import java.util.*;
public class Temperature{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Temperature in Fahren");
        int tem =sc.nextInt();
        int x = tem-32;
        double degree = (double) (x * 5)/9;

        System.out.printf("Degree celcius %.3f %n", degree);
    }   
}