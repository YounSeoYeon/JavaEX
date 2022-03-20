package part3.ex6.abst.iface.copy2;

import java.util.Scanner;
public class Examconsole {
   
	private Consolelistener listener;
	public void setlistener(Consolelistener listener) {
		this.listener = listener;
	}
	
	private BannerPrinter bannerprinter;
	public void setbanner(BannerPrinter bannerprinter) {
		this.bannerprinter = bannerprinter;
	}
	

   private Exam exam;
   
   public Examconsole() {
   }   
            
   public Examconsole(Exam exam) {
      this.exam = exam;
   }

   public Exam getExam() {
	return exam;
}

   public void setExam(Exam exam) {
      this.exam = exam;
   }

   public void print(BannerPrinter bannerprinter) {
	   
	   if(bannerprinter != null)
		   bannerprinter.print();

		System.out.println("��������������������������������������������������������������������������");
		System.out.println("��              ���� ���              ��");
		System.out.println("��������������������������������������������������������������������������");

		System.out.println("���� : " + exam.getKor());
		System.out.println("���� : " + exam.getEng());
		System.out.println("���� : " + exam.getMath());
      
      if(listener != null)
    	  listener.onprint(exam);
                  
      int total = this.exam.total();
      double avg = this.exam.avg();
      System.out.println("���� :" + total);
      System.out.printf("��� : %.2f\n", avg);
   }

   public void input() {
      Scanner scan = new Scanner(System.in);

      System.out.println("��������������������������������������������������������������������������");
      System.out.println("��              ���� �Է�              ��");
      System.out.println("��������������������������������������������������������������������������");

      System.out.println("���� >");
      int kor = scan.nextInt();
      System.out.println("���� >");
      int eng = scan.nextInt();
      System.out.println("���� >");
      int math = scan.nextInt();
      
      if(listener != null)
    	  listener.oninput(exam);
            
      exam.setKor(kor);
      exam.setEng(eng);
      exam.setMath(math);
      scan.close();
		}
}