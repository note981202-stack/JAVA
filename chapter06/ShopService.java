package chapter06;

public class ShopService {

	//싱글톤
	
	//필드
	private static ShopService ss = new ShopService();
	
	//생성자
	private ShopService( ) {} //외부에서 객체 생성 막음
	
	//메소드
	public static ShopService getInstence() {
		return ss;
	}
	
}
