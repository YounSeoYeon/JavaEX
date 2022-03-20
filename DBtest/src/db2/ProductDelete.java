package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ProductDelete {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
					
			System.out.print("삭제할 제품번호 입력 : ");
			String prdNo = sc.nextLine();		
			
			
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";
			
			Connection con = DriverManager.getConnection(url, user, pwd);
			if (con != null) {
				System.out.println("연동 성공");
			}
			
			String sql = "delete from product where prdNo=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, prdNo);
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println(result);
				System.out.println("데이터 삭제 성공!");				
			}
			
			pstmt.close();
			con.close();
			sc.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류발생");
		}
	}

}
