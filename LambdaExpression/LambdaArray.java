public class LambdaArray {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        // ArrayDemo.ShowArray(arr, (int n)->{
        //         return true;
        // });
    //         Mylogic ref = new Mylogic(){
    //           public boolean test(int n){
    //                return true;
    //            }
    //         };
    //     ArrayDemo.ShowArray(arr, ref);
        // ArrayDemo.ShowArray(arr, (int n)->{
        //     return n%2==0;
        // });

        ArrayDemo.ShowArray(arr, (int n)->{
            return n%2!=0;
        });


     }
}

interface Mylogic {
    boolean test(int num);
}

class ArrayDemo{
    static void ShowArray(int []arr , Mylogic ref){
        for(int x : arr){
            if(ref.test(x)){
                System.out.println(x+"");
            }
        }
    }
}
