package khw; //친구의 정보를 저장

public class Address {
	//친구 객체 만드는 클래스
	//이름, 주소, 전화번호, 생일.......
	
	//필드
		String name;
		String address;
		String phoneNum;
		int birth;
		
		//생성자
		public Address(String name, String address, String phoneNum, int birth) {
			this.name = name;
			this.address = address;
			this.phoneNum = phoneNum;
			this.birth = birth;
		}
		
		//친구 정보 가져오기
		public void showInfo() {
			System.out.printf("%-5s\t %-22s\t %-10s\t %-5d\n\n" , name, address, phoneNum, birth);
		}
		
		//매서드
//		public void showInfo() {
//		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPhoneNum() {
			return phoneNum;
		}

		public void setPhoneNum(String phoneNum) {
			this.phoneNum = phoneNum;
		}
		
		public int getBirth() {
			return birth;
		}

		public void setBirth(int birth) {
			this.birth = birth;
		}
		

		
		
	}// Address end
	
	


