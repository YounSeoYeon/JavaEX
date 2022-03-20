package part3.ex3.has3;

import java.util.Scanner;

public class ConsoleEx {
	
	private Exam1 exam; // 상속
	
	// composition has a 상속 // 일체형
	// association has a 상속 // 결합형

//	public ConsoleEx() {
//		this.exam = new Exam1();
//	}
//	
	
	public void setExam1(Exam1 a) {
		this.exam = a;
	}

	public void inputt() {
		Scanner scan = new Scanner(System.in);
		
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

	public void printt() {
		System.out.println("국어 > "+exam.getKor());
		System.out.println("영어 > "+exam.getEng());
		System.out.println("수학 > "+exam.getMath());
		System.out.println("총점 > "+exam.totall());
		System.out.println("평균 > "+exam.avgg());
	}

}
