package ch08_date1114;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button callButton = new Button();
//		CallListener callListener = new CallListener();
//		callButton.SetOnClickListener(callListener); // SetOnClickListener 를 불러오고
		callButton.SetOnClickListener(new CallListener ()); // 위쪽을 이렇게도 바꿀 수 있음.
															// 같은 것임.
		callButton.Touch(); // Touch 를 실행
		
		Button messageButton = new Button(); // 메세지를 새로 만드려면
		// 새로운 MessageListener가 필요하고 이는 OnClickListener 를 implements 해야한다.
//		MessageListener messageListener = new MessageListener();  //새로운 클래스를 정의하고
//		messageButton.SetOnClickListener(messageListener);  
		messageButton.SetOnClickListener(new MessageListener());  // 이것 또한 매한가지임

		messageButton.Touch();
	}
// 여기 파트 문제로 내도 될듯.2개를 하나로 만드는 문제.
}