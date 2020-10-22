public class VarDemo{
    void Show(char b,int... ar ){
        for(int a : ar){
            System.out.println(a);
        }
            System.out.println(b);

    }
    public static void main(String []args){
        VarDemo v =new VarDemo();
        v.Show('A',23,45,6,7,4,3,456,4654,3467);
    }
}