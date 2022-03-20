package part3.ex3.allex002;

import java.util.Scanner;

public abstract class Examconsole2 {
	
	private Exam2 exam;
//	public Examconsole2() {
//		this.exam = new Exam2();
//	}
	
	public Examconsole2() {}
	public void setExam2(Exam2 exam) {
		this.exam = exam;
	}
	
	public Exam2 getExam() {
		return exam;
	}
	
	public void setExam(Exam2 exam) {
		this.exam = exam;
	}
	
	public void input2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("성적입력");
		System.out.println("국어 > ");
		int kor = scan.nextInt();
		System.out.println("영어 > ");
		int eng = scan.nextInt();
		System.out.println("수학 > ");
		int math = scan.nextInt();		
		
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
	}
	public void print2() {
		System.out.println("국어 > " + exam.getKor());
		System.out.println("영어 > " + exam.getEng());
		System.out.println("수학 > " + exam.getMath());
		
		onprint();
		
		System.out.println("총합 > " + exam.total2());
		System.out.println("평균 > " + exam.avg2());
	}
	
	protected abstract void onprint();
	
}
