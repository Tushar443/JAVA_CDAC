

public class LocalClass {
    public static void main(String[] args) {
         outer o =new outer();
         outer.inner i = o.new inner();
         i.m1();
    }
}
class outer{
    
    class inner{ //this is class with in class
        void m1(){
            class insideFunction{ //this is local class
                void m2(){
                    System.out.println("outer inner m1 insideFunction m2");
                }
            }
            System.out.println("Hello M2");
            insideFunction of =new insideFunction();
            of.m2();
            System.out.println("End insideFunction clas");
        }
    }

}
