package ��Ӵ������ǽ�;

import java.io.IOException;
import java.util.Scanner;

public class ���� {

	public static void main(String[] args) throws IOException {
		// ���������Ÿ� (�ػ����) �������� ������ �����ؼ� �����ؼ� ���Ͽ� ����
		// (name)/type/number/typeconsole
		
		Type type = new Type();
		Typeconsole console = new Typeconsole();
		console.setType(type);
		
		while(true) {
			int menu = inputmenu();
			switch(menu) {
			case 1 : console.input();
				break;
			case 2 : console.print();
				break;
			case 3 : type.save();
				break;
			case 4 : exit();
				break;				
			}
		}
		
		
	}

	private static void exit() {
		System.out.println("����");
		System.exit(0);
	}

	private static int inputmenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������,����Ȯ��");
		System.out.println("�����Է� : 1 ");
		System.out.println("������� : 2 ");
		System.out.println("�������� : 3 ");
		System.out.println("���� : 4 ");
		System.out.println("���� > ");
		
		int menu = sc.nextInt();
		return menu;
	}

}
