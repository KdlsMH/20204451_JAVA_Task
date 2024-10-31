package ch07_1_etc;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car car = new Car(100);

//		System.out.println("Speed : "+ car.speed);

		Truck truck = new Truck(80);

		truck.ShowSpeed();

//		System.out.println("Speed : "+ truck.speed);

		Car car = truck;

		car.ShowSpeed();

//		System.out.println("Speed : "+ car.speed);

	} //만약 car 버튼을 온 클릭 하면 재정의 된 자식 클래스의 truck 을 출력하게 된다.

		//무조건 자식 걸 실행 시키게 됨.



}