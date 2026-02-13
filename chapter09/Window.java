package chapter09;

public class Window {

	Button button1 = new Button();
	Button button2 = new Button();
	
	//필드 초기값으로 대입 - 필드 값으로 익명객체 타입
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다");
		}
	};

	Window() {
		button1.setOnClickListener(listener); // 매개값으로 필드를 넣음
		button2.setOnClickListener(new Button.OnClickListener() { //매개값으로 익명객체를 넣음
			
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다.");
			}
		});
	}
	
	
}//class end
