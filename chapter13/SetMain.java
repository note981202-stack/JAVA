package chapter13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		//set 생성
		Set<String> set = new HashSet<>();
		
		//추가
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		System.out.println(set.size());
		
		//반복자 이용 출력 - 삭제 등
		Iterator<String> ir = set.iterator();
				while(ir.hasNext()) {
					String obj = ir.next();
					System.out.println(obj);
				}
		
		//삭제
		set.remove("iBATIS");
		System.out.println(set.size());
			
		//향상된 for이용 - 조회만 가능
		for(String obj : set) {
			System.out.println(obj);
		}
		
		//jdbc 삭제
		ir = set.iterator();
		while(ir.hasNext()) {
			String str = ir.next();
			if(str.equals("JDBC")) {
				ir.remove();
			}
		}
		System.out.println();
		
		//조회
		for(String str : set) {
			System.out.println(str);
		}
		
		
		//전체 삭제
			set.clear();
			if(set.isEmpty()) {
				System.out.println("비어 있음");
			} else {
				System.out.println("객체 있음");
			}
	}

}
