package ch09_1119_03;

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

	void work() {

	System.out.println("Go to work");

}

	void wake () {

	System.out.print("Wake up at 7Am");

}

}; 

}