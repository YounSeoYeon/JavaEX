package part3.ex4.is;

import java.util.Scanner;

public class Examconsole {
	
	// Exam객체 exam을 상속해주세요
	private Exam exam;
	
	public Examconsole() {
		//1.컴포지션 has a 
		//this.exam=new Exam(); // 일체형상속 널포인트없애도록!
	}
	
	// 1. 어쏘시에이션 has a
	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public void input() {
		
		// this는 생략가능, 지역변수를 써서 충돌날경우에만 꼭 써줄것
	      
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.println("┌───────────────────────────────────┐");
	      System.out.println("│              성적 출력              │");
	      System.out.println("└───────────────────────────────────┘");
	      
	      System.out.println("국어 >");
	      int kor = scan.nextInt();
	      System.out.println("영어 >");
	      int eng = scan.nextInt();
	      System.out.println("수학 >");
	      int math = scan.nextInt();
	      
	      exam.setKor(kor);
	      exam.setEng(eng);
	      exam.setMath(math);
	      
	   }

	public void print() {
	      
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.println("┌───────────────────────────────────┐");
	      System.out.println("│              성적 출력              │");
	      System.out.println("└───────────────────────────────────┘");
	      System.out.println("국어 : " + this.exam.getKor());
	      System.out.println("영어 : " + exam.getEng());
	      System.out.println("수학 : " + exam.getMath());

	      int total = this.exam.total();
	      double avg = this.exam.avg();
	      System.out.println("총점 :" + total);
	      System.out.printf("평균 : %.2f\n", avg);
	   }
	
	
}
