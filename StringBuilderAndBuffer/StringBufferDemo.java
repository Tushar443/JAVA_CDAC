public class StringBufferDemo{
    public static void main(String []args){
        StringBuilder s =new StringBuilder("Tushar ");
        s.append("def");
        System.out.println(s);

        StringBuffer s1 =new StringBuffer("Thunder ");
        s.append("Hello.");
        System.out.println(s1);
    }
}
