package chapter04;// 4-1과제

import java.util.Scanner;

public class mission {

	public static void main(String[] args) {
		// 1.
		//윤년 계산하기
		//4로 나누어 떨어지고, 100으로 나누어 떨어지지 않으면 윤년 
		//400으로 나누어 떨어지면 윤년 
//		Scanner sc = new Scanner(System.in);
//		System.out.print("##년도 입력> ");
//		int year = sc.nextInt();
//		
//		if ((year%4==0 && year%100 != 0) || year %400 == 0) {
//			System.out.printf("%d은 윤년입니다", year);
//		} else {
//			System.out.printf("%d은 평년입니다", year);
//		}
//		sc.close();
//		
		//2. 동전 교환
    //입력된 액수만큼 500원, 100원, 50원, 10원짜리 동전으로 교환
		//동전의 총개수 최소화, 고액의 동전 먼저 교환
//		Scanner sc = new Scanner(System.in);
//		System.out.println("##교환할 금액> ");
		
		
		
		
		//3. 숫자 추측
//		Scanner sc = new Scanner(System.in);
//		int ans = (int)(Math.random()*100+1);
//		int count = 0;
//		
//		while(true) {
//			System.out.println("숫자를 입력하세요");
//			int num = sc.nextInt();
//			count++;
//			if(num == ans) {
//				System.out.println("축하합니다");
//				System.out.printf("시도횟수는 %d 번 입니다\n" , count);
//				break;
//			} else if(num > ans) {
//				System.out.println("down하세요");
//			} else {
//				System.out.println("up하세요");
//				
//			} 
//			
//		} //--------------------------------------------------3번 끝 while 끝

		//4번
		// 단 수 출력(가로 출력) - for 문
		//구구단 출력하는데 1줄씩 가로로 출력되게
		// 한자리 수의 값이 출력되면 공백 출력
		
		
//		for(int i=2; i<=9; i++) { //단수출력
//			System.out.printf("%4d단 ", i);
//		}
//		System.out.println();
//		
//		for(int j=1; j<=9; j++ ) { //곱수 출력
//			for(int k=2; k<=9; k++) { // 단수 출력
//				System.out.printf("%dx%d=%2d ", k, j, k*j);
//			}
//			System.out.println();
//		}
		
		//-------------------------------------------------4번 끝
		
		//5번
		
//		boolean run = true;
//		double F = 0;
//		double C = 0;
//		
//	  Scanner sc = new Scanner(System.in);
//	  while(run) {
//	  	System.out.println();
//	  	System.out.println("---------------------------");
//	  	System.out.println(" 1. 화씨 => 섭씨 \n 2. 섭씨 => 화씨 \n 3. 종료");
//	  	System.out.println("---------------------------");
//	  
//	  
//	  System.out.println("▶번호 선택: ");
//	  int menu = sc.nextInt();
//	  
//	  switch(menu) {
//	  case 1:
//	  	System.out.println("▶화씨 온도 입력: ");
//	  	F = sc.nextDouble();
//	  	C = 5.0/9 * (F-32);
//	  	System.out.printf("섭씨 온도 = %.6f" ,C);
//	  	break;
//	  	
//	  case 2:
//	  	System.out.println("▶섭씨 온도 입력: ");
//	  	C = sc.nextDouble();
//	  	F = 9.0/5 * C+32;
//	  	System.out.printf("화씨 온도 = %.6f" , F);
//	  	break;
//	  	
//	  case 3:
//	  	run = false;
//	  	System.out.println("프로그램 종료");
//	  	sc.close();
//	  }
//	  } 
	  // 5번 끝
	  //--------------------------------------------------------
	  
	  //6번 가위, 바위, 보 게임
	  //가위(0) 바위(1) 보(2) 선택하면 컴퓨터가 생성한 난수값과 비교하여 누가 이겼는지 화면에 출력
	  //2보다 큰 수 입력하면 game over 출력 => 종료
	  
//	  Scanner sc = new Scanner(System.in);
//	  while(true) {
//	  	
//	  	int com = (int)(Math.random()*3);
//	  	
//	  	System.out.println("##가위(0) 바위(1) 보(2)> ");
//		  int my = Integer.parseInt(sc.nextLine());
//		  
//		  if(my>2) {
//		  	System.out.println("game over");
//		  	break;
//		  }
//		  
//		  if(my == com) {
//		  	System.out.printf("사람 %d , 컴%d \n 비겼음\n", my, com);
//		  } else if(com == (my+1)%3) {
//		  	System.out.printf("사람 %d, 컴%d \n 컴 승리\n", my, com);
//		  } else {
//		  	System.out.printf("사람 %d, 컴%d \n 사람 승리\n", my, com);
//		  }
//	  }
//	  sc.close();
  //-------------------------------------------------------------
	  
	  //7번
		//3.6.9 게임
	  for(int i=1; i<=50; i++) {
	  	int count =0;
	  	int value1 = i%10;
	  	int value10 = i/10;
	  	
	  	if(value1 == 3 || value1 == 6 || value1 ==9) {
	  		count++;
	  	}
	  	
	  	if(value10 == 3 || value10 == 6 || value10 ==9) {
	  		count++;
	  	}
	  	
	  	switch(count){
	  	case 0:
	  		System.out.print(i + "\t");
	  		break;
	  		
	  	case 1:
	  		System.out.print("★" + "\t");
	  		break;
	  		
	  	case 2:
	  	System.out.print("★★" + "\t");
	  	break;
	  	}
	  	
	  	
	  }
	  
	  
	  
		
		
	} // main 끝

} // class 끝
