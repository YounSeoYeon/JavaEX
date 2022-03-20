package db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

//콘솔에서 데이터 입력 받아서
//도서 테이블에 저장

public class BookInsertInputEx {

	public static void main(String[] args) {
		try {
		//입력
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String b = sc.nextLine();
		String c = sc.nextLine();
		String d = sc.nextLine();
		String e = sc.nextLine();
		String f = sc.nextLine();
		String g = sc.nextLine();		
		
		//DB연동
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/sqldb3?serverTimezone=UTC";
		String user = "root";
		String pwd = "1234";	
		
		Connection con = DriverManager.getConnection(url,user,pwd);
		if(con!=null)
			System.out.println("DB연동 성공!");
		
		String sql = "insert into book value(?,?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, a);
		pstmt.setString(2, b);
		pstmt.setString(3, c);
		pstmt.setInt(4, Integer.parseInt(d));
		pstmt.setString(5, e);
		pstmt.setInt(6, Integer.parseInt(f));
		pstmt.setString(7, g);
		
		int result = pstmt.executeUpdate();
		
		if(result>0) {
			System.out.println(result);
			System.out.println("입력 성공!");
		}
		
		pstmt.close();
		con.close();
		sc.close();
		
		}		
		catch (Exception e) {
			System.out.println("오류 발생!");
			e.printStackTrace();
		}
		
		//DB에저장
	}

}
