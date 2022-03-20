package db7오류;

import java.util.Scanner;

public class Departinsert {
	
	public Departinsert() {
	}

	public void insert() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학과정보입력");
		System.out.print("순서");
		String dptNo = sc.nextLine();
		int dptNo1 = Integer.parseInt(dptNo);
		System.out.print("학과명");
		String dptName = sc.nextLine();
		System.out.print("전화번호");
		String dptTel = sc.nextLine();
		
		DepartDTO dt = new DepartDTO(dptNo1, dptName, dptTel);
		DepartDAO da = new DepartDAO();
		da.dinsert(dt);
		
		sc.close();
	}

}
