package chapter03;
import java.util.Scanner;
public class exam {

	public static void main(String[] args) {
		//확인 문제 1-14 p.149
		Scanner sc = new Scanner(System.in);
		
		//2.
		int x =10;
		int y =20;
		int z = (++x) + (y--);
		System.out.println(z);
		System.out.println(x);
		System.out.println(y);
		
		
		//4
		int pencil = 534;
		int students = 30;
		
		//학생 1명 연필개수
		int pencilPerStudent = (534/30);
		System.out.println(pencilPerStudent);
				
		//남은 연필 개수
		int pencillsLeft = (534%30);
		System.out.println(pencillsLeft);
		
		//-----------------------------------
		//6
		int value = 356;
		System.out.println( value / 100 * 100);
		
	  //-----------------------------------
		//7.
		float var01 = 10f;
		float var02 = var01 / 100;
		System.out.println(var02);
		
		//-----------------------------------
		//8.
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((lengthTop + lengthBottom)*height/2.0);
		System.out.println(area);

		//-----------------------------------
		//9.
//	 System.out.print("첫번째 수>> ");
//	 String strNum1 = sc.nextLine();
//	 System.out.println(strNum1);
//		
//	 System.out.print("두번째 수>> ");
//	 String strNum2 = sc.nextLine();
//	 System.out.println(strNum2);
//	 
//	 double num1 = Double.parseDouble(strNum1);
//	 double num2 = Double.parseDouble(strNum2);
//	 
//	 String result2 = (num2 != 0) ? String.valueOf(num1/num2) : "무한대";	 
//	 
//	 System.out.println("결과 값:" + result2);
	
	  //------------------------------------
	  //10.
	  int var1 = 10;
	  int var2 = 3;
	  int var3 = 14;
	  double var4 = (var1 * var1) * Double.parseDouble(var2 + "." + var3);
	  System.out.println("원의 넓이:" + var4);
		
		//-------------------------------------
	  //11.
	 System.out.print("아이디>> ");
	 String name = sc.nextLine();
	 
	 System.out.print("패스워드>> ");
	 String strPassword = sc.nextLine();
	 int password = Integer.parseInt(strPassword);

	  if(name.equals("java")) {
	  	if(password == 12345) {
	  		System.out.println("로그인성공");
	  	} else { 
	  		System.out.println("로그인 실패: 패스워드가 틀림");
	  	}
	  } else {
	  	System.out.println("로그인 실패: 아이디가 존재하지 않음");
	  }
	  
		//-------------------------------------
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}

}
