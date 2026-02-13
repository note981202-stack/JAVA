package chapter09;

public class Button {
	OnClickListener listener;
	
	
	//다형성
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	//구현객체 onClick의 메소드 호출
	void touch() {
		listener.onClick();
	}
	
	//중첩 인터페이스
	static interface OnClickListener {
		void onClick();
	}
	
}

