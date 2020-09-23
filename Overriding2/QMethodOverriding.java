public class QMethodOverriding {
    public static void main(String[] args) {
        //Person p =new Person();
        // Employee p = new Employee();
        // Person p =new Employee();
        Person p =new Person();
        p.getDetails();
        p.getJob();
        // p.getDept();  // if reference is of super class then we can access super 
                        //class methods and only overridden method of subclass
                        // we can not acess normal method of
        

        // Employee e =(Employee) p;
        // e.getDept();
        // e.getDetails();
        // e.getJob();
    }                    
}
class Person{
    void getDetails(){
        System.out.println("Person Details");
    }
    void getJob(){
        System.out.println("Person Job");
    }
}
class Employee extends Person{
    void getJob(){
        System.out.println("Employee Job");
    }
    void getDept(){
        System.out.println("Employee Dept");
    }
}