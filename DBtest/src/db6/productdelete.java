package db6;

import java.sql.SQLException;
import java.util.Scanner;

public class productdelete {

	public void delete() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ��ǰ��ȣ �Է� : ");
		String prdNo = sc.nextLine();		
		
		productDAO da = new productDAO();
		String sql = "delete from product where prdNo=?";
		
		try {
			da.pstmt = da.con.prepareStatement(sql);
			da.pstmt.setString(1, prdNo);
			int result = da.pstmt.executeUpdate();
		
			if(result > 0) {
				System.out.println(result);
				System.out.println("������ ���� ����!");				
			}
			
			da.pstmt.close();
			da.con.close();
			sc.close();
				
		
		} catch (SQLException e) {
			System.out.println("�����߻�");
			e.printStackTrace();
		}
	}

}
