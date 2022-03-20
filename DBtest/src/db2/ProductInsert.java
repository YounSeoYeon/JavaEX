package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProductInsert {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";

			Connection con = DriverManager.getConnection(url, user, pwd);
			if (con != null) {
				System.out.println("���� ����");
			}

			String prbNo = "1016";
			String prdName = "������";
			int prdPrice = 200000;
			String prdMaker = "�Ｚ";
			String prdColor = "�׸�";
			int ctgNo = 5;

			String sql = "insert into product value(?,?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setString(1, prbNo);
			pstmt.setString(2, prdName);
			pstmt.setInt(3, prdPrice);
			pstmt.setString(4, prdMaker);
			pstmt.setString(5, prdColor);
			pstmt.setInt(6, ctgNo);

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println(result);
				System.out.println("������ �Է� ����!");
			}

			pstmt.close();
			con.close();
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
