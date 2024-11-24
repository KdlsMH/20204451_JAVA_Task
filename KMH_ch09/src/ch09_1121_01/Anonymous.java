package ch09_1121_01;

//public class Worker extends Person {
//void work() {
//	System.out.println("Go to work");
//}
//void wake () {
//	System.out.print("Wake up at 7Am");
//}
//}

public class Anonymous {
Person person = new Person() { //이렇게 한번 사용하는것을 만드는 것은 잘 안함
	void Work() {
	System.out.println("Go to work");
}
	void Wake () {
	System.out.print("Wake up at 7AM");
}
}; 
public void method1() {
	Person person = new Person() {
		void Study() {
			System.out.println("Study at 9AM.");
		}
		void Wake() {
			System.out.println("Wake up at 6 half");
	}
	};	
}
public void method2() {
}
	}