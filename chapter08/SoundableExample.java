package chapter08;

class Dog implements Soundable {
	@Override
	public String sound(){
		return "멍멍";
	}
} //dog end

class Cat implements Soundable {
	@Override
	public String sound(){
		return "야옹";
	}
}




public class SoundableExample {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());

	} //main end

} // class end
