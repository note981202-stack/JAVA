package 곽현우;

import java.util.List;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		StudentData studentData = new StudentData();
		List<Student> students = null; 
		int num = 0;
		
		while(run) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("1.학생수 입력 2.학생정보 등록 3.학생정보 전체조회 4.학생정보 분석 5.종료");
			System.out.println("-----------------------------------------------------------");
			System.out.print("선택> ");
	
			int selectNo = Integer.parseInt(sc.nextLine());
			
			switch(selectNo) {
			
			//학생수 입력
			case 1:
				System.out.print("학생 수>");
				num = sc.nextInt();
				sc.nextLine();
				break;
			
			//학생정보 등록
			case 2:
				students = studentData.getStudentList(num);
				break;
				
			//학생정보 전체 조회
			case 3:
				for(int i=0; i<students.size(); i++) {
					System.out.printf("%d 학번 점수 : %d점\n", students.get(i).getSno(), students.get(i).getScore());
				}
				break;
				
			//학생정보 분석
			case 4:
				int sum = 0;
				int max = students.get(0).getScore(); 
				int min = students.get(0).getScore(); 
				
				for(int i=0; i<students.size(); i++ ) {
					int score = students.get(i).getScore();
					sum += score;
					
					if(score > max) {
						max = score;
					}
					
					if(score < min) {
						min = score;
					}
				}//for end
					
					double avg = (double) sum / students.size();
					
					System.out.printf("최고 점수 : %d 점\n", max); 
					System.out.printf("최저 점수 : %d 점\n", min); 
					System.out.printf("평균 점수는 %.2f점 입니다.\n", avg); 
					break;
			
				
			case 5:
				run = false;
				sc.close();
				break;
			}// switch end
			
	} //while end
		System.out.println("프로그램 종료");

}// main end
	
}// class end