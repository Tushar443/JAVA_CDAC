import java.util.*;
public class GrossSalary{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double salary=sc.nextDouble();
        double HRA;
        double DA;
        if(salary < 10000){
            HRA = salary *0.1;
            DA =salary * 0.9;
            // System.out.println(HRA + " " + DA);
        }else {
            HRA =2000;
            DA= salary * 0.98;
        //  System.out.println(HRA + " " + DA);
        }
        double GS = salary+HRA+DA;
        System.out.println("Gross Salary is :  "+GS);
    }
}