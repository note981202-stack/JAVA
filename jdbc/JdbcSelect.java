package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcSelect {

	public static void main(String[] args) {
		Connection conn = null;
		try { 
			// jdbc driver 메모리에 등록, DriverManager에 객체 등록
			Class.forName("oracle.jdbc.OracleDriver");
		// db 연결 
			conn = DriverManager.getConnection( 
				  "jdbc:oracle:thin:@localhost:1521/xe", 
				  "java", 
				  "1234" 
				 ); 
				 System.out.println("연결 성공"); 
			
			//db 작업 - CRUD 하면 됨
			
			
			
			//select 
				//매개변수화된 SQL문 작성 
				 String sql = "select * from test "
				 							+ "where writer = ?"; 
				 
				//preparedStatement 얻기/값 저장 
				 PreparedStatement pstmt = conn.prepareStatement(sql); 
				 pstmt.setString(1, "summer"); // 가져올 부분만 조회 
				 
				//sql문 실행 
				 ResultSet rs = pstmt.executeQuery(); //select는 excuteQurey로 작성함 update아님
				 
				//list에 저장 
				List<Test> list = new ArrayList<Test>(); 
				 
				while(rs.next()) { 
				 int bno = rs.getInt("bno"); 
				 String title = rs.getString("title"); 
				 String content = rs.getString(3); 
				 String writer = rs.getString(4); 
				 
				 list.add(new Test(bno, title, content, writer)); 
				}

				//출력
				for(Test data : list) { 
					 System.out.println(data); 
					} 
					pstmt.close(); 
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { 
		  if(conn != null) { 
		    try { 
		     conn.close(); 
		    } catch (SQLException e) { 
		     e.printStackTrace(); 
		    } 
		    System.out.println("연결 끊기"); //항상 연결 끊어야 함
		   } 
		  }
		
		
	} // end main

}
