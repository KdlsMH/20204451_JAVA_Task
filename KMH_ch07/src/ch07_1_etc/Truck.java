package ch07_1_etc;

public class Truck extends Car { //Truck 은 Car 를 자동으로 인스턴스하기 때문에

	public double speed; // 부모에게 상속 받은 것을 바꾸는 것

	Truck(double speed)

	{

	super(0); //Car(0) super 가 필요하다.

	this.speed = speed;

	}



	public void ShowSpeed() {

		

	}

	

}