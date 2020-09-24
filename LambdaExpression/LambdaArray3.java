public class LambdaArray3 {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
            ArrayDemo2.ShowArray(arr,new ArrayDemo2()::mytest);
     }
}

interface Mylogic2 {
    boolean test(int num);
}

class ArrayDemo2{
    boolean mytest(int n){
        return n%2==0;
    }
    static void ShowArray(int []arr , Mylogic2 ref){
        for(int x : arr){
            if(ref.test(x)){
                System.out.print(x+" ");
            }
        }
    }
}
