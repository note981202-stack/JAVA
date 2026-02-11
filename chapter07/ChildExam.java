package chapter07;

public class ChildExam { // main 메소드에서는 super불가능 / 자식메소드에서 super써야 함

	public static void main(String[] args) {
		Child child = new Child();
		
		child.method1();
		child.method1();
		child.method1();
		child.method1();
		
		System.out.println(child.house);
	}

}
