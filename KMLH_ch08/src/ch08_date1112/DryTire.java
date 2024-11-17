package ch08_date1112;

public class DryTire implements Tire {

	int maxSpeed = 100;

	int speed = 0;

	

	public void SetData (int value) {

		this.speed = value;

	}

	public boolean NeedChange() {

		if(speed > maxSpeed)

			return true;

		else

			return false;

					

					

	}

}