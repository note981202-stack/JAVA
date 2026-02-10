package chapter06;

public class SingletonExam {

	public static void main(String[] args) {
		//객체 생성
		Singleton st1 = Singleton.getInstence(); 
		Singleton st2 = Singleton.getInstence(); 
//		Singleton st1 = new Singleton();  // 주소를 private로 넣어놨기 때문에 위의 방봅으로 해야함
		
		System.out.println(st1);
		System.out.println(st2);
	}

}
