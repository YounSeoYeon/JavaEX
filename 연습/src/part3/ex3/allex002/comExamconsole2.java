package part3.ex3.allex002;

import java.util.Scanner;

public class comExamconsole2 extends Examconsole2 {
	
	public void input2() {
		super.input2();
		Scanner scan = new Scanner(System.in);
		System.out.println("��ǻ�� > ");
		int com = scan.nextInt();	
		
		comExam2 exam = (comExam2) getExam(); // �̺κ� ���ذ� �ȵ�...�̤�
		exam.setCom(com);
	}
	
	protected void onprint() {
		comExam2 exam = (comExam2) getExam();
		System.out.println("��ǻ�� > " + exam.getCom());
	}
	
	

}
