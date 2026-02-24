package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConn {

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
