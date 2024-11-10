package ch07_date1105;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalHospital hospital = new AnimalHospital();

		

		Dog d1 = new Dog (20);

		Dog d2 = new Dog(70);

		hospital.CheckPatient(d2);

		

		Cat c1 = new Cat(0.5);

		hospital.CheckPatient(c1);

	}



}