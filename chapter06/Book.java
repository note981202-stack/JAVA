package chapter06;

public class Book {
	//객체 생성
  //필드는 외부 접근 불가
	//getter/setter
	//생성자 이용해서 필드 초기화
	
	//필드
	private int price;
	private int bookNum;
	private String title;

	
			
	//생성자
	Book(int price, int bookNum, String title){
		this.price = price;
		this.bookNum = bookNum;
		this.title = title;
	}
	
	
	
	//메소드
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	public int getBookNum() {
		return bookNum;
	}
	
	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}
	
	
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	

	
	
	
}//end
