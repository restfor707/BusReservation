package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import application.Util.DbSingleton;

public class UserDAO {
	public static Connection con;
	public static PreparedStatement pstmt;
	public static ResultSet rs;
	public static Statement st;
	
	public UserDAO() {
		con = DbSingleton.getInstance();
	}
	
	public int register(UserVO userVO) {
		int res = 0;
		
		try {
			String sql = "insert into bus_user values(?,?,?,?,?,?)";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, userVO.getId());
			pstmt.setString(2, userVO.getPwd());
			pstmt.setString(3, userVO.getName());
			pstmt.setString(4, userVO.getAddress());
			pstmt.setString(5, userVO.getPhone());
			pstmt.setString(6, userVO.getEmail());
			
			res = pstmt.executeUpdate();
			System.out.println("회원가입 완료 : " + sql);
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return res;
	}
}
