package db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

//�ֿܼ��� ������ �Է� �޾Ƽ�
//���� ���̺� ����

public class BookInsertInputEx {

	public static void main(String[] args) {
		try {
		//�Է�
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String b = sc.nextLine();
		String c = sc.nextLine();
		String d = sc.nextLine();
		String e = sc.nextLine();
		String f = sc.nextLine();
		String g = sc.nextLine();		
		
		//DB����
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/sqldb3?serverTimezone=UTC";
		String user = "root";
		String pwd = "1234";	
		
		Connection con = DriverManager.getConnection(url,user,pwd);
		if(con!=null)
			System.out.println("DB���� ����!");
		
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
			System.out.println("�Է� ����!");
		}
		
		pstmt.close();
		con.close();
		sc.close();
		
		}		
		catch (Exception e) {
			System.out.println("���� �߻�!");
			e.printStackTrace();
		}
		
		//DB������
	}

}
