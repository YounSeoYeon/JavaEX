package db03;

import java.util.Scanner;

public class studentEx {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		studentDAO stdDAO = new studentDAO();
//		
//		System.out.println("�л� ���� ���");
//		System.out.println("�й� �Է� : ");
//		String a = sc.nextLine();
//		
//		System.out.println("���� �Է� : ");
//		String b = sc.nextLine();
//		
//		System.out.println("�г� �Է� : ");
//		String c = sc.nextLine();
//		int c1 = Integer.parseInt(c);
//		
//		System.out.println("�ּ� �Է� : ");
//		String d = sc.nextLine();
//		
//		System.out.println("������� �Է� : ");
//		String f = sc.nextLine();
//		
//		System.out.println("�а���ȣ �Է� : ");
//		String g = sc.nextLine();		
//		
//		studentDTO dto = new studentDTO(a,b,c1,d,f,g);		
//
//		stdDAO.insertStudent(dto);				
		stdDAO.selectStudent();
		stdDAO.select();
		
	}

}
