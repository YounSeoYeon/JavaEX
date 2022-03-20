package db03;

import java.util.Scanner;

public class studentEx {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		studentDAO stdDAO = new studentDAO();
//		
//		System.out.println("학생 정보 등록");
//		System.out.println("학번 입력 : ");
//		String a = sc.nextLine();
//		
//		System.out.println("성명 입력 : ");
//		String b = sc.nextLine();
//		
//		System.out.println("학년 입력 : ");
//		String c = sc.nextLine();
//		int c1 = Integer.parseInt(c);
//		
//		System.out.println("주소 입력 : ");
//		String d = sc.nextLine();
//		
//		System.out.println("생년월일 입력 : ");
//		String f = sc.nextLine();
//		
//		System.out.println("학과번호 입력 : ");
//		String g = sc.nextLine();		
//		
//		studentDTO dto = new studentDTO(a,b,c1,d,f,g);		
//
//		stdDAO.insertStudent(dto);				
		stdDAO.selectStudent();
		stdDAO.select();
		
	}

}
