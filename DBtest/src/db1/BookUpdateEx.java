package db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class BookUpdateEx {

	public static void main(String[] args) {
		try {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("도서정보수정");
		String a = sc.nextLine();
		String b = sc.nextLine();
		String c = sc.nextLine();
		String d = sc.nextLine();
		String e = sc.nextLine();
		String f = sc.nextLine();
		String g = sc.nextLine();
		
		String url = "jdbc:mysql://localhost:3306/sqldb3?serverTimezone=UTC";
		String user = "root";
		String pwd = "1234";
		Connection con = DriverManager.getConnection(url, user, pwd);
		
		if(con != null) {
			System.out.println("DB 연결 성공!");
		}	
		
		String sql="update book set bookName=?, bookAuthor=?, "
					+"bookPrice=?,bookDate=?,bookStock=?,pubNo=? where bookNo=?";
		
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, b);
		pstmt.setString(2, c);
		pstmt.setInt(3, Integer.parseInt(d));
		pstmt.setString(4, e);
		pstmt.setInt(5, Integer.parseInt(f));
		pstmt.setString(6, g);		
		pstmt.setString(7, a);
		
		int result = pstmt.executeUpdate();
		if(result>0) {
			System.out.println(result);
			System.out.println("수정성공!");
		}
		
		pstmt.close();
		con.close();
		sc.close();
		
		
		
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
