package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDelete {

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
			
			
			
			//delete
				//매개변수화된 SQL문 작성 
				 String sql = "" 
											  + "delete from test " 
											  + "where bno = ?";  //##주의 전체 삭제 되지 않도록 where절 적어야 함
				 
				//preparedStatement 얻기/값 저장 
				 PreparedStatement pstmt = conn.prepareStatement(sql); 
				 pstmt.setInt(1, 3); //bno 3번 삭제
				 
				//sql문 실행 
				 int rows = pstmt.executeUpdate(); 
				 if(rows == 1) { 
				  System.out.println("삭제 행 수 : " + rows); 
				 }else { 
				  System.out.println("삭제 실패"); 
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
