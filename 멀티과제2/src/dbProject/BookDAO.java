package dbProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDAO {
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public BookDAO() {		
		String url = "jdbc:mysql://localhost:3306/과제1?serverTimezone=UTC";
		String user = "root";
		String pwd = "1234";
		
		try {
			con = DriverManager.getConnection(url, user, pwd);
		
			if (con != null) {
				System.out.println("연동성공");
			}
		
		} catch (SQLException e) {
			System.out.println("오류발생");
			e.printStackTrace();
		}
	}

	public void insertBook(BookDTO dto) {
		String sql = "insert into book value (?,?,?,?,?,?)";		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getBookNo());
			pstmt.setString(2, dto.getBookTitle());
			pstmt.setString(3, dto.getBookAuthor());
			pstmt.setInt(4, dto.getBookYear());
			pstmt.setInt(5, dto.getBookPrice());
			pstmt.setString(6, dto.getBookPublisher());
			
			int result = pstmt.executeUpdate();
			
			if (result > 0) {
				System.out.println(result);
				System.out.println("데이터 입력 성공!");
			}

			pstmt.close();
			con.close();
		
		
		} catch (SQLException e) {
			System.out.println("오류발생");
			e.printStackTrace();
		}
	}

	public void selectproduct() {
		String sql = "select * from book";
		try {
			pstmt = con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				String bookNo = rs.getString(1);
				String bookTitle = rs.getString(2);
				String bookAuthor = rs.getString(3);
				int bookYear = rs.getInt(4);
				int bookPrice = rs.getInt(5);
				String bookPublisher = rs.getString(6);
				
				System.out.format("%s\t %s\t\t\t %s\t\t %d\t %d\t\t %s\t \n",
						bookNo,bookTitle,bookAuthor,bookYear,bookPrice,bookPublisher);
			}
			
			rs.close();
			pstmt.close();
			con.close();
			
			
		} catch (SQLException e) {
			System.out.println("오류발생");
			e.printStackTrace();
		}
		
	}
}
