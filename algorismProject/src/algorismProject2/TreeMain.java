package algorismProject2;

import java.util.Scanner;

public class TreeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("(1) ��ǰ��� (2) ��ǰ���� (3) ��ǰ�˻� (4) ��ü��ǰ��ȸ (5) ����");
		System.out.print("�޴� ���� : ");
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
			System.out.println("����");
			System.exit(0);
			break;
		}
		
		sc.close();
	}

}
