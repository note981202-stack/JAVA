package chapter06;

public class Car { //메인메소드 안넣음
	//필드
	private String company = "현대자동차";
	private String model = "그랜저";
	private String color = "검정";
	private int maxSpeed = 350;
	private int speed;
	private boolean stop;
	
	public boolean isStop() {  // boolean타입의 getter 은 is~로 나타남
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0;
		} else {
		this.speed = speed;
	  }
	}
}
	
	//constructor 생성자

	//method 메소드

