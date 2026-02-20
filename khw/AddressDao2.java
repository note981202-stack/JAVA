package khw;

import java.util.ArrayList;
import java.util.List;

public class AddressDao2 { // 저장용 클래스

    // 배열 대신 List 사용
    private List<Address> friends = new ArrayList<>();

    // 생성자에서 데이터 초기화
    public AddressDao2() {

        friends.add(new Address("김민수", "서울특별시 강남구 테헤란로 123", "010-1234-5678", 940102));
        friends.add(new Address("이서연", "서울특별시 송파구 올림픽로 45", "010-2345-6789", 970315));
        friends.add(new Address("박지훈", "부산광역시 해운대구 해운대로 78", "010-3456-7890", 920811));
        friends.add(new Address("최은지", "대구광역시 수성구 달구벌대로 210", "010-4567-8901", 990427));
        friends.add(new Address("정우성", "인천광역시 연수구 센트럴로 88", "010-5678-9012", 910203));
        friends.add(new Address("한지민", "광주광역시 서구 상무대로 56", "010-6789-0123", 950622));
        friends.add(new Address("오태준", "대전광역시 유성구 대학로 101", "010-7890-1234", 930918));
        friends.add(new Address("윤하늘", "울산광역시 남구 삼산로 33", "010-8901-2345", 880131));
        friends.add(new Address("장현우", "세종특별자치시 한누리대로 99", "010-9012-3456", 960514));
        friends.add(new Address("임다영", "경기도 수원시 영통구 봉영로 140", "010-1122-3344", 981129));
        friends.add(new Address("강도윤", "경기도 성남시 분당구 판교역로 235", "010-2233-4455", 940905));
        friends.add(new Address("신예린", "경기도 고양시 일산동구 중앙로 1500", "010-3344-5566", 910212));
        friends.add(new Address("조민재", "경상남도 창원시 성산구 중앙대로 120", "010-4455-6677", 920304));
        friends.add(new Address("백수빈", "전라북도 전주시 덕진구 백제대로 567", "010-5566-7788", 990110));
        friends.add(new Address("황서준", "충청북도 청주시 상당구 상당로 77", "010-6677-8899", 950823));
        friends.add(new Address("서아린", "강원특별자치도 춘천시 중앙로 12", "010-7788-9900", 921204));
        friends.add(new Address("노현석", "제주특별자치도 제주시 첨단로 242", "010-8899-0011", 930707));
        friends.add(new Address("문가영", "경상북도 포항시 북구 중앙로 300", "010-9900-1122", 970916));
        friends.add(new Address("배준호", "충청남도 천안시 서북구 불당대로 50", "010-1357-2468", 940401));
        friends.add(new Address("김하윤", "전라남도 여수시 여서로 89", "010-2468-1357", 780523));
    }

    
    
    // 전체 조회 메서드
    public List<Address> selectAll() {
        return friends;
    }
    
    //추가 메서드
    public void add(String name, String address, String phoneNum, int birth) {
    	Address newFriend = new Address(name, address, phoneNum, birth);
    	friends.add(newFriend);
    }
    
    //삭제 메서드
    public boolean remove(String name) {
    	for(int i=0; i<friends.size(); i++) {
    		if(friends.get(i).getName().equals(name)) {
    			friends.remove(i);
    			return true;
    		}
    	}
    	return false;
    }
}