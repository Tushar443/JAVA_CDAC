public class Static{
    private int i =34;  // instance
    private static int j=32;   //static 
    public static void main(String []args){
        Static s1 =new Static();
        Static s2 =new Static();
        Static s3 =new Static();
        System.out.println(Static.j);
        System.out.println(s1.j);
        System.out.println(s2.j);
        System.out.println(s3.j);

    } 
}
class B{

}
class c {
    
}