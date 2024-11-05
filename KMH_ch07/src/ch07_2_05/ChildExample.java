package ch07_2_05;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Child(); //자동 타입 변환
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
//		parent.field2 = "data2";  //(불가능)
//		parent.method3();         //(불가능)
		
		
		Child child = (Child) parent; //강제 타입 변환
		child.field2 = "yyy";  //(가능)
		child.method3();     //(가능)
	}
}