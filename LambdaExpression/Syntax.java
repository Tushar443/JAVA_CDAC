

// public class Syntax {
//     public static void main(String[] args) {
//         new Thread(()-> {
//             System.out.println("Another Demo");
//             System.out.println("line 2");
//         }).start();
//     }
// }


interface Talk {
    void show(String s);
}
class Syntax{
    public static void CallMethod(Talk ref){
        ref.show("Thunder");
    }
    public static void main(String[] args) {
        Talk t = new Talk(){
            public void show(String s){
                System.out.println("Welcome "+ s);
            }
        };
        Syntax.CallMethod(t);
        
    }
}

