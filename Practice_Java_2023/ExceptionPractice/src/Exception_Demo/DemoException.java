package Exception_Demo;

import java.io.IOException;

public class DemoException {

	public static void main(String[] args) {
		

	}

}

class ParentClass {
	public void m1() throws RuntimeException{
		
	}
}
class ChildClass extends ParentClass{
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		super.m1();
	}
}
