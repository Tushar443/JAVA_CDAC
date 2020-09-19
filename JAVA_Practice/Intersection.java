import java.util.*;
public class Intersection{
    public static void main(String[] args) {
        int arr []={12,34,56,67,89};
        int brr [] ={21,56,78,90};

        for(int a : arr){
            for (int b : brr){
                if(a==b){
                    System.out.println(a);
                }
            }
        }
    }
}