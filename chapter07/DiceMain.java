package chapter07; //주사위 눈 발생 클래스

public class DiceMain {

	public static void main(String[] args) {
		//주사위 눈 발생
		//주사위 클래스 이용한 실행 클래스
		//두개의 주사위 눈의 합이 2가 되면 종료
		
		//주사위 객체 2개 생성
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		int count = 0;
		
		while(true) {
			int num1 = dice1.roll();
			int num2 = dice2.roll();
			
			int sum = num1+num2;
			count++;
			System.out.printf("(%d,%d)", num1, num2);
			System.out.println();
			
			if(sum == 2) {
				System.out.printf("(1,1)이 나오는데 걸린 횟수 = %d" , count);
				break;
			}
			
		}
	} // end main
	
		//주사위 눈 발생
		static class Dice{
			
		int roll() {
			 int n = (int)(Math.random()*6)+1;
				return n;
			}
		 }
		} //end class
