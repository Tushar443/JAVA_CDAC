import java.util.*;
public class Swap {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int x =sc.nextInt();
        int y =sc.nextInt();
        System.out.println(x + " before " + y);

        x=x+y; //5+3=8
        y=x-y;
        x=x-y;
        System.out.println(x + " After " + y);
    }
}