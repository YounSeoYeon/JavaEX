package part3.ex5.abst.ui;

import java.util.Scanner;

import part3.ex5.abst.entity.Exam;

public abstract class Examconsole {
   
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

   public void print() {

      Scanner scan = new Scanner(System.in);

      System.out.println("��������������������������������������������������������������������������");
      System.out.println("��              ���� ���              ��");
      System.out.println("��������������������������������������������������������������������������");
      System.out.println("���� : " + exam.getKor());
      System.out.println("���� : " + exam.getEng());
      System.out.println("���� : " + exam.getMath());
      
      onprint();
      
      
      int total = this.exam.total();
      double avg = this.exam.avg();
      System.out.println("���� :" + total);
      System.out.printf("��� : %.2f\n", avg);
   }


   protected abstract void onprint();

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
      
      exam.setKor(kor);
      exam.setEng(eng);
      exam.setMath(math);
		}
}