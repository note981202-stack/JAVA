package chapter11;

public class ClassClazz {

	public static void main(String[] args) throws Exception {
//		Class<Member> clazz = Member.class;
//		Class<?> clazz = Class.forName("chapter11.Member");
		Member member = new Member("hong","홍길동");
		Class<?> clazz = member.getClass();
		
		System.out.println(clazz.getName()); // chapter11.Member라고 출력됨
		System.out.println(clazz.getPackageName()); // chapter11이 출력됨
		System.out.println(clazz.getSimpleName());// 클래스 이름만 출력됨 = Member라고만 출력됨
		
		String p1Path = clazz.getResource("강아지.png").getPath(); // 강아지 이미지가 출력됨
		System.out.println(p1Path);
		
		String p2Path = clazz.getResource("img/강아지.png").getPath();
		System.out.println(p2Path);
	}

}
