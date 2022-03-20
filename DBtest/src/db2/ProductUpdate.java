package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ProductUpdate {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			String a = sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			String d = sc.nextLine();
			String e = sc.nextLine();
			String f = sc.nextLine();

			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";

			Connection con = DriverManager.getConnection(url, user, pwd);
			if (con != null) {
				System.out.println("���� ����");
			}			
			
			String sql="update product set prdName=?, prdPrice=?, "
					+"prdMaker=?,prdColor=?,ctgNo=? where prdNo=?";
			
			PreparedStatement pstmt = con.prepareStatement(sql);			

			pstmt.setString(1, b);
			pstmt.setInt(2, Integer.parseInt(c));
			pstmt.setString(3, d);
			pstmt.setString(4, e);
			pstmt.setInt(5, Integer.parseInt(f));		
			pstmt.setString(6, a);		
			
			int result = pstmt.executeUpdate();
			if(result>0) {
				System.out.println(result);
				System.out.println("��������!");
			}
			
			pstmt.close();
			con.close();
			sc.close();
			

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("���� �߻�");
		}

	}

}
