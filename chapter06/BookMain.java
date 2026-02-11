package chapter06; //실행 파일입니다 EXAM파일

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		//책 정보 저장
		Book[] books = null; 
		BookData bookData = new BookData(); //데이터 처리
		int num =0;
		
		while(run) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("1.도서수 입력 2.도서정보 등록 3.도서정보 전체조회 4.도서정보 분석 5.종료");
			System.out.println("-----------------------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			switch(selectNo) {
			case 1:
				
				System.out.print("도서수 입력> ");
				num = sc.nextInt();
				sc.nextLine(); // nextInt 초기화 하기 위한 목적
				break;
				
				
				
			case 2: // 도서정보 등록
				books = bookData.inputBooks(num);
				break;
				
				
				
			case 3: // 전체조회
				for(int i=0; i<books.length; i++) {
					System.out.printf("도서번호: %d || 가격 : %d || 도서 명 : %s\n", books[i].getBookNum(), books[i].getPrice(), books[i].getTitle());
					break;
				}
				break;
				
				
				
			case 4: //도서정보 분석 - 최고가격, 최저가격, 평균가격(소수점 1까지)
				int sum =0;
				int max = books[0].getPrice();
		    int min = books[0].getPrice();			
		    
		    for (int i = 0; i < books.length; i++) {
	        int price = books[i].getPrice();
	        sum += price;			
	        
	        if (price > max) {
            max = price;
        }

        if (price < min) {
            min = price;
        }
    }

		    double avg = (double) sum / books.length;

		    System.out.println("최고 가격: " + max);
		    System.out.println("최저 가격: " + min);
		    System.out.printf("평균 가격: %.1f\n", avg);
		    break;
				
				
			case 5:
				run = false;
				sc.close();
				
			} // switch end
		}// while end
		System.out.println("프로그램 종료");
	}

}
