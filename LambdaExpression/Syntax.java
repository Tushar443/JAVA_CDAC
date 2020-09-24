// import jdk.javadoc.internal.tool.Start;

public class Syntax {
    public static void main(String[] args) {
        new Thread(()-> {
            System.out.println("Another Demo");
            System.out.println("line 2");
        }).start();
    }
}

// class RunMyLogic implements Runnable{
//    public void Show(){
//         System.out.println("Lambda Expreassion");
//     }
// }
