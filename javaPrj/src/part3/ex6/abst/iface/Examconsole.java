package part3.ex6.abst.iface;

import java.util.Scanner;
public class Examconsole {
   
  
	private Consolelistener listener;
	public void setlistener (Consolelistener listener) {
		this.listener = listener;
	}
	
	
	
	
	// Exam 객체 exam을 has a 상속해주세요.
   private Exam exam;
   
   public Examconsole() {
      // 1. Composition Has A 관계
      // this.exam = new Exam();
   }   
            
   public Examconsole(Exam exam) {
      this.exam = exam;
   }

   public Exam getExam() {
	return exam;
}

// 1. Association Has A 관계
   public void setExam(Exam exam) {
      this.exam = exam;
   }

   public void print(BannerPrinter bannerPrinter) {

      Scanner scan = new Scanner(System.in);
      
      if(bannerPrinter != null)
    	  bannerPrinter.print();
      else {
	      System.out.println("┌───────────────────────────────────┐");
	      System.out.println("│              성적 출력              │");
	      System.out.println("└───────────────────────────────────┘");
	   }    
      System.out.println("국어 : " + exam.getKor());
      System.out.println("영어 : " + exam.getEng());
      System.out.println("수학 : " + exam.getMath());
      
      if(listener!=null)
    	  listener.onprint(exam);  
      
      // 인터페이스 호출부분. 호출할때는 exam 사용하는거 전달하는 방법으로
     // 정의,구현부분에 exam전달받아서 호출할때도 전달 받아야함
      
      int total = this.exam.total();
      double avg = this.exam.avg();
      System.out.println("총점 :" + total);
      System.out.printf("평균 : %.2f\n", avg);
   }

   public void input() {
      Scanner scan = new Scanner(System.in);

      System.out.println("┌───────────────────────────────────┐");
      System.out.println("│              성적 입력              │");
      System.out.println("└───────────────────────────────────┘");

      System.out.println("국어 >");
      int kor = scan.nextInt();
      System.out.println("영어 >");
      int eng = scan.nextInt();
      System.out.println("수학 >");
      int math = scan.nextInt();
      
      if(listener!=null)
    	  listener.oninput(exam);
      
      exam.setKor(kor);
      exam.setEng(eng);
      exam.setMath(math);
		}
}