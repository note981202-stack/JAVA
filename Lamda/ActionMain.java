package Lamda;

public class ActionMain {

	public static void main(String[] args) {
		action(new Calculater() {

			@Override
			public void calc(int x, int y) {
				int result = x + y;
				System.out.println(result);
			}
			
		});
		
		//람다식 함수
		action((x,y) -> { // => 아님 -> 주의
			System.out.println(x - y);
		});
		
		action((x,y) -> {
			System.out.println(x * y);
		});
		
		action((x,y) -> {
			System.out.println(x / y);
		});
		
	}//end main
	
	private static void action(Calculater calc) {
		int x = 30;  
		int y = 20;
		calc.calc(x, y);
	}

} //end class
