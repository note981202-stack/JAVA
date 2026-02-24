package 연습;

import java.util.List;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		//책정보 저장 list
		BookData bookData = new BookData();
		List<Book> books = null; 
		int num =0;
		
		while(run) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("1.도서수 입력 2.도서정보 등록 3.도서정보 전체조회 4.도서정보 분석 5.종료");
			System.out.println("-----------------------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			switch(selectNo) {
			//도서 수 입력
			case 1:
				System.out.println("도서수 입력> ");
				num = sc.nextInt();
				sc.nextLine();
				break;
				
			//도서 정보 등록
			case 2:
			   books = bookData.getBookList(num);
				break;
				
		  //도서 정보 전체조회
			case 3:
				for(int i=0; i<books.size(); i++) {
					System.out.printf("도서 번호 %d 도서 명 %s 도서 가격 %d\n" , books.get(i).getBno(), books.get(i).getBookname(), books.get(i).getPrice());
				}
				break;
				
				//도서 정보 분석
			case 4:
				int sum = 0;
				int max = books.get(0).getPrice();
				int min = books.get(0).getPrice();
				
				for (int i = 0; i<books.size(); i++ ) {
					int price = books.get(i).getPrice();
					sum += price;
					
					if(price > max) {
						max = price;
					}
					
					if (price < min) {
						min = price;
					}
				} //for end
				
				double avg = (double) sum / books.size();
				System.out.printf("최고 가격 %d\n", max);
				System.out.printf("최저 가격 %d\n", min);
				System.out.printf("평균 가격은 %.2f 입니다\n", avg);
				break;
				
			case 5:
				run = false;
				sc.close();
				
			} //switch end
		} // while end
		System.out.println("프로그램 종료");
		
		
		
		
		
	}// main end

}// class end
