package ch07_date1105;

public class Cat extends Animal{//extends Animal 이 됨으로 써 오버라이딩 되는 것임.

	static double normalJumpHeight = 1;

	double jumpHeight;

	

	public Cat(double jumpHeight) {

		this.jumpHeight = jumpHeight;

	}

	

	public boolean IsHealthy() {

		if(jumpHeight > normalJumpHeight)

			return true;

		else

			return false;

	}

	

}