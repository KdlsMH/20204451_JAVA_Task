package ch09_1126_04;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();

//		m.testTV(new RemoteController() {
//			public void TurnOn() {
//				System.out.println("Turn On Test");
//			}
//			public void TurnOff() {
//				System.out.println("Turn Off Test");
//			}
//		}
//		);
		RemoteController rc = new TV();
		m.TestTV(rc);
	}
	
	void TestTV(RemoteController rc) {
		rc.TurnOn();
		rc.TurnOff();
	}
}