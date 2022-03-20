package part3.ex6.abst.iface;

import java.util.Scanner;
public class Examconsole {
   
  
	private Consolelistener listener;
	public void setlistener (Consolelistener listener) {
		this.listener = listener;
	}
	
	
	
	
	// Exam ��ü exam�� has a ������ּ���.
   private Exam exam;
   
   public Examconsole() {
      // 1. Composition Has A ����
      // this.exam = new Exam();
   }   
            
   public Examconsole(Exam exam) {
      this.exam = exam;
   }

   public Exam getExam() {
	return exam;
}

// 1. Association Has A ����
   public void setExam(Exam exam) {
      this.exam = exam;
   }

   public void print(BannerPrinter bannerPrinter) {

      Scanner scan = new Scanner(System.in);
      
      if(bannerPrinter != null)
    	  bannerPrinter.print();
      else {
	      System.out.println("��������������������������������������������������������������������������");
	      System.out.println("��              ���� ���              ��");
	      System.out.println("��������������������������������������������������������������������������");
	   }    
      System.out.println("���� : " + exam.getKor());
      System.out.println("���� : " + exam.getEng());
      System.out.println("���� : " + exam.getMath());
      
      if(listener!=null)
    	  listener.onprint(exam);  
      
      // �������̽� ȣ��κ�. ȣ���Ҷ��� exam ����ϴ°� �����ϴ� �������
     // ����,�����κп� exam���޹޾Ƽ� ȣ���Ҷ��� ���� �޾ƾ���
      
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
      
      if(listener!=null)
    	  listener.oninput(exam);
      
      exam.setKor(kor);
      exam.setEng(eng);
      exam.setMath(math);
		}
}