package ch08_date1112;

	public class WetTire implements Tire {

		int maxSpeed = 100;

		int speed = 0;

		

		public void SetData (int speed, int distance) {

			this.distance = distance;

		}

		public boolean NeedChange() {

			if(speed > maxSpeed)

				return true;

			else

				return false;

						

						

		}

	}