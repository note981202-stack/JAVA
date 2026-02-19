package chapter11;

public class Member {
	//필드
	public String id;
	public String name;
	
	//생성자
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//메서드
	@Override //--equals 재정의
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(member.id.equals(id))
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return id + ":" + name;
	}
} //end class
