package db06;

import java.util.Scanner;

public class ProMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 관리 프로그램");
		System.out.println("-----------------");
		System.out.println("1.제품등록");
		System.out.println("2.제품정보조회");
		System.out.println("3.제품정보수정");
		System.out.println("4.제품정보삭제");
		System.out.println("5.종료");
		System.out.println("-----------------");
		System.out.print("메뉴번호입력 : ");
		
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
			System.out.println("프로그램종료");
			System.exit(0);
			break;
		}
		
		sc.close();
	}

}
