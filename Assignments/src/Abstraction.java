abstract class abc{
    abstract void show();
}
class ext extends abc{
    public void show(){
        final int i;
        System.out.println("Hello ext");
    }
}
public class Abstraction{
    public static void main(String[] args) {
        ext e = new ext();
        e.show();
    }
}