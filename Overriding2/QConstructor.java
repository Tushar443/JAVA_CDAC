class person{
    person(){
        this(1);
        System.out.println("no arg Person");
    }
    person(int i) {
    System.out.println("Parameter const person");
    }
}
class Employee extends person{
   Employee(){
       this(2);
    System.out.println("no arg Employee");
   }
   Employee(int i) {
    System.out.println("Parameter const Employee");
    }
}

class QConstructor{
    public static void main(String[] args) {
        Employee e =new Employee();
    }
}