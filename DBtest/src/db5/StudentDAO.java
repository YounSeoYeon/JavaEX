package db5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO {

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public StudentDAO() {
		try {
			String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";

			con = DriverManager.getConnection(url, user, pwd);

			if (con != null) {
				System.out.println("DB 연결 성공!");
			}

		} catch (Exception e) {
			System.out.println("오류 발생!");
			e.printStackTrace();
		}
	}

	public void selectStudent() {
		String sql = "select * from student";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);

			while (rs.next()) {
				String stdNo = rs.getString(1);
				String stdName = rs.getString(2);
				int stdYear = rs.getInt(3);
				String stdAddress = rs.getString(4);
				String stdBirthday = rs.getString(5);
				String dtpNo = rs.getString(6);

				System.out.format("%-10s\t %-10s\t %-4d %-20s %13s %5s\n", stdNo, stdName, stdYear, stdAddress,
						stdBirthday, dtpNo);
			}

		} catch (SQLException e) {
			System.out.println("오류발생");
			e.printStackTrace();
		}
	}

	public void insertproduct(StudentDTO dto) {
		String sql = "insert into Student value(?,?,?,?,?,?)";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getStdNo());
			pstmt.setString(2, dto.getStdName());
			pstmt.setInt(3, dto.getStdYear());
			pstmt.setString(4, dto.getStdAddress());
			pstmt.setString(5, dto.getStdBirthDay());
			pstmt.setString(6, dto.getDptNo());

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println(result);
				System.out.println("데이터 입력 성공!");
			}

			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateStudent(StudentDTO dto) {
		String sql = "update student set stdName=?, stdYear=?, stdAddress=?, stdBirthday=?, dptNo=? where stdNo=? ";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getStdName());
			pstmt.setInt(2, dto.getStdYear());
			pstmt.setString(3, dto.getStdAddress());
			pstmt.setString(4, dto.getStdBirthDay());
			pstmt.setString(5, dto.getDptNo());
			pstmt.setString(6, dto.getStdNo());

			int result = pstmt.executeUpdate();
			
			if (result > 0) {
				System.out.println(result);
				System.out.println("수정성공!");
			}

		} catch (SQLException e) {
			System.out.println("오류발생");
			e.printStackTrace();
		}
	}

	public void deleteStudent(StudentDTO dto) {
		String sql = "delete from student where stdNo=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getStdNo());

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println(result);
				System.out.println("데이터 삭제 성공!");
			}
			
		} catch (SQLException e) {
			System.out.println("오류발생");
			e.printStackTrace();
		}

	}

}
