package chapter07;

public class FileDownloadServlet extends HttpServlet {
	@Override 
	public void service() { //재정의
		System.out.println("파일 다운로드 합니다");
	}
}
