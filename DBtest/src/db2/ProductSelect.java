package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductSelect {

	public static void main(String[] args) {
			//db����		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";
		
			Connection con = DriverManager.getConnection(url,user,pwd);
			if(con!=null) {
				System.out.println("���� ����");
			}
			
			// sql�� ���ڿ� ����
			String sql = "select * from product";
			
			// ����������
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String prbNo = rs.getString(1);
				String prdName = rs.getString(2);
				int prdPrice = rs.getInt(3);
				String prdMaker = rs.getString(4);
				String prdColor = rs.getString(5);
				int ctgNo = rs.getInt(6);
			
			// ���			
			System.out.format("%s\t %s\t\t\t %d\t\t %s\t %s\t\t %d\t \n",
					prbNo,prdName,prdPrice,prdMaker,prdColor,ctgNo);
			}
			
			rs.close();
			pstmt.close();
			con.close();
		
		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("���� �߻�!");
		}
	}

}
