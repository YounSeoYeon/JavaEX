package db4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDAO {
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public ProductDAO() {
		try {
			String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";
			
			con = DriverManager.getConnection(url, user, pwd);
			
			if(con != null) {
				System.out.println("DB 연결 성공!");
			}			
			
		} catch (Exception e) {
			System.out.println("오류 발생!");
			e.printStackTrace();
		}
	}

	public void selectproduct() {
		String sql = "select * from product";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
			
			while(rs.next()) {
				String a = rs.getString(1);
				String b = rs.getString(2);
				int c = rs.getInt(3);
				String d = rs.getString(4);
				String f = rs.getString(5);
				int g = rs.getInt(6);
				
				System.out.format("%-10s\t %-10s\t %-4d %-20s %13s %5d\n", 
						a,b,c,d,f,g);
			}
		
		
		
		} catch (SQLException e) {
			System.out.println("오류발생");
			e.printStackTrace();
		}
	}

	
	public void insertproduct(ProductDTO dto) {		
		try {			
			String sql = "insert into product value(?,?,?,?,?,?)";		
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, dto.getPrdNo());
			pstmt.setString(2, dto.getPrdName());
			pstmt.setInt(3, dto.getPrdPrice());
			pstmt.setString(4, dto.getPrdMaker());
			pstmt.setString(5, dto.getPrdColor());
			pstmt.setInt(6, dto.getCtgNo());
			
			int result = pstmt.executeUpdate();
			if(result>0)
				System.out.println("입력성공");	
			
			
			
		} catch (SQLException e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}
	}

}
