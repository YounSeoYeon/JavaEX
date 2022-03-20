package part3.ex3.has2;

import java.io.IOException;
import java.util.Scanner;

public class ProgramEX {

	public static void main(String[] args) throws IOException {
		// 입력,출력,읽기,저장,종료
		Exams exam = new Exams(); // kor,eng,math
		ExamConsoles console = new ExamConsoles(); // input,print

		while (true) {

			int menu = inputmenus();
			
			switch(menu) {
			case 1:
				console.inputs();
				break;
			case 2:
				console.prints();
				break;
			case 3:
				exam.loads();
				break;
			case 4:
				exam.saves();
				break;
			case 5:
				 exitPrograms();
				 break;
			}

		}
	}

	private static void exitPrograms() {
		System.out.println("bye~~");
		System.exit(0);
	}

	private static int inputmenus() {
		Scanner scan = new Scanner(System.in);

		int menu = 0;

		System.out.println("┌────────────────────────────────┐");
		System.out.println("│      성적관리 Main Menu          │");
		System.out.println("└────────────────────────────────┘");
		System.out.println("1. 입력");
		System.out.println("2. 출력");
		System.out.println("3. 읽기");
		System.out.println("4. 저장");
		System.out.println("5. 종료");
		System.out.print(">");
		menu = scan.nextInt();

		return menu;
	}

}
