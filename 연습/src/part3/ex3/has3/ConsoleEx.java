package part3.ex3.has3;

import java.util.Scanner;

public class ConsoleEx {
	
	private Exam1 exam; // ���
	
	// composition has a ��� // ��ü��
	// association has a ��� // ������

//	public ConsoleEx() {
//		this.exam = new Exam1();
//	}
//	
	
	public void setExam1(Exam1 a) {
		this.exam = a;
	}

	public void inputt() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� > ");
		int kor = scan.nextInt();
		System.out.println("���� > ");
		int eng = scan.nextInt();
		System.out.println("���� > ");
		int math = scan.nextInt();
		
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
	}

	public void printt() {
		System.out.println("���� > "+exam.getKor());
		System.out.println("���� > "+exam.getEng());
		System.out.println("���� > "+exam.getMath());
		System.out.println("���� > "+exam.totall());
		System.out.println("��� > "+exam.avgg());
	}

}
