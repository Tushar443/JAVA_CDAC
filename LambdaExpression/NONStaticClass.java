public class NONStaticClass{
    public static void main(String[] args) {
        Outer1 o = new Outer1();
        Outer1.innerClass p =o.new innerClass();
        p.m1();
    }
}
class Outer1{
    static int i = 100; 
     class innerClass{
        void m1(){
            System.out.println("non static class m1 "+i);
        }
    }
}