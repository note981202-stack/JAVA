package chapter07;

public class LoginServlet extends HttpServlet {
	@Override
	public void service() {  // 재정의
		System.out.println("로그인 합니다");
	}
}
