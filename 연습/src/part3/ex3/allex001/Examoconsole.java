package part3.ex3.allex001;

import java.util.Scanner;

public abstract class Examoconsole {
	
	// Examo�� ��ӹ޾ƾ���. ��ǰ����. ��ǰ�����־����
	// Ŭ������ ������ �����Ѱ�.
	
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
		System.out.println("����> ");
		int kor = scan.nextInt();
		System.out.println("����> ");
		int eng = scan.nextInt();
		System.out.println("����> ");
		int math = scan.nextInt();
		
		this.exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
	}

	public void printo() {
		System.out.println("���� : " + this.exam.getKor());
		System.out.println("���� : " + exam.getEng());
		System.out.println("���� : " + exam.getMath());
		
		onprinto();
		
		int total = this.exam.totalle();
		double avg = this.exam.avggo();
		System.out.println("���� :" + total);
		
	}

	protected abstract void onprinto();

	public Examo getExam() {
		return exam;
	}

	public void setExam(Examo exam) {
		this.exam = exam;
	}
	
	
	
	

}
