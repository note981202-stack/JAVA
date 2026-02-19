package chapter13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		//추가
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		//list크기
		int size = list.size(); //저장된 총 객체 수 얻기
		System.out.println("총 객체 수: " + size);
		System.out.println();
		
		
		String skill = list.get(2); //2번 인덱스의 객체 얻기
		System.out.println("2: " + skill);
		System.out.println();
		
		//list 출력 
		for(int i=0; i<list.size(); i++){ //저장된 총 객체 수만큼 루핑
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		System.out.println("삭제후 출력----------------");
		//삭제
		list.remove(1);
		list.remove("iBATIS");

		//전체삭제
		list.clear();
		if(list.isEmpty()) {
			System.out.println("비어있음");
		} else {
			System.out.println("비어있지 않음");
		}
		
		//향상 for문
		
		for(String ele : list) {
			System.out.println(ele);
		}
		
		//arrayList , LinkedList 처리 성능 비교
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime-startTime) + " ns");
		
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: " + (endTime-startTime) + " ns");
	}
	
	
	
}
