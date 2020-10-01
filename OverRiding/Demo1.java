class A{
    void show(){
        System.out.println("A ");
    }
}
class B extends A{
    // void show(){
    //     System.out.println("B ");
    // }
}
public class Demo1{
    public static void main(String []args){
        B b =new B(); // it will check at run time and if it will not found then it will look for parent class
        b.show();    // at run time call the class A show method
    }
}