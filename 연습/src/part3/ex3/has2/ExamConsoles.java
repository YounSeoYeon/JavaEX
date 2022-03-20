package part3.ex3.has2;

import java.util.Scanner;

public class ExamConsoles {
	
	private Exams examx; // 상속 이거만 하면 널포인트
	
	public ExamConsoles() {
		this.examx = new Exams(); // 일체형상속
	}

	public void inputs() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("┌───────────────────────────────────┐");
		System.out.println("│              성적 입력              │");
		System.out.println("└───────────────────────────────────┘");
		
		System.out.println("국어 > ");
		int kor = scan.nextInt();
		System.out.println("영어 > ");
		int eng = scan.nextInt();
		System.out.println("수학 > ");
		int math = scan.nextInt();
		
		examx.setKor(kor);
		examx.setEng(eng);
		examx.setMath(math);
	}

	public void prints() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("┌───────────────────────────────────┐");
		System.out.println("│              성적 출력              │");
		System.out.println("└───────────────────────────────────┘");	
		
		System.out.println("국어 : "+this.examx.getKor());
		System.out.println("영어 : "+this.examx.getEng());
		System.out.println("수학 : "+this.examx.getMath());
		
		int total = this.examx.total();
		double avg = examx.avg();
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
	}
	
	
	
	

}
