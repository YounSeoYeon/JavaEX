package db06;

import java.util.Scanner;

public class productinsert {

	public void insert() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��ǰ ���� ���");
		System.out.println("��ǰ��ȣ �Է� : ");
		String a = sc.nextLine();
		
		System.out.println("��ǰ�̸� �Է� : ");
		String b = sc.nextLine();
		
		System.out.println("���� �Է� : ");
		String c = sc.nextLine();
		int c1 = Integer.parseInt(c);
		
		System.out.println("������ �Է� : ");
		String d = sc.nextLine();
		
		System.out.println("��ǰ���� �Է� : ");
		String f = sc.nextLine();
		
		System.out.println("��� �Է� : ");
		String g = sc.nextLine();
		int g1 = Integer.parseInt(g);
		
		productDTO dto = new productDTO(a,b,c1,d,f,g1);
		productDAO da = new productDAO();
		da.prinsert(dto);
		
		sc.close();
	}
}
