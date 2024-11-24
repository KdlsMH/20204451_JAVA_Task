package ch09_1121_03;

public class Anonymous {
//	RemoteController tv = new TV();
	RemoteController tv = new RemoteController() {
		@Override
		public void TurnOn() {
			System.out.println("Turn on the TV");
		}
		public void TurnOn() {
			System.out.println("Turn off the TV");
		}
	};
}