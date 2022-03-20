package db7오류;

import java.sql.SQLException;

public class Departsel {
	
	public Departsel() {
	}

	public void select() {
		DepartDAO da = new DepartDAO();
		String st = "select * from department";
		try {
			da.pstmt = da.con.prepareStatement(st);
			da.rs = da.pstmt.executeQuery();			
			
			while(da.rs.next()) {
				int dptNo = da.rs.getInt(1);
				String dptName = da.rs.getString(2);
				String dptTel = da.rs.getString(3);
				
				System.out.format("%d\t\t\t %s\t\t\t %s\t\t\t\t\t\n",dptNo,dptName,dptTel);			

			}
			
			da.rs.close();
			da.pstmt.close();
			da.con.close();
			
		} catch (SQLException e) {
			System.out.println("오류발생");
			e.printStackTrace();
		}
	}

}
