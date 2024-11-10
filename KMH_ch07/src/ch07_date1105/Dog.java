package ch07_date1105;

public class Dog extends Animal{ //extends Animal 이 됨으로 써 오버라이딩 되는 것임.

	static double normalRunSpeed = 50;

	double runSpeed; //2개 사용 위치

	

	public Dog(double runSpeed) {

		this.runSpeed = runSpeed;

	}

	

	public boolean IsHealthy() {

		if(runSpeed > normalRunSpeed)

			return true;

		else

			return false;

	}

	

}