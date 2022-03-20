package 수업;

import java.util.Scanner;

public class 로그인3단계 {

	public static void main(String[] args) {
		
		/*
		 * # 로그인[3단계]
		 * 
		 * 1. Id를 입력받아 dbId와 일치할 경우에만 Pw를 입력할 수 있다.
		 * 2. Id가 틀린 경우, "Id를 확인해주세요"라는 메세지를 출력한다.
		 * 3. Pw가 틀린 경우, "Pw를 확인해주세요"라는 메세지를 출력한다.
		 * 4. Id와 Pw와 모두 일치하는 경우, "로그인 성공"라는 메세지를 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int dbid = 12345;
		int dbpw = 56789;
		
		System.out.println("아이디입력 : ");
		int id = sc.nextInt();
		
		if(dbid == id) {
			System.out.println("아이디확인완료");
			System.out.println("패드워드입력 : ");
			int pw = sc.nextInt();
			if(dbpw == pw) {
				System.out.println("로그인성공");				
			}
			else {
				System.out.println("패스워드확인하세요");
			}
		}
		else {
			System.out.println("아이디확인하세요");
		}
	}

}
