import java.util.Scanner;

interface Taxable {
	double salesTax = 0.07;
	double incomeTax = 0.105;

	void calcTax();
}

class Employee implements Taxable {
	private int empid;
	private String name;
	private double salary;

	public Employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public void calcTax() {
		double ysalary = this.salary * 12;
		double tax = ysalary * incomeTax;
		System.out.println("Yearly tax is : " + tax);
	}

}

class Product implements Taxable {
	private int pid;
	private double price;
	private int quantity;

	public Product(int pid, double price, int quantity) {
		super();
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public void calcTax() {
		double tax = this.price * salesTax * this.quantity;

		System.out.printf("Sales TAX : %.3f", tax);
	}
}

public class Q49Interface {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Taxable t = new Employee(1, "Tushar", 45000);
		t.calcTax();
		Taxable p = new Product(2, 34, 3);
		p.calcTax();
	}

}
