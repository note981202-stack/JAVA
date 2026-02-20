package chapter13;

import java.util.Scanner;

public class Student {
  public int studentNum;
  public String name;
  
  public Student (int studentNum, String name) {
  	this.studentNum = studentNum;
  	this.name = name;
  }
	
  @Override //해쉬 코드 학번
  public int hashCode() {
  	return studentNum;
  };
  
  @Override //학번이 같으면 저장 안됨
  public boolean equals(Object obj) {
  	if(obj instanceof Student) {
  		Student student = (Student) obj;
  		if(studentNum != student.studentNum) return false;
  	} 
  	return true;
  }
  
  @Override //보여질 값 재정의
  public String toString() {
  	return studentNum + ":" + name;
  }
 
  
  
	
} //class end
