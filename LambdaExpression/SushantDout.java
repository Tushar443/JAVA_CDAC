import outer.inner;

public class SushantDout {
    public static void main(String[] args) {
        outer3 o =new outer3();
        // outer3.inner 
        // i.show();
    }
}
class outer3{
     class inner {
        static final int i =200;
        public void show(){
            System.out.println("Show "+inner.i);
        }
    }
}