package part3.ex3.inter001;

import java.io.IOException;
import java.util.Scanner;

public class pro02 {

	public static void main(String[] args) throws IOException {
		
		comExam2 exam = new comExam2(); // Ŭ����-��ü����
		Examconsole2 console = new Examconsole2();
		console.setExam2(exam);
		console.setdoking(new doking() {
			
			@Override
			public void onprint2(Exam2 exam1) {
				System.out.println("��ǻ�� > " + exam.getCom());
			}
			
			@Override
			public void oninput2(Exam2 exam1) {
				Scanner scan = new Scanner(System.in);
				System.out.println("��ǻ�� > ");
				int com = scan.nextInt();					
				exam.setCom(com);
			}
		});
		
		console.input2();
		console.print2(()->{
				System.out.println("�߰��� �������");			
		});

	}
	
}
