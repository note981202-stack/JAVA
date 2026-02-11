package chapter07;

public class Child extends Parent {
private String name;
boolean sw = true;

public Child() {
	this("홍길동");
	System.out.println("Child() call");
}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
	
	@Override
		public void method1() {
		if(sw) {
			System.out.println("자식메소드 호출");
			sw = false;
		} else {
			super.method1();
			sw = true;
		}
	}
	
//	@Override 파이널 메소드는 재정의 할 수 없다
//	public final void method2() {
	
//}
	
	}