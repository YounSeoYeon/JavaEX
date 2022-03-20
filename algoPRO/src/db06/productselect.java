package db06;

import java.sql.SQLException;

public class productselect {
	
	public productselect() {
	}

	public void select() {
		productDAO da = new productDAO();
		String sql = "select * from product";
		try {
			da.pstmt = da.con.prepareStatement(sql);
			da.rs = da.pstmt.executeQuery();
			
			while(da.rs.next()) {
				String prbNo = da.rs.getString(1);
				String prdName = da.rs.getString(2);
				int prdPrice = da.rs.getInt(3);
				String prdMaker = da.rs.getString(4);
				String prdColor = da.rs.getString(5);
				int ctgNo = da.rs.getInt(6);
				
				System.out.format("%s\t %s\t\t\t %d\t\t %s\t %s\t\t %d\t \n",
						prbNo,prdName,prdPrice,prdMaker,prdColor,ctgNo);
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
