class person{
    void show(){
        System.out.println("Person");
    }
}
class Employee extends person{
    void show (){
        System.out.println("Employee");
    }
}
class Manager extends Employee{
    void show (){
        System.out.println("Manager");
    }
}
class Q1{
    public static void main(String[] args) {
        person e =new Employee();
        person e1 =new Manager();
        person e2 =new person();
        e.show();
        // e2.show();
        // e3.show();
        

    }
}