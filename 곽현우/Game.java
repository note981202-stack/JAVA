package 곽현우;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int ans = (int)(Math.random()*50)+1;
	
	while(true) {
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num == ans) {
			System.out.println("축하합니다!!");
			break;
		} else if(num > ans) {
			System.out.println("down 하세요!!");
		} else {
			System.out.println("up 하세요!!");
		}
	}
		
	} // main end

} // class end
