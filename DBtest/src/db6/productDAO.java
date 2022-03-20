package db6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class productDAO {

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public productDAO() {

		String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
		String user = "root";
		String pwd = "1234";

		try {
			con = DriverManager.getConnection(url, user, pwd);
			if (con != null) {
				System.out.println("연동성공");
			}

		} catch (SQLException e) {
			System.out.println("오류발생");
			e.printStackTrace();
		}
	}

	public void prinsert(productDTO dto) {
		String sql = "insert into product value(?,?,?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, dto.getPrdNo());
			pstmt.setString(2, dto.getPrdName());
			pstmt.setInt(3, dto.getPrdPrice());
			pstmt.setString(4, dto.getPrdMaker());
			pstmt.setString(5, dto.getPrdColor());
			pstmt.setInt(6, dto.getCtgNo());

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println(result);
				System.out.println("데이터 입력 성공!");
			}

			pstmt.close();
			con.close();

		} catch (SQLException e) {
			System.out.println("오류발생");
			e.printStackTrace();
		}
	}

	public void update(productDTO dto) {
		String sql = "update product set prdName=?, prdPrice=?, " +
					"prdMaker=?,prdColor=?,ctgNo=? where prdNo=? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getPrdName());
			pstmt.setInt(2, dto.getPrdPrice());
			pstmt.setString(3, dto.getPrdMaker());
			pstmt.setString(4, dto.getPrdColor());
			pstmt.setInt(5, dto.getCtgNo());
			pstmt.setString(6, dto.getPrdNo());
			
			int result = pstmt.executeUpdate();
			if(result>0) {
				System.out.println(result);
				System.out.println("수정성공!");
			}

		} catch (SQLException e) {
			System.out.println("오류발생");
			e.printStackTrace();
		}
	}

}
