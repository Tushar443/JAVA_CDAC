public class BorderAceesControlDemo{
    public static void main(String []args){
        Manager m =new Manager(1,"Tushar",23,56);
        m.show();
    }
}
class Employee{
    private int empno;
    private String name;

    Employee(int empno ,String name){
        this.empno =empno;
        this.name=name;
    }

    void show(){                                                    //1) default void show()
        System.out.println("Employee " + empno + " "+ name);        //2) protected void show()
    }                                                               //3) public void show()
}
class Manager extends Employee{
    private int ta;
    private int da;

    Manager(int empno,String name ,int ta,int da){
        super(empno,name);
        this.ta=ta;
        this.da=da;
    }

    void show (){                                                  //1) protected void show() correct
        super.show();                                                  //public void show()  correct
        System.out.println("Manger " + ta + " "+ da);              //2)public void show() correct 
    }                                                                  // default show() XXXXX
}                                                                  //3)Only public void show();
                                                                       // default and protected XXXXX