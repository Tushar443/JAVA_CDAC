import java.util.*;
public class ArrayDemo{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int []a,b,c;
        a=new int[3];
        b=new int[4];
        c=new int[3];
        for(int i =0;i < a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i =0;i < b.length;i++){
            b[i]=sc.nextInt();
        }
        for(int i =0;i < c.length;i++){
            c[i]=sc.nextInt();
        }
        System.out.println("###########################");

        for(int x : a){
            System.out.print(x + " ");
        }
        System.out.println();

        for(int x : b){
            System.out.print(x+ " ");
        }
        System.out.println();

        for(int x : c){
            System.out.println();
        }
    }
}

