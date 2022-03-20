package 수업;

import java.util.Scanner;

public class 로그인2단계 {

	public static void main(String[] args) {
		
		/*
		 * # 로그인[2단계]
		 * 
		 * 1. Id와 Pw를 입력받아 회원가입을 진행한다.
		 * 2. 이후 로그인을 위해 다시 Id와 Pw를 입력받는다.
		 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
		 * 예) 로그인 성공 or 로그인 실패
		 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("회원가입하세요");
		System.out.println("아이디 : ");
		int ID = sc.nextInt();
		
		System.out.println("비번 : ");
		int pass = sc.nextInt();
		
		System.out.println("회원가입완료");
		System.out.println("====로그인하세요====");
		
		System.out.println("아이디는 ? : ");		
		int a = sc.nextInt();
		
		System.out.println("비밀번호는 ? :");
		int b = sc.nextInt();
				
		if((ID == a)&&(pass==b)) {
			System.out.println("로그인성공");
		}
		else {
			System.out.println("로그인실패");
		}
		

	}

}
