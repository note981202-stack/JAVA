package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcInsert {

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
			
			//insert
				 
				//매개변수화된 SQL문 작성 
				 String sql = "" 
										  + "insert into test (bno, title, content, writer) " 
										  + "values (seq_bno.nextval, ?, ?, ?)";  
				 
				//preparedStatement 얻기/값 저장 - 실행문
				 PreparedStatement pstmt = conn.prepareStatement(sql);  
				 pstmt.setString(1, "테스트2"); 
				 pstmt.setString(2, "테스트 중입니다2 …"); 
				 pstmt.setString(3, "개발자22"); 
				 
				 //실행문을 실행
				 int rows = pstmt.executeUpdate();   //sql문 실행 
				 System.out.println("저장 행 수 : " + rows); 
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
