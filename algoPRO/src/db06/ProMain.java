package db06;

import java.util.Scanner;

public class ProMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�л� ���� ���α׷�");
		System.out.println("-----------------");
		System.out.println("1.��ǰ���");
		System.out.println("2.��ǰ������ȸ");
		System.out.println("3.��ǰ��������");
		System.out.println("4.��ǰ��������");
		System.out.println("5.����");
		System.out.println("-----------------");
		System.out.print("�޴���ȣ�Է� : ");
		
		String menu = sc.nextLine();
		System.out.println();
		
		switch(menu) {
		case "1" : 
			productinsert pi = new productinsert();
			pi.insert();
			break;
			
		case "2" : 
			productselect ps = new productselect();
			ps.select();
			break;
			
		case "3" : 
			productupdate pu = new productupdate();
			pu.update();
			break;
			
		case "4" : 
			productdelete pd = new productdelete();
			pd.delete();
			break;
			
		case "5" : 
			System.out.println("���α׷�����");
			System.exit(0);
			break;
		}
		
		sc.close();
	}

}
