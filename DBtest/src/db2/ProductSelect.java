package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductSelect {

	public static void main(String[] args) {
			//db연동		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";
		
			Connection con = DriverManager.getConnection(url,user,pwd);
			if(con!=null) {
				System.out.println("연동 성공");
			}
			
			// sql문 문자열 생성
			String sql = "select * from product";
			
			// 쿼리문실행
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String prbNo = rs.getString(1);
				String prdName = rs.getString(2);
				int prdPrice = rs.getInt(3);
				String prdMaker = rs.getString(4);
				String prdColor = rs.getString(5);
				int ctgNo = rs.getInt(6);
			
			// 출력			
			System.out.format("%s\t %s\t\t\t %d\t\t %s\t %s\t\t %d\t \n",
					prbNo,prdName,prdPrice,prdMaker,prdColor,ctgNo);
			}
			
			rs.close();
			pstmt.close();
			con.close();
		
		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생!");
		}
	}

}
