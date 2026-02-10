package chapter06;

public class Computer {
	//필드
	
	//생성자
	
	//메소드
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	
	int sum2(int ...values) { //매개변수가 많거나 배열로 만들필요가 있을때
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
