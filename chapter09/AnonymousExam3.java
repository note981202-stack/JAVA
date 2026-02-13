package chapter09;

public class AnonymousExam3 {

	public static void main(String[] args) {
		
		Anonymous3 anony = new Anonymous3();
		anony.field.run();
		anony.method1();
		anony.method2(
				new Vehicle() {
					@Override
					public void run() {
						System.out.println("트럭이 달립니다");
					}
				}
			);

	} // end main

}
