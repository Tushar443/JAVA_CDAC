public class ExceptionDemo{
    public static void main(String []args) throws Exception{
        try {
            int x =23/0;    
        }catch(ArithmeticException e){
            System.out.println("Cant not devided by Zero");
        }
       
    }
}