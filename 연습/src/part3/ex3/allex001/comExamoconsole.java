package part3.ex3.allex001;

import java.util.Scanner;

public class comExamoconsole extends Examoconsole {

	
	@Override
	public void inputo() {
		super.inputo();
		Scanner scan = new Scanner(System.in);
		System.out.println("��ǻ��> ");
		int com = scan.nextInt();
		
		comExamo exam = (comExamo)getExam();
		exam.setCom(com);
	}
	
	protected void onprinto() {
		comExamo exam = (comExamo)getExam();
		System.out.println("��ǻ�� : " + exam.getCom());
	}

}
