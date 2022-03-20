package db7오류;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DepartDAO {

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public DepartDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
			String user = "root";
			String pw = "1234";

			con = DriverManager.getConnection(url, user, pw);
			if(con!=null) {
				System.out.println("연동성공!");
			}
		
		} catch (Exception e) {
			System.out.println("오류발생");
			e.printStackTrace();
		}

	}

	public void dinsert(DepartDTO dt) {
		String st = "insert into department value(?,?,?)"; // 데이터베이스에 명령문넣을때 물음표!
		try {
			pstmt=con.prepareStatement(st);
			pstmt.setInt(1, dt.getDptNo());
			pstmt.setString(2, dt.getDptName());
			pstmt.setString(3, dt.getDptTel());			
			
			int result = pstmt.executeUpdate();
			if(result>0) {
				System.out.println(result);
				System.out.println("입력완료!");
			}
			
			pstmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.out.println("오류발생");
			e.printStackTrace();
		}
	}

	public void upd(DepartDTO dt) {
		String st = "update department set dptNo=?,dptName=?,dptTel=?";
		try {
			pstmt = con.prepareStatement(st);
			pstmt.setInt(1, dt.getDptNo());
			pstmt.setString(2, dt.getDptName());
			pstmt.setString(3, dt.getDptTel());
			
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				System.out.println(result);
				System.out.println("수정성공");
			}
			
			
			
			
		} catch (SQLException e) {
			System.out.println("오류발생");
			e.printStackTrace();
		}
		
	}

}
