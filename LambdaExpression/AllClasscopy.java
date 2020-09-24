public class AllClasscopy {
    public static void main(String[] args) {
        outer1 o =new outer1();
        o.createobject();
    }
}
class outer1{
    public void createobject(){
        StaticClass s =new StaticClass();
        s.show();
    }
    class StaticClass{
        public void show(){
            System.out.println("Hello Static Class");
            inner1 i =new inner1();
            i.m1();
        }
        class inner1{
            void m1(){
                class insideFunction{ 
                    void m2(){
                        System.out.println("outer inner m1 insideFunction m2");
                    }
                }
                System.out.println("Hello M1");
                insideFunction of =new insideFunction();
                of.m2();
                System.out.println("End insideFunction clas");
            }
        }
    }
}
