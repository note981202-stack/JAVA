package chapter09;

public class Anonymous3 {
	Vehicle field = new Vehicle() {
		@Override
		public void run() {
			System.out.println("자전거가 달립니다");
		}
	};//worker field end
	
	void method1() {
		Vehicle localVar = new Vehicle() {
			@Override
			public void run() {
				System.out.println("승용차가 달립니다");
			}
		};
		
		localVar.run();
	} // method1 end

void method2(Vehicle v) {
	v.run();
}
}
