package part3.ex4.is;

import java.util.Scanner;

public class Examconsole {
	
	// Exam��ü exam�� ������ּ���
	private Exam exam;
	
	public Examconsole() {
		//1.�������� has a 
		//this.exam=new Exam(); // ��ü����� ������Ʈ���ֵ���!
	}
	
	// 1. ���ÿ��̼� has a
	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public void input() {
		
		// this�� ��������, ���������� �Ἥ �浹����쿡�� �� ���ٰ�
	      
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.println("��������������������������������������������������������������������������");
	      System.out.println("��              ���� ���              ��");
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

	public void print() {
	      
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.println("��������������������������������������������������������������������������");
	      System.out.println("��              ���� ���              ��");
	      System.out.println("��������������������������������������������������������������������������");
	      System.out.println("���� : " + this.exam.getKor());
	      System.out.println("���� : " + exam.getEng());
	      System.out.println("���� : " + exam.getMath());

	      int total = this.exam.total();
	      double avg = this.exam.avg();
	      System.out.println("���� :" + total);
	      System.out.printf("��� : %.2f\n", avg);
	   }
	
	
}
