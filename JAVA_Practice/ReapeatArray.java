import java.util.*;
public class ReapeatArray{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int arr [] =new int[n];

        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int z = n*3;
        int newArr[] = new int[z];
        
        
        int count =0;
        for(int j =0;j<arr.length;j++){
            for(int i =count;i<newArr.length;i++){
                    count++;
                    newArr[i]=arr[j];
                }

            }
        }
        System.out.println("============================");
        for(int y : newArr){
            System.out.println(y);
        }
    }
}