package chapter13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MemberMain {

	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<Member>();
		
		//객체 5개 추가
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		set.add(new Member("김첨지", 30));
		set.add(new Member("임꺽정", 30));
		set.add(new Member("홍길동", 30));
		
		System.out.println("총 객체 수 : " + set.size());
		
		//전체 출력
		for(Member obj : set) {
			System.out.println(obj);
		}
		
		//객체 삭제 후 출력
		Iterator<Member> ir = set.iterator();
		while(ir.hasNext()) {
		Member obj = ir.next();
		if(obj.name.equals("김첨지")) {
			ir.remove();
		}
		
		System.out.println(obj);
		};
	}
}
		
		


