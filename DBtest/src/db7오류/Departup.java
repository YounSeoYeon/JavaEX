package db7����;

import java.util.Scanner;

public class Departup {
	
	public Departup() {
	}

	public void updat() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �а������Է�");
		
		System.out.print("����");
		String dptNo = sc.nextLine();
		int dptNo1 = Integer.parseInt(dptNo);
		
		System.out.print("�а���");
		String dptName = sc.nextLine();
		
		System.out.print("��ȭ��ȣ");
		String dptTel = sc.nextLine();
		
		DepartDAO da = new DepartDAO();
		DepartDTO dt = new DepartDTO(dptNo1,dptName,dptTel);
		da.upd(dt);
		
		sc.close();
	}

}
