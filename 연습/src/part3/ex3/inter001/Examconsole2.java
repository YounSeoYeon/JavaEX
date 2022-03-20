package part3.ex3.inter001;

import java.util.Scanner;

import Alonexerinter01.Banner;

public class Examconsole2 {
	
	private Exam2 exam;
	private doking doke;
	
	public void setdoking(doking doke) {
		this.doke=doke;
	}
	
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
		
		if(doke!=null)
	    	  doke.oninput2(exam);
		
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
	}
	public void print2(Banners banner) {
		if(banner != null)
			banner.abs();
		else {
			System.out.println("과목출력");
		}
		System.out.println("국어 > " + exam.getKor());
		System.out.println("영어 > " + exam.getEng());
		System.out.println("수학 > " + exam.getMath());
		
		if(doke!=null)
	    	  doke.onprint2(exam);
		
		System.out.println("총합 > " + exam.total2());
		System.out.println("평균 > " + exam.avg2());
	}
	
}
