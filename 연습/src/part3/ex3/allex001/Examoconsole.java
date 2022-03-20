package part3.ex3.allex001;

import java.util.Scanner;

public abstract class Examoconsole {
	
	// Examo를 상속받아야함. 부품으로. 부품끼워넣어야함
	// 클래스는 변수를 정의한것.
	
	private Examo exam;
	
//	public Examoconsole() {
//		this.exam = new Examo();
//	}
//	
//	public Examoconsole(Examo exam) {
//		this.exam = new Examo();
//	}

	public Examoconsole(){}
	
	public Examoconsole(Examo exam) {
		this.exam=exam;
	}
	
	public void inputo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("국어> ");
		int kor = scan.nextInt();
		System.out.println("영어> ");
		int eng = scan.nextInt();
		System.out.println("수학> ");
		int math = scan.nextInt();
		
		this.exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
	}

	public void printo() {
		System.out.println("국어 : " + this.exam.getKor());
		System.out.println("영어 : " + exam.getEng());
		System.out.println("수학 : " + exam.getMath());
		
		onprinto();
		
		int total = this.exam.totalle();
		double avg = this.exam.avggo();
		System.out.println("총점 :" + total);
		
	}

	protected abstract void onprinto();

	public Examo getExam() {
		return exam;
	}

	public void setExam(Examo exam) {
		this.exam = exam;
	}
	
	
	
	

}
