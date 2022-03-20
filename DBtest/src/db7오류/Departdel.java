package db7오류;

import java.sql.SQLException;
import java.util.Scanner;

public class Departdel {
	
	public Departdel() {
	}

	public void delet() {	
		Scanner sc = new Scanner(System.in);
		System.out.println("학과정보삭제");
		System.out.println("순번입력 > ");
		String dptNo = sc.nextLine();
		
		String st = "delete from department where dptNo=? ";
		
		DepartDAO da = new DepartDAO();
		try {
			da.pstmt=da.con.prepareStatement(st);
			da.pstmt.setString(1, dptNo);	
			int result = da.pstmt.executeUpdate(st);
			
			if(result>0){
				System.out.println(result);
				System.out.println("삭제성공");
			}
		
			da.pstmt.close();
			da.con.close();
			sc.close();

		} catch (SQLException e) {
			System.out.println("오류발생");
			e.printStackTrace();
		}
	}

}
