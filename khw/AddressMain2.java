package khw;

import java.util.List;
import java.util.Scanner;

public class AddressMain2 {

    public static void main(String[] args) {

        boolean run = true;
        Scanner sc = new Scanner(System.in);

        // DAO2로 변경
        AddressDao2 dao = new AddressDao2();

        while (run) {

            boolean found = false; 

            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("1.전체조회 | 2.이름조회 | 3.전화번호조회 | 4.생일조회 | 5.이름수정 | 6.친구추가 | 7.친구삭제 | 8.종료");
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.print("선택> ");

            int selectNo = Integer.parseInt(sc.nextLine());

            // 리스트 받아오기
            List<Address> list = dao.selectAll();

            switch (selectNo) {

            case 1:
                System.out.println("*************** 전체조회 ***************");
                for (Address a : list) {
                    a.showInfo();
                }
                break;

            case 2:
             System.out.print("조회할 이름 입력> ");
             String selectName = sc.nextLine();
             for (Address a : list) {
              if (a.getName().equals(selectName)) {
                a.showInfo();
                found = true;
                 };
               }

            if (!found)
              System.out.println("조회된 사람이 없습니다.");
            break;

            case 3:
                System.out.print("조회할 전화번호 입력> ");
                String selectPhone = sc.nextLine();
                for (Address a : list) {
                    if (a.getPhoneNum().equals(selectPhone)) {
                        a.showInfo();
                        found = true;
                    }
                }

                if (!found)
                    System.out.println("조회된 사람이 없습니다.");
                break;

            case 4:
                System.out.print("조회할 생일 6자리 입력> ");
                int selectBirth = Integer.parseInt(sc.nextLine());

                for (Address a : list) {
                    if (a.getBirth() == selectBirth) {
                        a.showInfo();
                        found = true;
                    }
                }

                if (!found)
                    System.out.println("조회된 사람이 없습니다.");
                break;

            case 5:
                System.out.print("수정할 이름 입력> ");
                String oldName = sc.nextLine();

                for (Address a : list) {
                    if (a.getName().equals(oldName)) {
                    System.out.print("새 이름 입력> ");
                    String newName = sc.nextLine();
                    a.setName(newName);
                    System.out.println("이름이 수정되었습니다.");
                    found = true;
                    }
                }

                if (!found)
                    System.out.println("조회된 사람이 없습니다.");
                break;

            case 6:
                run = false;
                break;

            default:
                System.out.println("번호를 다시 입력하세요.");
            }
        }

        System.out.println("프로그램 종료");
        sc.close();
    }
}