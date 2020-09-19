import java.util.*;
public class MissingINT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 0 && n <=100){
            System.out.println("Enter Size of Array");
            int x =sc.nextInt();
            int arr[] =new int[n];
            for(int i = 0;i<x;i++){
               int y=sc.nextInt();
                arr[y-1]=y;
            }
            System.out.println("=========================");
            for(int i=0;i<arr.length;i++){
                if(arr[i] == 0 ){
                    System.out.println(i+1);
                }
            }
        }
    }
}