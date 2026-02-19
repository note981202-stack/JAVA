package khw; //실행이 되는 파일

import java.util.Scanner;

public class AddressMain {

	public static void main(String[] args) {
		//메뉴 : 전체 조회 / 이름 조회 / 전화 번호 조회 /....../ 종료
		//배열을 전달받아서 처리
		boolean run = true;
		boolean found = false;
		Scanner sc = new Scanner(System.in);
		AddressDao dao = new AddressDao();
		
		Address[] list = dao.selectAll();
		
		while(run) {
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("1.전체조회 | 2.이름으로 조회 | 3.전화번호로 조회 | 4.생일로 조회 | 5.이름수정하기 | 6.종료");
			System.out.println("---------------------------------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			switch(selectNo) {
			case 1:
				//전체조회
				System.out.println("****************************************************************");
				System.out.println("                             전체조회");
				System.out.println("****************************************************************");
				for (int i = 0; i < list.length; i++) {
          list[i].showInfo();
				}
				break;
				
			case 2: // 동명이인 모두 출력되게 만들어 보기
				//이름조회 - 이름 입력하면 그 사람 정보만 출력
				System.out.println("---------------------------");
				System.out.print("조회할 분의 이름을 입력하세요> ");
				String selectName = sc.nextLine();
				
				System.out.println();
				for(int i=0; i<list.length; i++) {
					if(list[i].getName().equals(selectName)) {
						list[i].showInfo();
						found = true;
					};
				}
				
				if(!found) {
					System.out.println("조회된 사람이 없습니다");
				}
				break;
				
				case 3:
					//전화 번호 조회 - 전화번호 입력하면 그 사람의 정보만 출력되게
					System.out.println("---------------------------");
					System.out.print("조회할 분의 전화번호를 입력하세요> ");
					String selectPhoneNum = sc.nextLine();
					System.out.println();
					
					
					
					for(int i=0; i<list.length; i++) {
						if(list[i].getPhoneNum().equals(selectPhoneNum)) {
							list[i].showInfo();
							found = true;
						}
					}
					
					if(!found) {
						System.out.println("조회된 사람이 없습니다");
					}
				break;
				
				case 4:
					//생일 조회 - 생일입력하면 그 사람의 정보만 출력되게
					System.out.println("---------------------------");
					System.out.println("생일 6자리를 입력해주세요> ");
					int selectBirth = Integer.parseInt(sc.nextLine());
					System.out.println();
					
					
					
					for(int i=0; i<list.length; i++) {
						if(list[i].getBirth() == selectBirth) {
							list[i].showInfo();
							found = true;
						}
					}
					
					if(!found) {
						System.out.println("조회된 사람이 없습니다");
					}
					
				break;
				
				case 5: //이름 수정하기
					System.out.println("---------------------------");
					System.out.print("수정할 분의 이름을 입력해주세요> ");
					String oldName = sc.nextLine();
					
					found =false;
					
					System.out.println();
					for(int i=0; i<list.length; i++) {
						if(list[i].getName().equals(oldName)) {
							System.out.print("수정하려는 이름을 입력하세요>");
							String newName = sc.nextLine();
							
							list[i].setName(newName);
							System.out.println("이름이 수정되었습니다");
							
							found = true;
						}
					}
							
							if(!found) {
								System.out.println("조회된 사람이 없습니다");
							
						}
					
					break;
					
				 case 6:
					run = false;
			}//switch end
		}
		System.out.print("프로그램 종료");
		sc.close();

		
		
		} // main end
	
} //class end
