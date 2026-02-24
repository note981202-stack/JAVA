package 연습;

public class Book {
	

	//필드
	private int bno;
	private String bookname;
	private int price;
	
	//생성자
	public Book(int bno, String bookname, int price) {
		this.bno = bno;
		this.bookname = bookname;
		this.price = price;
	}

	// getter
	public int getBno() {
		return bno;
	}
	
	public String getBookname() {
		return bookname;
	}
	
	public int getPrice() {
		return price;
	}
	
	
}//class end
