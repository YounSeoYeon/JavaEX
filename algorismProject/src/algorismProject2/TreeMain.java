package algorismProject2;

import java.util.Scanner;

public class TreeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("(1) 상품등록 (2) 상품삭제 (3) 상품검색 (4) 전체상품조회 (5) 종료");
		System.out.print("메뉴 선택 : ");
		int menu = sc.nextInt();
		BinaryTree<Integer,String> tree = new BinaryTree<Integer,String>();
		
		switch (menu) {
		case 1 : 
			break;
		case 2 : 
			break;
		case 3 : 
			break;
		case 4 : 
			break;
		case 5 :
			System.out.println("종료");
			System.exit(0);
			break;
		}
		
		sc.close();
	}

}
