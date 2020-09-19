import java.util.*;
public class leapYear{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int year =sc.nextInt();
        String s =(year%4==0)? year+" Leap Year" : year+" Not a Leap Year";
        System.out.println(s);
    }
}