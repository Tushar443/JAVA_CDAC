

public class LabmdaWithClass {
    public static void main(String[] args) {
        Employee e1 = new Employee("Tushar", 23);
        Employee e2 = new Employee("Kishore", 40);
        Employee e3 = new Employee("Subham", 45);
        Employee e4 = new Employee("Sidhesh", 98);
        System.out.println(e1.getName());
        System.out.println(e2.getName());
        System.out.println(e3.getName());
        System.out.println(e4.getName());
    }
}
interface ImyLogic{
    void show();
}
class Employee implements ImyLogic{
    private String name;
    private int age ;

    Employee(String name ,int age){
        this.name=name;
        this.age =age;
    }
    public void show(){

    }

    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
}
