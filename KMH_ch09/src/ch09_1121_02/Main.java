package ch09_1121_02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		RemoteController Tv;
		m.TurnOnAndOFF(null); //null -> tv
	}
	void TurnOnAndOFF(RemoteController rc) {
		rc.TurnOn();
		rc.TurnOff();
	}
}