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
		System.out.println("�����Է�");
		System.out.println("���� > ");
		int kor = scan.nextInt();
		System.out.println("���� > ");
		int eng = scan.nextInt();
		System.out.println("���� > ");
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
			System.out.println("�������");
		}
		System.out.println("���� > " + exam.getKor());
		System.out.println("���� > " + exam.getEng());
		System.out.println("���� > " + exam.getMath());
		
		if(doke!=null)
	    	  doke.onprint2(exam);
		
		System.out.println("���� > " + exam.total2());
		System.out.println("��� > " + exam.avg2());
	}
	
}
