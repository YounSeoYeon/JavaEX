package part3.ex3.allex002;

import java.io.IOException;
import java.util.Scanner;

public class pro02 {

	public static void main(String[] args) throws IOException {
		
		comExam2 exam = new comExam2(); // Ŭ����-��ü����
		comExamconsole2 console = new comExamconsole2();
		console.setExam2(exam);
		
		console.input2();
		console.print2();
		
//		while (true) {
//			
//			int menu = inputmenu2();
//			
//			switch(menu) {
//				case 1 : console.input2();
//				break;
//				
//				case 2 : console.print2();
//				break;
//				
//				case 3 : exam.load2();
//				break;
//				
//				case 4 : exam.save2();
//				break;
//				
//				case 5 : exit2();
//				break;
//			
//			}
//		}
//
//	}
//
//	private static void exit2() {
//		System.out.println("��");
//		System.exit(0);		
//	}
//
//	private static int inputmenu2() {
//		int menu=0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�޴��Է�>");
//		menu=scan.nextInt();
//		return menu;
//	}


}
	
}
