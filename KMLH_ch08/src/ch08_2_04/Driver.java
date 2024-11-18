package ch08_2_04;

public class Driver {		//Bus 객체, Taxi 객체
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle; // <-
			bus.checkFare();
		}ㅉ
		vehicle.run();
	}
}