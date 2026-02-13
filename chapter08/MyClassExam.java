package chapter08;

public class MyClassExam {
	public static void main(String[] args) {
		System.out.println("1)필드-----------------tv");
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		
		System.out.println("2)생성자-----------------audio");
		MyClass myClass2 = new MyClass(new Audio());
		
		System.out.println("3)로컬변수-----------------audio");
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		
		System.out.println("4)매개변수-----------------tv");
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());
		
		System.out.println("5)구현객체-----------------tv");
		SmartTelevision tv = new SmartTelevision();
		tv.turnOn();
		tv.turnOff();
		tv.setVolume(10);
		tv.search("www.naver.com");
		
		
	}

}
