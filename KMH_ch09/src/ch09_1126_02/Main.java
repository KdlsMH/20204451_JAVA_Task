package ch09_1126_02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Button callButton = new Button();
		new Button().SetOnClickListener(new Button.OnClickListener() {
			@Override
			public void OnClick() {
				// TODO Auto-generated method stub
				System.out.println("Make a phone call!");
			}
		}).Touch();
//		callButton.Touch();
//		Button messageButton = new Button();
		new Button().SetOnClickListener(new Button.OnClickListener() {	
			@Override
			public void OnClick() {
				// TODO Auto-generated method stub
				System.out.println("Send a message!");
			}
		}
		).Touch();
//		messageButton.Touch();
	}
}
// 최근 트렌드