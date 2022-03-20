package db3;

import java.util.Scanner;

public class studentEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// DAO 객체 생성하면서 DB 연결 
		// 객체 생성될 때 생성자 호출되면서 DB 연결
		studentDAO stdDAO = new studentDAO();
		
		// (1)학생 데이터 입력
		System.out.println("학생 정보 등록");
		System.out.println("학번 입력 : ");
		String a = sc.nextLine();
		
		System.out.println("성명 입력 : ");
		String b = sc.nextLine();
		
		System.out.println("학년 입력 : ");
		String c = sc.nextLine();
		int c1 = Integer.parseInt(c);
		
		System.out.println("주소 입력 : ");
		String d = sc.nextLine();
		
		System.out.println("생년월일 입력 : ");
		String f = sc.nextLine();
		
		System.out.println("학과번호 입력 : ");
		String g = sc.nextLine();
		
		
		//studentDTO 객체생성		
		//생성과 동시에 값저장 : 생성자 호출하면서 값 저장
		studentDTO dto = new studentDTO(a,b,c1,d,f,g);		

		//studentDAO 클래스의 insertstudent()메서드 호출하면서 stdDTO전달
		stdDAO.insertStudent(dto);		
		
		// (2)학생 정보 조회 : StudentDAO 클래스의 selectStudent() 메서드 호출
		//객체.메서드
		stdDAO.selectStudent();
	}

}
