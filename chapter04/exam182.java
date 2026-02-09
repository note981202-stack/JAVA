package chapter04;
import java.util.Scanner;
public class exam182 {

	//2번
	public static void main(String[] args) {
	  int sum = 0;
	  for(int i=1; i<100; i++) {
	  	if(i%3 == 0) {
	  		sum += i;
	  	}
	  }
	  System.out.println(sum);
	  
	 //3번
	 //1-6까지 주사위 2개
	 //횟수 체크(count)
	 //두눈의 합 sum
	 int count = 0;
	 sum = 0;
	 
	 while(true) {
		 int num1 = (int) (Math.random()*6)+1;
		 int num2 = (int) (Math.random()*6)+1;
		 sum = num1 + num2;
	   count++;
		 
	   
		 System.out.println("(" + num1 + "," + num2 + ")" );
		 
		 if(sum == 5) {
			 System.out.println("시도 횟수는 " + count + " 입니다");
			 break;
		 }
	 }			 
			 
			 //4번
			 //4x+5y = 60
		 for(int x = 1; x <= 10; x++) {
			 for(int y=1; y <=10; y++) {
				 sum = 4 * x + 5 * y;
//				 System.out.println(sum);
				 if(sum == 60) {
					 System.out.printf("(%d,%d)\n",x,y);
					 
				 }
			 }
		 		 
	 }
		 
		 //5번
		 //*문제1
		 for (int i = 1; i <=4; i++) {
			 for (int j = 1; j <=i; j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 
		 
//		 //6번
//		 //*문제2
		 for (int i = 1; i<=4; i++) {
			 for(int j = 4; j>=1; j-- ) {
				 if(j>i) {
					 System.out.print(" ");
				 } else {
					 System.out.print("*");
				 }
			 }
			 System.out.println();
		 }
		 
		 //7번
		 //while문과 scanner사용
		 //switch문 사용
		 //잔고가 부족하면 출금이 되지 않도록
		 //출금 가능액을 출력
		 
		 boolean run = true;
		 int balance = 0;
		 int money = 0;
		 Scanner sc = new Scanner(System.in);
		 
		 while(run) {
			 System.out.println("-----------------------------");
			 System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			 System.out.println("-----------------------------");
			 
			 System.out.print("선택> ");
			 int menu = sc.nextInt();
			 
			 switch(menu) {
				 case 1:
				 System.out.print("예금액 ");
				 money = sc.nextInt();
				 balance += money;
				 break;
				 
				 case 2:
				 System.out.print("출금액");
				 money = sc.nextInt();
				 if(balance < money) {
					 System.out.println("잔고가 부족합니다");
					 System.out.printf("출금가능액은 %d 입니다\n", balance);
				 } else {
					 balance -= money;
				 }
				 
				 case 3:
					 System.out.println("잔고>"+balance);
					 break;
					 
				 case 4:
					 run = false;
			 }
		 }			 
		 System.out.println("프로그램 종료"); // 7번 종료
		 sc.close();
		 
		 
	 } // main끝	  
  } // class끝

