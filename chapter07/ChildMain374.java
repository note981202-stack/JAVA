package chapter07;

public class ChildMain374 {
	public static void method1(Parent373 parent) {//Parent373의 parent를 받아옴
		if(parent instanceof Child373) { //parent가 Child373으로 변경 가능한지 여부 확인
			Child373 child = (Child373) parent;
			System.out.println("변환 성공");
		 } else {
			 System.out.println("변환 실패");
		 }
	}
	
	public static void method2(Parent373 parent) {
		Child373 child = (Child373) parent;
		System.out.println("변환 성공");
	}
	
	
	
	public static void main(String[] args) {
		//객체 생성
		Parent373 parent = new Child373();
		method1(parent);
		method2(parent);
		
		
		Parent373 parent2 = new Parent373();  //instanceof확인하지 않아서 오류가 출력됨
		method1(parent2);
		method2(parent2);
	}

}
