package part3.ex3.has3;

import java.io.IOException;
import java.util.Scanner;

public class ProgramEX2 {

	public static void main(String[] args) throws IOException {
		
		//�Է�,���,�б�,����,����
		//����,����,����
		//�����/�ܼ� // �б�,����,��Ż,��� // �޴�,����
		
		Exam1 exam = new Exam1();
		ConsoleEx console = new ConsoleEx();
		console.setExam1(exam); // �������̶�!! - ��ǰ.����(��ǰ) �̷�������
		
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
		
		System.out.println("1.�Է�");
		System.out.println("2.���");
		System.out.println("3.�б�");
		System.out.println("4.����");
		System.out.println("5.����");
		System.out.println();
		System.out.println("�޴��� �Է��Ͻÿ� > ");
		
		int x_ = Integer.parseInt(scan.nextLine());		
		return x_;
	}

}
