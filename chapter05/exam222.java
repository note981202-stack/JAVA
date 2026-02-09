package chapter05;

import java.util.Scanner;

public class exam222 {

	public static void main(String[] args) {
		//4
		//합계, 평균, 최대값, 최소값 출력
		
//		int sum = 0;
//		int max = Integer.MAX_VALUE; //정수 중 제일 큰 값
//		int min = Integer.MIN_VALUE; 
//		double avg;
//		
//		int[] array = {1, 5, 3, 8, 2};
//				
//		for(int num : array ) {
//			sum += num;
//			if(max < num) max = num;  
//			if(min > num) min = num; 
//		}
//		avg = (double) sum / array.length;
//		
//		System.out.printf("배열의 합은: %d\n", sum);
//		System.out.printf("배열의 평균: %.2f\n" ,avg);
//		System.out.printf("최대값: %d\n" ,max);
//		System.out.printf("최소값: %d\n" ,min);
		
		
//		//5.
//		//각 행의 합계와 평균을 구하세요
//		int[][] array2 = {
//				{95, 86},
//				{83, 92, 96},
//				{78, 83, 93, 87, 88}
//				};
//		int sum = 0;
//		double avg = 0.0;
//		
//		//작성위치
//		for(int i=0; i<array2.length; i++) {
//			sum = 0;
//			for(int j=0; j<array2[i].length; j++) {
//				sum += array2[i][j];
//			}
//			avg = (double) sum / array2[i].length;
//			
//		
//		System.out.println("sum: " + sum);
//		System.out.println("avg: " + avg);
//		
		

//6번 switch문으로 작성
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("---------------------------");
			System.out.println("선택> ");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			switch(selectNo) {
			case 1:
				System.out.println("학생수 입력> ");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum]; //배열생성
				break;
				
			case 2:
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d]>" , i);
					scores[i] = Integer.parseInt(sc.nextLine());
				};
				break;
				
			case 3:
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d]> %d\n" , i, scores[i]);
				}
					break;
				
			case 4:
				int sum = 0;
				int max = 0;
				double avg = 0;
				
				for(int i=0; i<scores.length; i++) {
					sum += scores[i];
					if(max < scores[i]) max = scores[i];
					
				}
				avg = (double)sum / studentNum;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
				break;
				
			case 5:
				run = false;
				sc.close();
		}
	 System.out.println("프로그램 종료");
		
		
		
		
//		System.out.println("max: "+ max);
		
		}	
	} // end main

} // end class
