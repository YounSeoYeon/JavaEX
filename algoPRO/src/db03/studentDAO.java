package db03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class studentDAO {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public studentDAO() {
		try {
			String url = "jdbc:mysql://localhost:3306/sqldb2?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";
			
			con = DriverManager.getConnection(url, user, pwd);
			
			if(con != null) {
				System.out.println("DB ���� ����!");
			}			
			
		} catch (Exception e) {
			System.out.println("���� �߻�!");
			e.printStackTrace();
		}
	}
	
	public ArrayList<studentDTO> selectStudent() {
		
		ArrayList<studentDTO> dateset = null;
		
		try {
			String sql = "select * from student order by stdNo";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
			dateset = new ArrayList<studentDTO>();
			
			while(rs.next()) {
				dateset.add(new studentDTO
						(rs.getString(1),
						rs.getString(2),
						rs.getInt(3),
						rs.getString(4),
						rs.getDate(5).toString(),
						rs.getString(6)
						)); 
			}
			
		} catch (Exception e) {
			System.out.println("���� �߻�");
			e.printStackTrace();
		}
		return dateset;
	}
	
	public void select() {
		studentDAO da = new studentDAO();
		ArrayList<studentDTO> dataset = new ArrayList<studentDTO>();
		dataset = da.selectStudent();
		System.out.println("\n���");
		
		for(studentDTO dto :dataset) {
			System.out.println(dto);
		}
	}
	
	public void insertStudent(studentDTO dto) {
		String sql = "insert into student value(?,?,?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getStdNo());
			pstmt.setString(2, dto.getStdName());
			pstmt.setInt(3, dto.getStdYear());
			pstmt.setString(4, dto.getStdAddress());
			pstmt.setString(5, dto.getStdBirthday());
			pstmt.setString(6, dto.getDptNo());
			
			int result = pstmt.executeUpdate();
			if(result>0)
				System.out.println("�Է¼���");			
			
		} catch (SQLException e) {
			System.out.println("����");
			e.printStackTrace();
		}
		
	}
	
}
