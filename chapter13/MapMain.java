package chapter13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		//맵 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		//테이터 추가
		map.put("신용권", 85 );
		map.put("홍길동", 90 );  //이 홍길동은 출력이 안 됨
		map.put("동장군", 80 );
		map.put("홍길동", 95 );  //최신의 홍길동만 출력이 됨 
		System.out.println("총 Entry 수: " + map.size());
		
		//키셋 출력 향상 for문이랑 동일
		Set<String> keySet = map.keySet();//키셋 집합
		Iterator<String> keyIterator = keySet.iterator(); //반복자 생성
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(" " + key + " : " + value);
		}
		System.out.println();
		
		System.out.println("향상된 for문으로 출력"); //위의 코드랑 동일
		for(String key : keySet) {
			System.out.printf("%s : %d\n" , key , map.get(key));
		}
		
		System.out.println();
		//삭제
			map.remove("홍길동");
		
		//엔트리 출력 (삭제된 후의 출력) 아래 향상for문이랑 동일
			System.out.println("삭제 후 출력");
			Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
			Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
			
			while(entryIterator.hasNext()) {
				Map.Entry<String, Integer> entry = entryIterator.next(); //가져옴
				String key = entry.getKey();
				Integer value = entry.getValue();
				System.out.println(" " + key + " : " + value);
			}
			
			System.out.println();
			
			System.out.println("향상된 for문 출력"); //위의 코드랑 동일
			for(Map.Entry<String, Integer> entry : entrySet) {
				System.out.printf("%s : %d\n" , entry.getKey() , entry.getValue());
			}
			
			//크기
			System.out.println("사이즈는" + map.size() + "입니다");
			
//			//전체 삭제
//			map.clear();
//			if(map.isEmpty())
			
			
			
			
			
	} // end main

} // end class
