import java.util.*;
public class SmallestLargest{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[] =new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        int max =arr[0];
        for(int x : arr){
            if(x < min){
                min = x;
            }
            if(x > max){
                max =x;
            }
        }
        // Arrays.sort(arr);
        // for(int i=0;i<arr.length;i++){
        //    System.out.print(arr[i]  + " " );
        // }
       //int  min =arr[0];
       //int  max =arr[arr.length-1];
       System.out.println("MIN " +min + " MAX : " + max);
       
         
    }
}