package ch07_2_02;

public class ChildeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Child child = new Child();

		  Parent parent = child;

		  parent.method1();

		  parent.method2();

//		  parent.method3();  (호출 불가능)
	}
}