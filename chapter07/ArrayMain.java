package chapter07; //ArrayMain

public class ArrayMain {

	public static void main(String[] args) {

		//배열을 입력받아 최소값을 구해주는 메소드 작성
		//실행결과 출력
		//밑에서 메소드 받아서 여기서 출력하면 됨
		
		double[] array1= {1.1, 2, 99, 5.5, 0.1, 0.9};
		double[] array2= {4.4, 20, -63, 10.8, 9, 0.5};
		
		double value1 = minMethod(array1);
		double value2 = minMethod1(array2);
		
		System.out.printf("배열의 최소값은 %.2f 입니다\n", value1 );
		System.out.printf("배열의 최소값은 %.2f 입니다", value2 );
		
	}// main end

	
	private static double minMethod(double[] array1) {
		
		double min = array1[0];
		for(int i=0; i<array1.length; i++) {
			double value1 = array1[i];
			if(value1 < min) {
				min = value1;
			}
		}
		return min;
		
	} 
	
	private static double minMethod1(double[] array2) {
		
		double min = array2[0];
		for(int i=0; i<array2.length; i++) {
			double value2 = array2[i];
			if(value2 < min) {
				min = value2;
			}
		}
		return min;
		
	}
	
	//minMethod
	
	//메소드 생성
  //n번째 배열의 최소값 = 
	
	
} // class end 
