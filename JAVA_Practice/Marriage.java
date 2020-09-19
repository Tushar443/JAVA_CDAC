import java.util.*;
public class Marriage{
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    char mf = sc.next().charAt(0);
    int age =sc.nextInt();

    if(mf == 'm' || mf == 'M'){
        if(age >= 22){
            System.out.println("Eligible for Marriage");
        }else{
            System.out.println("NOT Eligible for Marriage");
        }
    }
    else{
        if(age >= 18){
            System.out.println("Eligible for Marriage");
        }else{
            System.out.println("NOT Eligible for Marriage");
        }
    }
}
}