package 연습;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookData {
	Scanner sc = new Scanner(System.in);
	
	//list 자료 넘길 함수 선언
	public List<Book> getBookList(int num){
		
		//list 생성
		List<Book> list = new ArrayList<>();
		//키보드로 받아서 입력 추가함
		for(int i=0; i<num; i++) {
			System.out.printf("%d번째 도서 정보 입력 \n", i+1);
			
			System.out.print("도서번호 입력> ");
			int bno = sc.nextInt();
			sc.nextLine(); //##버퍼 비워주기
			
			System.out.print("도서제목 입력> ");
			String bookname = sc.nextLine();
			
			System.out.print("도서가격 입력> ");
			int price = sc.nextInt();
			sc.nextLine();
			
			list.add(new Book(bno, bookname ,price ));
		}
		return list;
		
		
	} //List end
	
} //class end
