package 상속다형성실습;

import java.io.IOException;
import java.util.Scanner;

public class 메인 {

	public static void main(String[] args) throws IOException {
		// 선물받은거를 (준사람과) 선물종류 갯수로 구별해서 정리해서 파일에 저장
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
		System.out.println("종료");
		System.exit(0);
	}

	private static int inputmenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("선물종류,갯수확인");
		System.out.println("선물입력 : 1 ");
		System.out.println("선물출력 : 2 ");
		System.out.println("선물저장 : 3 ");
		System.out.println("종료 : 4 ");
		System.out.println("선택 > ");
		
		int menu = sc.nextInt();
		return menu;
	}

}
