public class ClassDemo{
    public static void main(String[] args) {
        myLogic m =new myLogic(){
           public void m1(){
                System.out.println("Hello Logic");
            }
        };
        m.m1();
    }
}

interface myLogic{
    void m1();
}