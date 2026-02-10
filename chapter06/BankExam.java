package chapter06;
// 실제로 테스트 하는 파일
public class BankExam {

	public static void main(String[] args) {
		// 객체 생성
		 Bank bank1= new Bank(); 
		 Bank bank2= new Bank("홍길동", "111-1111-11111-55465-322");
		 Bank bank3= new Bank("임꺽정", "234-4985-14689-13489-168"); 
		 
		 //고객의 정보 출력
		 //현재 00님 000계좌의 잔액은 00원 입니다.
		System.out.printf("현재 %s님 %s계좌의 잔액은 %d원 입니다", bank2.getName(), bank2.getAccountNumber(), bank2.getBalance());
		 
		 
//		 //입금 테스트
//		 bank2.mplus(10000);
//		 System.out.printf("\n홍길동 님의 잔액 %d 원 입니다\n" , bank2.balance());
//		
//		 
//		 //출금 테스트
//		 bank2.m_down(3000);
//		 System.out.printf("홍길동 님의 잔액 %d 원 입니다\n" , bank2.balance());
//		 
//		 System.out.println();
//		 
//		 bank3.mplus(10000);
//		 System.out.printf("\n임꺽정 님의 잔액 %d 원 입니다\n" , bank3.balance());
//
//		 bank3.m_down(3000);
//		 System.out.printf("임꺽정 님의 잔액 %d 원 입니다\n" , bank3.balance());
//		 
//		 System.out.println();
//		 
//		 bank1.m_down(3000);
//		 System.out.printf("테스트 님의 잔액 %d 원 입니다\n" , bank1.balance());


		
		 
	}

}
