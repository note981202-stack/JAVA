package chapter13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashSetMain {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1, "김민제"));
		set.add(new Student(2, "이호섭"));
		set.add(new Student(3, "김민우"));
		set.add(new Student(4, "전진배"));
		set.add(new Student(5, "최정현"));
		
		//번호가 같으면 삭제 - 스캐너를 사용해서 학번 같은사람 작성되면 삭제
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 학번 입력>>");
		int stuNum = sc.nextInt();
		sc.nextLine(); 
		
		//학번이 같은 학생 삭제
		Iterator<Student> ir = set.iterator();
		while(ir.hasNext()) {
			if(stuNum == ir.next().studentNum) {
				ir.remove();
			}
			
		}
		
		//전체 조회
		for(Student stu : set) {
			System.out.println(stu);
		}
		
		System.out.println();
		
		//전체 조회 - 조회는 이더레이터 보다 for문이 더 편함
//		Iterator<Student> iterator = set.iterator();
//		while(iterator.hasNext()) {
//			Student student = iterator.next();
//			System.out.println(student);
//		}
		
		
		
		
		
		
		
		
	}//main end

}//class end
