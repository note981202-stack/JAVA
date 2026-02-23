package chapter13;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
		List<Board> list = new ArrayList<>();
	
		//메서드 생성
		
public List<Board> getBoardList(){
	//list의 데이터 추가
	list.add(new Board("오늘 점심 역대급 급식 메뉴 인증", "돈가스 산처럼 쌓아주고 제육볶음까지 무한리필로 주는 우리 회사 식당 클라스", "급식매니아"));
	list.add(new Board("드디어 자바 프로젝트 끝!", "3일 밤샘 끝에 CRUD 완성... 이제 좀 사람처럼 잘 수 있을 듯", "코딩노예"));
	list.add(new Board("비 오는 날엔 역시 파전", "퇴근길에 막걸리 한잔하면서 듣는 빗소리, 이게 바로 힐링이지", "막걸리러버"));
	list.add(new Board("헬스 3개월 차 변화", "체중은 그대로인데 근육은 늘어난 느낌? 거울 보는 맛이 있음", "득근중"));
	list.add(new Board("주말 순삭 당함", "분명 금요일이었는데 눈 떠보니 월요일인 건 기분 탓인가", "월요병환자"));
	list.add(new Board("정보처리기사 공부 시작", "이론 범위 왜 이렇게 넓냐... 그래도 합격 가보자", "자격증도전"));
	list.add(new Board("카페에서 코딩하기", "이어폰 끼고 노트북 펼치면 나도 왠지 개발자 느낌", "감성코더"));
	list.add(new Board("운동 가기 싫다", "헬스장까지 가는 게 제일 힘들지 막상 가면 또 할만함", "귀차니즘"));
	list.add(new Board("퇴사 마렵다", "출근 5분 만에 집 가고 싶은 사람 나뿐이냐", "현타맨"));
	list.add(new Board("치킨 신메뉴 후기", "기대 안 했는데 의외로 존맛탱, 재구매 의사 있음", "치킨평론가"));
	list.add(new Board("토익 점수 발표날", "심장 터질 뻔... 그래도 생각보다 잘 나와서 다행", "영어탈출기"));
	list.add(new Board("야근의 연속", "해 뜨기 전에 퇴근하는 삶... 이게 맞나 싶다", "회사원A"));
	list.add(new Board("봄 여행 계획 중", "제주도 갈지 부산 갈지 행복한 고민 중", "여행러"));
	list.add(new Board("새 노트북 장만", "부팅 속도 미쳤다... 진작 바꿀 걸 그랬네", "장비병"));
	list.add(new Board("코딩하다가 깨달은 것", "에러는 날 괴롭히려고 있는 게 아니라 성장시키려고 있는 것 같다", "성장중"));
	
	return list;
	} // list end

	//추가
	public boolean insertBoardList(String title, String content, String writer) {
		list.add(new Board(title, content, writer));
		
		return true;
	}


	//조회
	public void searchBoardList(String writer) {
		List<Board> searchInfo = new ArrayList<>();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getWriter().equals(writer)) {
				System.out.printf("%d. %s | %s | %s\n", i+1, list.get(i).getTitle(), list.get(i).getContent(),list.get(i).getWriter());
			}
		}
	}


	//제목 수정
	public void changeTitle(int idx, String title) {
		list.get(idx).setTitle(title);		
	}


	//내용 수정
	public void changeContent(int idx, String content) {
		list.get(idx).setContent(content);		
	}

	//삭제
	public void delBoardList(int idx) {
		list.remove(idx);
	}
	
	
}
