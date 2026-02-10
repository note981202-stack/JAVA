package chapter06;

public class Singleton {
	//싱글톤 : 전체에서 객체 1개만 만드는 기법
	
	//필드 = 자신의 객체를 생성 저장
	private static Singleton st = new Singleton();
	
	
	//생성자
	private Singleton() {}
	
	
	//메소드
	public static Singleton getInstence() {
		return st;
	}

}
