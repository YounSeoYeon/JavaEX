package db06;

import java.util.Scanner;

public class productinsert {

	public void insert() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("제품 정보 등록");
		System.out.println("제품번호 입력 : ");
		String a = sc.nextLine();
		
		System.out.println("제품이름 입력 : ");
		String b = sc.nextLine();
		
		System.out.println("가격 입력 : ");
		String c = sc.nextLine();
		int c1 = Integer.parseInt(c);
		
		System.out.println("제조사 입력 : ");
		String d = sc.nextLine();
		
		System.out.println("제품색깔 입력 : ");
		String f = sc.nextLine();
		
		System.out.println("재고 입력 : ");
		String g = sc.nextLine();
		int g1 = Integer.parseInt(g);
		
		productDTO dto = new productDTO(a,b,c1,d,f,g1);
		productDAO da = new productDAO();
		da.prinsert(dto);
		
		sc.close();
	}
}
