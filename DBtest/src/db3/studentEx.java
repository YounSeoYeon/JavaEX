package db3;

import java.util.Scanner;

public class studentEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// DAO ��ü �����ϸ鼭 DB ���� 
		// ��ü ������ �� ������ ȣ��Ǹ鼭 DB ����
		studentDAO stdDAO = new studentDAO();
		
		// (1)�л� ������ �Է�
		System.out.println("�л� ���� ���");
		System.out.println("�й� �Է� : ");
		String a = sc.nextLine();
		
		System.out.println("���� �Է� : ");
		String b = sc.nextLine();
		
		System.out.println("�г� �Է� : ");
		String c = sc.nextLine();
		int c1 = Integer.parseInt(c);
		
		System.out.println("�ּ� �Է� : ");
		String d = sc.nextLine();
		
		System.out.println("������� �Է� : ");
		String f = sc.nextLine();
		
		System.out.println("�а���ȣ �Է� : ");
		String g = sc.nextLine();
		
		
		//studentDTO ��ü����		
		//������ ���ÿ� ������ : ������ ȣ���ϸ鼭 �� ����
		studentDTO dto = new studentDTO(a,b,c1,d,f,g);		

		//studentDAO Ŭ������ insertstudent()�޼��� ȣ���ϸ鼭 stdDTO����
		stdDAO.insertStudent(dto);		
		
		// (2)�л� ���� ��ȸ : StudentDAO Ŭ������ selectStudent() �޼��� ȣ��
		//��ü.�޼���
		stdDAO.selectStudent();
	}

}
