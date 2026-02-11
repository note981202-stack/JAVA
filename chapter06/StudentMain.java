package chapter06;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		Student[] students = null;
		StudentData studentData = new StudentData();
		int num = 0;
		
		while(run) {
			System.out.println("------------------------------------------------------------");
			System.out.println("1.학생수 입력 2.학생정보 등록 3.학생정보 전체 조회 4.학생정보 분석 5.종료");
			System.out.println("------------------------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			switch(selectNo) {
			
			case 1: //학생 수 입력	
				System.out.print("학생수 입력> ");
				num = sc.nextInt();
				sc.nextLine(); //초기화
				break;
				
			case 2: // 학생정보 등록
				students = studentData.inputStudents(num);
				break;
				
			case 3: //학생 정보 조회
				for(int i=0; i<students.length; i++) {
					System.out.printf("학번 %d, || 이름 %s, || 점수%d \n", students[i].getStuNum(), students[i].getName(), students[i].getScore());
				}
				break;
				
			case 4: //학생 정보 분석
				int max = Integer.MIN_VALUE;
				int min = Integer.MAX_VALUE;
				int sum = 0;
				
				for(Student s : students ) {
					int score = s.getScore();
					if(score > max) {
						max = score;
					}
					if(score < min) {
						min = score;
					}
					sum += score;
				}
				double avg = (double)sum/students.length;
			System.out.printf("최고 점수: %d\n", max);
			System.out.printf("최저 점수: %d\n", min);
			System.out.printf("평균 점수는 %.2f 점 입니다\n", avg);
			break;	
			
			case 5:
				run = false;
				
			} //switch end
		}//while end
		System.out.println("프로그램 종료");
		sc.close();
		
		
	}//main end
}// class end
