package chapter09;

public class Anonymous2 {
	Worker field = new Worker() {
		@Override
		public void start() {
			System.out.println("디자인을 합니다");
		}
	};//worker field end
	
	void method1() {
		Worker localVar = new Worker() {
			@Override
			public void start() {
				System.out.println("개발을 합니다");
			}
		};
		
		localVar.start();
	} // method1 end

void method2(Worker worker) {
	worker.start();
}
}
