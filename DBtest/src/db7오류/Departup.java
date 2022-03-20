package db7오류;

import java.util.Scanner;

public class Departup {
	
	public Departup() {
	}

	public void updat() {
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 학과정보입력");
		
		System.out.print("순서");
		String dptNo = sc.nextLine();
		int dptNo1 = Integer.parseInt(dptNo);
		
		System.out.print("학과명");
		String dptName = sc.nextLine();
		
		System.out.print("전화번호");
		String dptTel = sc.nextLine();
		
		DepartDAO da = new DepartDAO();
		DepartDTO dt = new DepartDTO(dptNo1,dptName,dptTel);
		da.upd(dt);
		
		sc.close();
	}

}
