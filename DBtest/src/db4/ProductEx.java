package db4;

import java.util.Scanner;

public class ProductEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductDAO dao = new ProductDAO();
		
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
		
		ProductDTO dto = new ProductDTO(a,b,c1,d,f,g1);
		dao.insertproduct(dto);
		dao.selectproduct();
		
		sc.close();
		
	}

}
