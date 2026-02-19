package chapter11; // 동등객체 비교 방법

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	
	//코드 작성
	
	@Override  //이퀄스 재정의
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			if(studentNum.equals(student.studentNum)) {
				return true;
			}
		}
		return false;
	}
	
	@Override  //해쉬 코드 재정의
	public int hashCode() {
		return studentNum.hashCode(); //문자열을 인트 타입으로 변경
	}
}
