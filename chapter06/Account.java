package chapter06;

public class Account {
  //필드
	private String ano;    //계좌 번호
	private String owner;  //예금주명
	private int balance;   //잔액
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	
	
	
	//생성자
	
	//메소드
	
	
	//예금
	void mplus (int money) { 
		balance += money;
		System.out.printf("입금액은 %d 원 입니다\n", money);
	}
	
	
	//출금
		void m_down (int money) {
			if(balance < money) {
				System.out.println("잔액 부족");
			} else {
				balance -= money;
				System.out.printf("출금액은 %d 원 입니다\n", money);
			}
		}
	
		
	//계좌 번호 조회
	public String getAno() {
		return ano;
	}
	//계좌 번호 등록
	public void setAno(String ano) {
		this.ano = ano;
		System.out.println("계좌번호가 등록되었습니다.");
	}
	
	//사용자 조회
	public String getOwner() {
		return owner;
	}
	//사용자 등록
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	//잔액조회
	public int getBalance() {
		return balance;
	}
	//잔액등록
	public void setBalance(int balance) {
		this.balance = balance;
	}
  

		
		
		
		
}// class end
	
