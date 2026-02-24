package chapter13;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // 게터, 세터, 이퀄 헤시코드, 투스트링 등
@NoArgsConstructor // 기본생성자
@AllArgsConstructor // 모든생성자

public class Board {
	private String title;
	private String content;
	private String writer;
	
	
//	public Board(String title, String content, String writer) {
//		this.title = title;
//		this.content = content;
//		this.writer = writer;
//	}
	
	//getter, setter
//	public void setWriter(String writer) {
//		this.writer = writer;
//		}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	public void setContent(String content) {
//		this.content = content;
//	}
//
//	
//	public String getTitle() {return title;}
//	public String getContent() {return content;}
//	public String getWriter() {return writer;}
	
} // class end
