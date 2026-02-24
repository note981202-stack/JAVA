package 곽현우;

public class Student {
	//필드
	private int sno; // 학번
	private String name;
	private int score; 
	
	//생성자
	public Student(int sno, String name, int score) {
		this.sno = sno;
		this.name = name;
		this.score = score;
	}

	//getter
	
	public int getSno() {
		return sno;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	
	
	
}//class end
