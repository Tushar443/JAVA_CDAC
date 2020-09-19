import java.util.*;
public class TwoDArrayAgain{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[][]= {{4,5},
        {7,8,9,5,6,8},
        {3,4,5,6},
        {1,2,3}
    };
        int NoOf=0;
        int oneD=0;
        for(int x[] : arr){
            oneD++;
            NoOf=0;
            for(int y : x){
                NoOf++;
                System.out.print(y +" ");
            }
            System.out.println(" every One D array " + NoOf);
           
        }
        System.out.println(" One d Arrya in 2-d Array " + oneD);
    }
}