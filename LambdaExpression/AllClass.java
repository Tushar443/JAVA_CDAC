public class AllClass {
    public static void main(String[] args) {
        //  outer.StaticClass i =new outer.StaticClass();
        outer.StaticClass.show();
    }
}
class outer{
    static class StaticClass{
        public static void show(){
            System.out.println("Hello Static Class");
            inner i =new inner();
            i.m1();
        }
        static class inner{ //this is class with in class
            void m1(){
                class insideFunction{ //this is local class
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
