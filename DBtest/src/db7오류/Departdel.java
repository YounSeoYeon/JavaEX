package db7����;

import java.sql.SQLException;
import java.util.Scanner;

public class Departdel {
	
	public Departdel() {
	}

	public void delet() {	
		Scanner sc = new Scanner(System.in);
		System.out.println("�а���������");
		System.out.println("�����Է� > ");
		String dptNo = sc.nextLine();
		
		String st = "delete from department where dptNo=? ";
		
		DepartDAO da = new DepartDAO();
		try {
			da.pstmt=da.con.prepareStatement(st);
			da.pstmt.setString(1, dptNo);	
			int result = da.pstmt.executeUpdate(st);
			
			if(result>0){
				System.out.println(result);
				System.out.println("��������");
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
