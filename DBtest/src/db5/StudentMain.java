package db5;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentDAO dao = new StudentDAO();
		
		System.out.println("�л� ���� ���α׷�");
		System.out.println("-----------------");
		System.out.println("1.�л����");
		System.out.println("2.�л�������ȸ");
		System.out.println("3.�л���������");
		System.out.println("4.�л���������");
		System.out.println("5.����");
		System.out.println("-----------------");
		System.out.print("�޴���ȣ�Է� : ");
		
		String menu = sc.nextLine();
		System.out.println();
		
		switch(menu) {
		case "1":
			System.out.println("�����Է�");
			System.out.println("�й� �Է� : ");
			String stdNo = sc.nextLine();
			
			System.out.println("�̸� �Է� : ");
			String stdName = sc.nextLine();
			
			System.out.println("�г� �Է� : ");
			String stdYear = sc.nextLine();
			int stdYear1 = Integer.parseInt(stdYear);
			
			System.out.println("�ּ� �Է� : ");
			String stdAddress = sc.nextLine();
			
			System.out.println("���� �Է� : ");
			String stdBirthDay = sc.nextLine();
			
			System.out.println("dpt �Է� : ");
			String dptNo = sc.nextLine();
			
			StudentDTO dto = new StudentDTO(stdNo,stdName,stdYear1,
					stdAddress,stdBirthDay,dptNo);
			dao.insertproduct(dto);
			break;
		
			
		case "2": dao.selectStudent();
			break;
			
			
		case "3": 
			
			System.out.println("�й� �Է� : ");
			String stdNo1 = sc.nextLine();
			
			System.out.println("�̸� �Է� : ");
			String stdName1 = sc.nextLine();
			
			System.out.println("�г� �Է� : ");
			String stdYear3 = sc.nextLine();
			int stdYear2 = Integer.parseInt(stdYear3);
			
			System.out.println("�ּ� �Է� : ");
			String stdAddress1 = sc.nextLine();
			
			System.out.println("���� �Է� : ");
			String stdBirthDay1 = sc.nextLine();
			
			System.out.println("dpt �Է� : ");
			String dptNo1 = sc.nextLine();
			
			StudentDTO dto1 = new StudentDTO(stdNo1,stdName1,stdYear2,
					stdAddress1,stdBirthDay1,dptNo1);
			
			dao.updateStudent(dto1);
			break;
			
			
		case "4": 
			System.out.print("������ �л���ȣ �Է� : ");
			String stdNo4 = sc.nextLine();	
			
			StudentDTO dto4 = new StudentDTO(stdNo4);			
			dao.deleteStudent(dto4);
			break;
			
		case "": 
			System.out.println("���α׷�����");
			System.exit(0);
			break;
		}
		
		
	}

}
