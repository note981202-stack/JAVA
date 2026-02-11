package chapter06;

import java.util.Scanner;

public class AccountExam {

	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		//계좌 저장
		Account[] accounts = new Account[100];
		int accountCount = 0; //저장된 계좌
		
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4. 출금 | 5. 종료");
			System.out.println("---------------------------------------------");
			System.out.println("선택> ");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			switch(selectNo) {
			case 1:
				
				System.out.println("계좌 번호 입력> ");
				String ano = sc.nextLine();
				
				System.out.println("계좌 주 입력> ");
				String owner = sc.nextLine();
				
				System.out.println("초기입금액 입력> ");
				int balance = Integer.parseInt(sc.nextLine());
				
			// Account 객체 생성 - 배열에 넣으려고 만듦
        Account acc = new Account();
        acc.setAno(ano);
        acc.setOwner(owner);
        acc.mplus(balance);

        // 배열에 추가
        accounts[accountCount] = acc;
        accountCount++;

        System.out.println("계좌가 생성되었습니다!");
        break;
				
        
			case 2:
				// 계좌 목록 조회
				System.out.println("----------------");
				System.out.println("계좌목록");
				System.out.println("----------------");
				for(int i=0; i < accountCount; i++) {
					System.out.printf("등록된 계좌목록 입니다\n %s %s\n 계좌금액은 %d 원 입니다\n", accounts[i].getOwner(), accounts[i].getAno(), accounts[i].getBalance());
				}
				break;
				
			case 3: // 예금
        System.out.print("입금할 계좌번호 입력> ");
        String depositAno = sc.nextLine();
        
        
        //입금할 계좌 번호 찾기
        for(int i=0; i<accountCount; i++) {
        	if(accounts[i].getAno().equals(depositAno)) {
        		
        		//입금할 금액 입력
        		System.out.print("입금할 금액 입력> ");
        		int depositMoney = Integer.parseInt(sc.nextLine());

        		accounts[i].mplus(depositMoney); //입금
        		break;
        	} 
        } // 입금 끝
        break;
        
			case 4: // 출금
        System.out.print("출금할 계좌번호 입력> ");
        String depositAno2 = sc.nextLine();
        
        //출금할 계좌 번호 찾기
        for(int i=0; i<accountCount; i++) {
        	if(accounts[i].getAno().equals(depositAno2)) {
        		
        		//출금할 금액 입력
        		System.out.print("출금할 금액 입력> ");
        		int depositMoney2 = Integer.parseInt(sc.nextLine());

        		accounts[i].m_down(depositMoney2); //출금
        		break;
        	} 
        } // 출금 끝
        break;
        
			case 5:
				run = false;
				sc.close();
			} //switch end
			System.out.println("프로그램 종료");
        
        

        
        
		}
		
		
		
	}

}
