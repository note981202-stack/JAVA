package chapter06;

public class DIce {
	//주사위 객체화
	//주사위 눈 - 필드
	//주사위 던진다 -> 눈의 값 - 메소드
	
	//필드
	int num;
	
	//생성자
	
	//메소드
	public int getNum() {
		num = (int)(Math.random()*6) + 1;
		 return num;
	} //주사위
	
}
