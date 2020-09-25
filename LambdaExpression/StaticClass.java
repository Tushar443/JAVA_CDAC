public class StaticClass{
    public static void main(String[] args) {
        // Outer p =new Outer();
        Outer.innerClass o = new Outer.innerClass(); 
        o.m1();
    }
}
class Outer{
    static int i = 100; //can not used Instance variable here 
                        // it will give error....
                        //instance variable can not be accese in static class
    static class innerClass{
        void m1(){
            System.out.println("Outer class m1 "+i);
        }
    }
}