package part3.ex3.allex001;

import java.io.IOException;
import java.util.Scanner;

public class Pro001 {

	public static void main(String[] args) throws IOException {
		
		comExamo exam = new comExamo();
//		Examoconsole console = new Examoconsole(exam); // ��������
		//console.setExamo(exam); // ���ÿ��̼�
		
		comExamoconsole console = new comExamoconsole();
		console.setExam(exam);
		
		console.inputo();
		console.printo();
		
		
//
//		while(true) {
//			int menu=inputmenuoo();
//			
//			switch(menu) {
//			case 1: console.inputo();
//			break;
//			
//			case 2: console.printo();
//			break;
//			
//			case 3: exam.loado();
//			break;
//			
//			case 4: exam.saveo();
//			break;
//			
//			case 5: exitPro();
//			break;
//			}
//			
//			
//		}
//	
//	}
//
//	private static void exitPro() {
//		System.out.println("Bye~~");
//	    System.exit(0);
//	}
//
//	private static int inputmenuoo() {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�޴��Է�>");
//		
//		int x=0;
//		x=scan.nextInt();
//		return x;
	}

}
