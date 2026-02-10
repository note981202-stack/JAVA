package chapter06;

public class DIceGame {

	public static void main(String[] args) {
		//주사위 게임
		//주사위 2개를 던져서 나온 눈의 합으로
		//컴의 숫자 알아 맞히기(2-12)
		//1.컴의 숫자 만들기(난수)
			//주사위 2번 던져서 값을 더하기
			//컴의 숫자와 비교
			//같으면 탈출, 다르면 계속
		
		DIce dice1 = new DIce();
		int count = 0;
			
		//컴퓨터 숫자 생성
		int	ranNum = (int)(Math.random()*11) + 2;
		
		
		while(true) {
			int d1 = dice1.getNum();
			System.out.printf("주사위 1의 값: %d\n",d1);
			
			int d2 = dice1.getNum();
			System.out.printf("주사위 2의 값: %d\n",d2);
			
			count++;
			
			if(d1+d2 == ranNum) {
				System.out.println("정답입니다");
				System.out.printf("시도횟수는 %d 입니다", count);
				break;
				
			} else {
				System.out.println("정답이 아닙니다");
				System.out.println("----------------");
			}
			
		} // while end
		
	}

}
