package db5;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentDAO dao = new StudentDAO();
		
		System.out.println("학생 관리 프로그램");
		System.out.println("-----------------");
		System.out.println("1.학생등록");
		System.out.println("2.학생정보조회");
		System.out.println("3.학생정보수정");
		System.out.println("4.학생정보삭제");
		System.out.println("5.종료");
		System.out.println("-----------------");
		System.out.print("메뉴번호입력 : ");
		
		String menu = sc.nextLine();
		System.out.println();
		
		switch(menu) {
		case "1":
			System.out.println("정보입력");
			System.out.println("학번 입력 : ");
			String stdNo = sc.nextLine();
			
			System.out.println("이름 입력 : ");
			String stdName = sc.nextLine();
			
			System.out.println("학년 입력 : ");
			String stdYear = sc.nextLine();
			int stdYear1 = Integer.parseInt(stdYear);
			
			System.out.println("주소 입력 : ");
			String stdAddress = sc.nextLine();
			
			System.out.println("생일 입력 : ");
			String stdBirthDay = sc.nextLine();
			
			System.out.println("dpt 입력 : ");
			String dptNo = sc.nextLine();
			
			StudentDTO dto = new StudentDTO(stdNo,stdName,stdYear1,
					stdAddress,stdBirthDay,dptNo);
			dao.insertproduct(dto);
			break;
		
			
		case "2": dao.selectStudent();
			break;
			
			
		case "3": 
			
			System.out.println("학번 입력 : ");
			String stdNo1 = sc.nextLine();
			
			System.out.println("이름 입력 : ");
			String stdName1 = sc.nextLine();
			
			System.out.println("학년 입력 : ");
			String stdYear3 = sc.nextLine();
			int stdYear2 = Integer.parseInt(stdYear3);
			
			System.out.println("주소 입력 : ");
			String stdAddress1 = sc.nextLine();
			
			System.out.println("생일 입력 : ");
			String stdBirthDay1 = sc.nextLine();
			
			System.out.println("dpt 입력 : ");
			String dptNo1 = sc.nextLine();
			
			StudentDTO dto1 = new StudentDTO(stdNo1,stdName1,stdYear2,
					stdAddress1,stdBirthDay1,dptNo1);
			
			dao.updateStudent(dto1);
			break;
			
			
		case "4": 
			System.out.print("삭제할 학생번호 입력 : ");
			String stdNo4 = sc.nextLine();	
			
			StudentDTO dto4 = new StudentDTO(stdNo4);			
			dao.deleteStudent(dto4);
			break;
			
		case "": 
			System.out.println("프로그램종료");
			System.exit(0);
			break;
		}
		
		
	}

}
