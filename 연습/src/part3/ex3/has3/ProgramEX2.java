package part3.ex3.has3;

import java.io.IOException;
import java.util.Scanner;

public class ProgramEX2 {

	public static void main(String[] args) throws IOException {
		
		//입력,출력,읽기,저장,종료
		//국어,영어,수학
		//입출력/콘솔 // 읽기,저장,토탈,평균 // 메뉴,종료
		
		Exam1 exam = new Exam1();
		ConsoleEx console = new ConsoleEx();
		console.setExam1(exam); // 결합형이라서!! - 제품.연결(부품) 이런구조임
		
		while(true) {
			
			int menu = inputmenu1();

			switch(menu) {
			
			case 1 : console.inputt();
			break;
			
			case 2 : console.printt();
			break;
			
			case 3: exam.loadd();
			break;
			
			case 4 : exam.savee();
			break;
			
			case 5 : exitpro();
			break;
				
			}
		}

	}

	private static void exitpro() {
		
		System.out.println("bye~");
		System.exit(0);		
	}

	private static int inputmenu1() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1.입력");
		System.out.println("2.출력");
		System.out.println("3.읽기");
		System.out.println("4.저장");
		System.out.println("5.종료");
		System.out.println();
		System.out.println("메뉴를 입력하시오 > ");
		
		int x_ = Integer.parseInt(scan.nextLine());		
		return x_;
	}

}
