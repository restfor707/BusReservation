package application.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {
	private static Connection con = null;
	
	private DbSingleton() {}
	public static Connection getInstance() {
		String DRIVER = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		if(con == null) {
			try {
				Class.forName(DRIVER);
				System.out.println("드라이브 로딩 성공");
				con = DriverManager.getConnection(url, "scott", "tiger");
				
				
			} catch (ClassNotFoundException e) {
				System.out.println("드라이브를 찾을 수 없습니다. : " + e.getMessage());
			} catch (SQLException e) {
				System.out.println("DB 접속 에러 : " + e.getMessage());
			} 
		}
		
		return con;
	}
	
	public static void close() {
		try {
			if(con != null) con.close();
		} catch(Exception e) {
			
		}
	}
}
