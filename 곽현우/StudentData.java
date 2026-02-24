package 곽현우;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import 연습.Book;

public class StudentData {
	int num = 0;
	
	Scanner sc = new Scanner(System.in);
	public List<Student> getStudentList(int num) {
		
		List<Student> list = new ArrayList<>(); 
		
		for(int i=0; i<num; i++) {
			System.out.printf("%d 번째 학생 정보 입력\n", i+1);
		
			System.out.print("학번 > ");
			int sno = sc.nextInt();
			sc.nextLine(); // int 뒤에는 버퍼 비워줘야함
			
			System.out.print("이름 > ");
			String name = sc.nextLine();
			
			System.out.print("점수 > ");
			int score = sc.nextInt();
			sc.nextLine();
			
			list.add(new Student(sno, name, score)); 
		} //for end
		return list;
		
		
	} // List end
} //class end
