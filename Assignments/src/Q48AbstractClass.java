import java.util.Scanner;

abstract class Processor {
	protected double data;

	public Processor(double data) {
		this.data = data;
	}

	void showData() {
		System.out.println("Data = " + this.data);
	}

	abstract void process();
}

class Factorial extends Processor {
	private double fact = 1;

	public Factorial(double data) {
		super(data);
	}

	@Override
	void process() {
		for (double i = data; i > 1; i--) {
			this.fact = this.fact * i;
//			System.out.println(this.fact);
		}
	}

	@Override
	public void showData() {
		System.out.println("Factorial is : " + (int) (this.fact));
	}
}

class Cirlce extends Processor {
	public Cirlce(double data) {
		super(data);
	}

	private double area;

	@Override
	void process() {
		this.area = 3.14 * data * data;
	}

	@Override
	void showData() {
		System.out.printf("Area is : %.3f\n", this.area);
	}
}

public class Q48AbstractClass {
	public static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		Factorial f = new Factorial(5);
//		f.process();
//		f.showData();
//		Cirlce c =new Cirlce(3);
//		c.process();
//		c.showData();
		boolean var = true;
		double num = 0;
		while (var) {
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("1 : for Factorial \n" + "2: for Area of Circle\n" + "3 : for Quit");
			System.out.print("Enter Your Choice : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter the Factorial Number : ");
				num = sc.nextDouble();
				Factorial f = new Factorial(num);
				f.process();
				f.showData();
				break;

			case 2:
				System.out.print("Enter the radius if Circle : ");
				num = sc.nextDouble();
				Cirlce c = new Cirlce(num);
				c.process();
				c.showData();
				break;
			case 3:
				System.out.println("@@@@@@@@@@@@@@@");
				System.out.println("Thank You");
				var = false;
				break;
			default:
				System.out.println("Invalide Choice");
			}
		}

	}
}
