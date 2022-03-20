package db7오류;

import java.util.Scanner;

public class Dbmain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---학과정보---");
		System.out.println("1. 학과정보입력");
		System.out.println("2. 학과정보조회");
		System.out.println("3. 학과정보수정");
		System.out.println("4. 학과정보삭제");
		System.out.println("5. 종료");
		System.out.println("-----------");
		System.out.println("메뉴를 입력하세요 > ");
		
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
			System.out.println("종료");
			System.exit(0);
			break;
		}
		
		sc.close();
	}

}
