package chapter06;

public class Student {
	
	//학번(int), 이름(String), 점수(int)를 속성으로 가진다.
	//인스턴스 생성 시 값을 초기화할 수 있도록 생성자를 가진다.
	
	//필드
	private int stuNum;
	private int score;
	private String name;
	
	//생성자
	Student(int stuNum, int score, String name){
		this.stuNum = stuNum;
		this.score = score;
		this.name = name;
	}
	
	
	


	//메소드
	public int getStuNum() {
		return stuNum;
	}
	
	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
