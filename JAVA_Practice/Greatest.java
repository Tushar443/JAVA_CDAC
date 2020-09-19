import java.util.*;
public class Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Numbers");
        int x =sc.nextInt();
        int y =sc.nextInt();
        int z =sc.nextInt();
        // if(x>=y && x>=z){
        //     System.out.println(x+" is Greater");
        // }else if(y >=x && y >=z ){
        //     System.out.println(y+" is Greater");            
        // }else{
        //     System.out.println(z+" is Greater");
        // }

       String s = (x>=y && x>=z) ? x+" is Greater" : (y >=x && y >=z ) ? y+" is Greater" : z+" is Greater";
       System.out.println(s);
    }
}