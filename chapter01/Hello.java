package chapter01;

import java.io.IOException;

public class Hello {

	public static void main(String[] args) throws IOException {
		System.out.println("Hello, Java");
		
		//data type
		char char1 = 'A';
		int intA = 'A';
		String str = "abc"; //문자열은 기본타입 아님, 클래스 타입이다
		System.out.println(char1);;
		System.out.println(intA);
		System.out.println(str);
		
		//확인문제 9번 
		 long var1 = 2L;
		 float var2 = 1.8f;
		 double var3 = 2.5;
		 String var4 = "3.9";
		 int result = (int)(var1 + var2+ var3 + (int)Double.parseDouble(var4));
//		 int result2 = (int) var2; -- 강제 타입변환
//		 System.out.println(result2);
		 
//		 System.out.println(result);
		 System.out.printf("결과 =%d\n", result);
		 System.out.printf("var1 = %dL\n", var1);
		 System.out.printf("var2 = %.1ff\n", var2);
		 System.out.printf("var3 = %.1f\n", var3);
		 System.out.printf("var4 = %s\n", var4);
		 System.out.println("end");
		 
		 //키보드로 키 입력받기
		 System.out.print("키 입력 >> ");
		 int keycode = System.in.read();
		 System.out.println(keycode);
		 
//		 keycode = System.in.read();
//		 System.out.println(keycode);
//		 
//		 keycode = System.in.read();
//		 System.out.println(keycode);
//
//		 keycode = System.in.read();
//		 System.out.println(keycode);
		 
		 //기본 타입 값 비교 ==
		 //class 타입 값 비교 equals()
		 String str1 = "java";
		 String str2 = "java";
		 String str3 = new String("java");
		 String str4 = new String("java");
		 
		 System.out.println(str4.equals(str3)); //값을 비교
		 System.out.println(str4 == str3);      //주소를 비교
		 
		 
		 
		 
	}// end main
	
} //end class
