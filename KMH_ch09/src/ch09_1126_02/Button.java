package ch09_1126_02;

public class Button {
	OnClickListener listener;
	public Button SetOnClickListener(OnClickListener listener) {
		this.listener = listener;
		return this;
	}
	public void Touch () {
		if (listener != null)
		listener.OnClick();
	}
	public interface OnClickListener {
		void OnClick(); 
	}
}
//최근 트렌드