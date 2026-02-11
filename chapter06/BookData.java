package chapter06; //데이터 처리

import java.util.Scanner;

public class BookData {
//	실행 클래스로 배열 자료를 넘길 함수를 선언한다.
//	Book 타입의 도서 객체를 입력된 도서 수만큼 키보드로 입력 받아 추가한다.
//	도서 목록을 return 한다.
			
	Scanner sc = new Scanner(System.in);
	
	public Book[] inputBooks(int num) {
		
		
		//책 정보 저장
		Book[] books = new Book[num];
		
		for(int i=0; i<num; i++) {
			System.out.printf("%d번째 도서 정보 입력\n", i+1);
		
		System.out.print("도서번호 입력> ");
		int bookNum = sc.nextInt();
		
		System.out.print("도서가격 입력> ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("도서제목 입력> ");
		String title = sc.nextLine();
		
		books[i] = new Book(bookNum, price, title);
		} //for 끝
		return books;
		
	} //inputBooks 끝
	
}
