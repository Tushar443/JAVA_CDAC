import java.util.*;
public class StringArray{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String arr[] =new String[5];
        for(int i =0 ; i< arr.length;i++){
            arr[i]=sc.nextLine();
        }
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@");
        for(String x : arr){
            System.out.println(x);
        }
     }
}