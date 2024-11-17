package ch08_date1114;

public class Button {
	
	OnClickListener listener;

	

	public void SetOnClickListener(OnClickListener listener) {

		this.listener = listener;

	}

	// 이 함수를 자동으로 호출하게끔 하는 것임

	public void Touch () {

		if (listener != null) // null 이 아닐 경우에 실행

		listener.OnClick();

	}

//	public interface OnClickListener { //Button 안에 OnClickListener 를 넣을 수 있음

//		void OnClick(); // 필수적으로 들어감 중첩 인터페이스, 동작에 대한 프레임 워크 제공

//	}



}

// 여기까지가 프레임 워크에서 제공 되는 것임