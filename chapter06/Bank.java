package chapter06;
// 설계도라고 생각하면 편함
public class Bank {
	//필드 : 외부 에서 접근할 수 없도록 접근제한 거세요
	//getter
	//setter작업
	private String name; //이름
	private String accountNumber; //계좌 번호
	private int balance; //잔액
	
	//생성자
	Bank(){}
	
	Bank(String name, String accountNumber) {
		this.name = name; // this는 객체를 의미함
		this.accountNumber = accountNumber;
	}
	
	//메소드
	//입금
	
	void mplus (int money) { 
		balance += money;
		System.out.printf("입금액은 %d 원 입니다", money);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	//출금
	void m_down (int money) {
		if(balance < money) {
			System.out.println("잔액 부족");
		} else {
			balance -= money;
		}
}
		
	//잔액
	int balance () {
		return balance;
	}
}
