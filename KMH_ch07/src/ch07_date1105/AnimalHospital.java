package ch07_date1105;

public class AnimalHospital {
	public void CheckPatient (Animal animal) { //CheckPatient 가 Dog 과 Cat 이 오버로딩 되는 것.

		if(animal.IsHealthy())

			System.out.println("That's ok");

		else

			System.out.println("That's so Bad");

	}

}

	// Dog 함수가 넘어 오게 되면 Animal 에 상속되어 있기 때문에



//	public void CheckPatient (Dog dog) { //CheckPatient 가 Dog 과 Cat 이 오버로딩 되는 것.

//		if(dog.IsHealthy())

//			System.out.println("That's ok");

//		else

//			System.out.println("That's so Bad");

//	}

//	public void CheckPatient (Cat cat) {

//		if(cat.IsHealthy())

//			System.out.println("That's ok");

//		else

//			System.out.println("That's so Bad");

//

//	}

//} //객체지향의 다형성을 잘 표현하는 방법은 이런 방식이 아닌 상속이다.