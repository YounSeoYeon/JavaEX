package db7����;

import java.util.Scanner;

public class Dbmain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---�а�����---");
		System.out.println("1. �а������Է�");
		System.out.println("2. �а�������ȸ");
		System.out.println("3. �а���������");
		System.out.println("4. �а���������");
		System.out.println("5. ����");
		System.out.println("-----------");
		System.out.println("�޴��� �Է��ϼ��� > ");
		
		String menu = sc.nextLine();
		
		switch(menu) {
		case "1":
			Departinsert di = new Departinsert();
			di.insert();
			break;
			
		case "2":
			Departsel ds = new Departsel();
			ds.select();
			break;
			
		case "3":
			Departup du = new Departup();
			du.updat();
			break;
			
		case "4":
			Departdel dd = new Departdel();
			dd.delet();
			break;
			
		case "5": 
			System.out.println("����");
			System.exit(0);
			break;
		}
		
		sc.close();
	}

}
