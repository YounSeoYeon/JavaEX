package part3.ex3.allex002;

import java.util.Scanner;

public class comExamconsole2 extends Examconsole2 {
	
	public void input2() {
		super.input2();
		Scanner scan = new Scanner(System.in);
		System.out.println("컴퓨터 > ");
		int com = scan.nextInt();	
		
		comExam2 exam = (comExam2) getExam(); // 이부분 이해가 안됨...ㅜㅜ
		exam.setCom(com);
	}
	
	protected void onprint() {
		comExam2 exam = (comExam2) getExam();
		System.out.println("컴퓨터 > " + exam.getCom());
	}
	
	

}
