package chapter06;

import java.util.Scanner;

public class StudentData {
//	실행 클래스로 배열 자료를 넘길 함수를 선언한다.
//	Student 타입의 학생 객체를 입력된 학생 수 만큼 키보드로 입력 받아 추가한다
//	학생 자료를 return 한다.
	
	Scanner sc = new Scanner(System.in);
	
	public Student[] inputStudents(int num) {
		
		Student[] students = new Student[num]; 
		
		for(int i=0; i<num; i++) {
			System.out.printf("%d 번째 학생정보 입력> \n", i+1);
			
			System.out.print("학번: ");
			int stuNum = sc.nextInt();
			sc.nextLine(); //공백 받아내기 용도
			
			System.out.print("이름: ");
			String name = sc.nextLine();
			
			System.out.print("점수: ");
			int score = sc.nextInt();
			
			students[i] = new Student(stuNum, score, name);
		}//for 끝
		return students;
		
	} //inputStudents끝
	
	
	
	
} //class end
