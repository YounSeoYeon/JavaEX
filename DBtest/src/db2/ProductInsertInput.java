package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ProductInsertInput {

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
		
			Connection con = DriverManager.getConnection(url,user,pwd);
			if(con!=null) {
				System.out.println("연동 성공");
			}
			
			String sql = "insert into product value(?,?,?,?,?,?)";			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, a);
			pstmt.setString(2, b);
			pstmt.setInt(3, Integer.parseInt(c));
			pstmt.setString(4, d);
			pstmt.setString(5, e);
			pstmt.setInt(6, Integer.parseInt(f));
			
			int result = pstmt.executeUpdate();
			if(result>0) {
				System.out.println(result);
				System.out.println("입력 성공!");
			}
		
			pstmt.close();
			con.close();
			sc.close();	
		
		
		} catch (Exception e) {
			System.out.println("오류발생!");
			e.printStackTrace();
		}
	}

}
